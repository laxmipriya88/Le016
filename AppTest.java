package com.example;

public class AppTest {
    public static void main(String[] args) {
        System.out.println("Running Native Unit Tests...");

        if (App.add(5, 10) == 15) {
            System.out.println("Test Passed: App.add(5,10) returned 15.");
        } else {
            System.out.println("Test Failed: App.add(5,10) did not return 15!");
            System.exit(1);
        }
    }
}