package com.nunify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobotTest {

    @Test
    public void
    testInputOneNorth() {
        String newPosition = Robot.move(1, 0, 'N', "MMRMMLMMR");
        System.out.println(newPosition);
        assertEquals("3 4 E", newPosition);
    }

    @Test
    public void
    testInputTwoEast() {
        String newPosition = Robot.move(3, 2, 'E', "MLLMMRMM");
        System.out.println(newPosition);
        assertEquals("2 4 N", newPosition);
    }

}