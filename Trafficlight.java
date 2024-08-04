/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oops;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author ansh
 */
/*Write a Java program to create class called "TrafficLight"
with attributes for color and duration, and methods to
change the color and check for red or green.*/

public class Trafficlight {
    String color = "Green";
    LocalTime lastChangeTime = LocalTime.now();

    void changeColor(LocalTime currentTime) {
        long minutesSinceLastChange = lastChangeTime.until(currentTime, java.time.temporal.ChronoUnit.MINUTES);

        if (minutesSinceLastChange >= 3 && minutesSinceLastChange < 5) {
            color = "Yellow";
        } else if (minutesSinceLastChange >= 5 && minutesSinceLastChange < 7) {
            color = "Red";
        } else if (minutesSinceLastChange >= 7 && minutesSinceLastChange < 17) {
            color = "Green";
        }

        System.out.println("Current Time: " + currentTime + ", Color: " + color);
    }

    public static void main(String[] args) {
        Trafficlight light = new Trafficlight();

        while (true) {
            LocalTime currentTime = LocalTime.now();
            light.changeColor(currentTime);

            try {
                // Sleep for 1 minute before checking again
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
