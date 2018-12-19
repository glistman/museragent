package com.github.glistman.museragent;

import com.github.glistman.museragent.util.ReadFile;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class UserAgentTest {

    @Test
    public void parseAndroidTest() {
        UserAgentParser userAgentParser = new UserAgentParser();
        Stream<String> userAgents = ReadFile.getLinesFromResource("android-user-agents.txt");

        boolean areMobiles = userAgents.allMatch(userAgent -> {
            UserAgent userAgentObject = userAgentParser.parse(userAgent);
            return userAgentObject.isMobile();
        });

        assertEquals(true, areMobiles);
    }

    @Test
    public void parseAppleTest() {
        UserAgentParser userAgentParser = new UserAgentParser();
        Stream<String> userAgents = ReadFile.getLinesFromResource("apple-user-agents.txt");

        boolean areMobiles = userAgents.allMatch(userAgent -> {
            UserAgent userAgentObject = userAgentParser.parse(userAgent);
            return userAgentObject.isMobile();
        });

        assertEquals(true, areMobiles);
    }

}