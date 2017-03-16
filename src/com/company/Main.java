package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        float tempC, tempF;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenheit: ");
        tempF = sc.nextFloat();

        tempC = ((tempF - 32)*5)/9;

        System.out.println("Temperature from Fahrenheit to Celsius: " + tempC);

    }
}
