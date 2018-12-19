package com.github.glistman.museragent;

public class UserAgent {

    private final String operatingSystem;

    private final String operatingSystemVersion;

    private final String deviceVendor;

    private final String deviceModel;

    private final boolean mobile;

    private final String userAgentRaw;

    UserAgent(String operatingSystem, String operatingSystemVersion, String deviceVendor, String deviceModel, String userAgentRaw) {
        this.operatingSystem = trim(operatingSystem);
        this.operatingSystemVersion = trim(operatingSystemVersion);
        this.deviceVendor = deviceVendor;
        this.deviceModel = trim(deviceModel);
        this.userAgentRaw = userAgentRaw;
        this.mobile = true;
    }

    UserAgent(String userAgentRaw) {
        this.operatingSystem = null;
        this.operatingSystemVersion = null;
        this.deviceVendor = null;
        this.deviceModel = null;
        this.userAgentRaw = userAgentRaw;
        this.mobile = false;
    }

    private String trim(String string) {
        return (string == null) ? null : string.trim();
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
    }

    public String getDeviceVendor() {
        return deviceVendor;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public boolean isMobile() {
        return mobile;
    }

    public String getUserAgentRaw() {
        return userAgentRaw;
    }

    @Override
    public String toString() {
        return "UserAgent{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", operatingSystemVersion='" + operatingSystemVersion + '\'' +
                ", deviceVendor='" + deviceVendor + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", mobile=" + mobile +
                ", userAgentRaw='" + userAgentRaw + '\'' +
                '}';
    }

}