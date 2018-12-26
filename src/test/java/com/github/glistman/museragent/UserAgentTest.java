package com.github.glistman.museragent;

import com.github.glistman.museragent.util.ReadFile;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserAgentTest {

    @Test
    public void parseAndroidTest() {
        UserAgentParser userAgentParser = new UserAgentParser();
        Stream<String> userAgents = ReadFile.getLinesFromResource("android-user-agents.txt");

        boolean areMobiles = userAgents.allMatch(userAgent -> {
            UserAgent userAgentObject = userAgentParser.parse(userAgent);
            return userAgentObject.isMobile();
        });

        assertTrue(areMobiles);
    }

    @Test
    public void parseAppleTest() {
        UserAgentParser userAgentParser = new UserAgentParser();
        Stream<String> userAgents = ReadFile.getLinesFromResource("apple-user-agents.txt");

        boolean areMobiles = userAgents.allMatch(userAgent -> {
            UserAgent userAgentObject = userAgentParser.parse(userAgent);
            return userAgentObject.isMobile();
        });

        assertTrue(areMobiles);
    }

    @Test
    public void parseIOSOs() {
        String userAgentRaw = "App/1 (iPhone; iOS 9.0; Scale/1.0)";
        UserAgentParser userAgentParser = new UserAgentParser();
        UserAgent userAgent = userAgentParser.parse(userAgentRaw);
        assertEquals(userAgent.getOperatingSystem(), "iOS");
        assertEquals(userAgent.getOperatingSystemVersion(), "9.0");
    }

    @Test
    public void parseIPhoneOS() {
        String userAgentRaw = "App/1 (iPhone 6s; iPhone OS/9.3.3; CFNetwork/1.0.0; Darwin/15.6.0)";
        UserAgentParser userAgentParser = new UserAgentParser();
        UserAgent userAgent = userAgentParser.parse(userAgentRaw);
        assertEquals(userAgent.getOperatingSystem(), "iPhone OS");
        assertEquals(userAgent.getOperatingSystemVersion(), "9.3.3");
    }

}