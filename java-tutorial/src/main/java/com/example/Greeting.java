package com.example;

import com.engflow.fancytext.FancyFormatter;

public class Greeting {
    /**
     * Converts input string to mixed-case.
     *
     * @param text user input string.
     * @return Mixed-case string.
     */
    public static String convert(String text) {
        FancyFormatter formatter = new FancyFormatter().standard();
        return formatter.format(text);
    }

    /**
     * Maintain fixed output to retain backwards compatibility.
     */
    public static void sayHi() {
        System.out.println(convert("Hi!"));
    }
}
