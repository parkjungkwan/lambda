package com.bitcamp.api.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekendNoScannerTest {

    @Test
    void execute() {
        WeekendNoScanner w = new WeekendNoScanner();
        Assertions.assertEquals(w.execute("2"),"Tuesday");
    }
}