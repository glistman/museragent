package com.github.glistman.museragent;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserAgentParser {

    private final Pattern deviceInformationPattern = Pattern.compile("^(?:\\w+)(/[\\w\\.]+)?\\s\\((?<deviceData>.*?)\\).*");

    private final static Pattern deviceDataPattern = Pattern.compile("^(?<type>[^;]*)\\s*(?:;\\s*U)?;(?:(?<os>[^;\\d]+)(?<osVersion>\\d+(?:[._]\\d+)*)?);(?<device>[^;]+)");

    private final Pattern applePattern = Pattern.compile("(iphone|ipad|macintosh)", Pattern.CASE_INSENSITIVE);

    private final Vendor vendor = new Vendor();

    public UserAgent parse(String userAgentRaw) {
        Matcher deviceInformationMatcher = deviceInformationPattern.matcher(userAgentRaw);
        UserAgent userAgent;

        if (deviceInformationMatcher.find()) {
            userAgent = parseMobileUserAgent(deviceInformationMatcher.group("deviceData"), userAgentRaw);
        } else {
            userAgent = new UserAgent(userAgentRaw);
        }

        return userAgent;
    }

    private UserAgent parseMobileUserAgent(String deviceData, String userAgentRaw) {
        Matcher deviceDataMatcher = deviceDataPattern.matcher(deviceData);
        UserAgent userAgent;

        if (deviceDataMatcher.find()) {
            String device = deviceDataMatcher.group("device");
            String type = deviceDataMatcher.group("type");
            userAgent = new UserAgent(
                    deviceDataMatcher.group("os"),
                    deviceDataMatcher.group("osVersion"),
                    parseDeviceManufacturer(device, type),
                    parseDevice(device, type),
                    userAgentRaw);
        } else {
            userAgent = new UserAgent(userAgentRaw);
        }

        return userAgent;
    }

    private String parseDevice(String device, String type) {
        String deviceName = device;

        if (applePattern.matcher(type).find()) {
            deviceName = type;
        }

        return deviceName;
    }

    private String parseDeviceManufacturer(String device, String type) {
        String manufacturer;

        if (applePattern.matcher(type).find()) {
            manufacturer = "Apple";
        } else {
            manufacturer = vendor.findVendor(device).orElse("Unknown");
        }

        return manufacturer;
    }

}