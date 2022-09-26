package com.justanother.template.domain.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum JustAnotherEnumerator {

    A_PROPERTY("This is a property"),
    ANOTHER_PROPERTY("This is another property"),
    JUST_ANOTHER_PROPERTY("This is just another Property");

    private static final Map<String, JustAnotherEnumerator> lookup = new HashMap<String, JustAnotherEnumerator>();

    static {
        for (JustAnotherEnumerator justAnotherEnumerator : JustAnotherEnumerator.values()) {
            lookup.put(justAnotherEnumerator.getLabel(), justAnotherEnumerator);
        }
    }

    private final String label;

    JustAnotherEnumerator(String label) {
        this.label = label;
    }

    public static JustAnotherEnumerator get(String label) {
        return lookup.get(label);
    }

    public String getLabel() {
        return this.label;
    }

}