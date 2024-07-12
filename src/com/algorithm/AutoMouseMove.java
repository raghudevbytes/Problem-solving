package com.algorithm;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class AutoMouseMove {
    public static void main(String[] args) throws InterruptedException {
        try {
            Robot robot = new Robot();
            Random random = new Random();

            // Move the mouse in a loop
            while (true) {
                // Generate random x and y coordinates
                int x = random.nextInt(1920); // Assuming screen width is 1920
                int y = random.nextInt(1080); // Assuming screen height is 1080

                // Move the mouse to the random coordinates
                robot.mouseMove(x, y);

                // Sleep for 1 second before moving again
                Thread.sleep(1000);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
