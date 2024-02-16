package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTest {

    @Test
    public void formatText() {
        HashMap<String, String> candidates = new HashMap<String, String>();
        candidates.put(
            "Never gonna give you up, never gonna let you down",
            "nEvEr gOnNa gIvE YoU Up, NeVeR GoNnA LeT YoU DoWn");
        candidates.put(
            "N3v3r gonn@ run @round @nd de$ert y0u, N3v3r gonn@ make y0u cry",
            "n3v3r gOnN@ rUn @RoUnD @nD De$eRt y0u, N3V3R GoNn@ MaKe y0u cRy");
        candidates.put("", "");

        for (Map.Entry<String,String> candidate: candidates.entrySet()) {
            assertEquals(
                Greeting.convert(candidate.getKey()),
                candidate.getValue()
            );
        }
    }

    @Test
    public void standardOut() {
        
    }
}