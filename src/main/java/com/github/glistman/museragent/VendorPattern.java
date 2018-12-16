package com.github.glistman.museragent;

import java.util.regex.Pattern;

class VendorPattern {

    private final Pattern pattern;

    private final String vendor;

    VendorPattern(String pattern, String vendor) {
        this.pattern = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        this.vendor = vendor;
    }

    Pattern getPattern() {
        return pattern;
    }

    String getVendor() {
        return vendor;
    }

}