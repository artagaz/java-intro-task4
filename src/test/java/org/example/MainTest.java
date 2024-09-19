package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum() {
        assertEquals(1, Math.round(Main.sum()));
    }
}