package com.xtremelabs.droidsugar.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Transcript {
    private List<String> events = new ArrayList<String>();

    public void add(String event) {
        events.add(event);
    }

    public void assertNoEventsSoFar() {
        assertEquals(0, events.size());
    }

    public void assertEventsSoFar(String... expectedEvent) {
        assertEquals(Arrays.asList(expectedEvent), events);
        events.clear();
    }
}