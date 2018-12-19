package com.github.glistman.museragent.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ReadFile {

    public static Stream<String> getLinesFromResource(String name) {
        InputStreamReader inputStreamReader = new InputStreamReader(ReadFile.class.getClassLoader().getResourceAsStream(name));
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        return bufferedReader.lines();
    }

}