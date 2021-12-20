package com.teachmeskills.homework_6.basicHomework.homework1;

import java.util.Scanner;

public class Circle extends Figure implements Figure1 {
    public double radius;
    public final double NUMBER = 3.14;

    @Override
    public void perimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you radius");
        radius = scanner.nextDouble();
        double result = radius * NUMBER * 2;
        System.out.println("perimeterOfCircle - " + result);
    }

    @Override
    public void square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you radius");
        radius = scanner.nextDouble();
        double result = Math.pow(radius,2) * NUMBER;
        System.out.println("squareOfCircle - " + result);
    }

    @Override
    public double perimeterRandom() {
        radius = (1 + Math.random() * 10);
        double result = radius * NUMBER * 2;
        return result;
    }

    @Override
    public double squareRandom() {
        radius = (1 + Math.random() * 10);
        double result = Math.pow(radius,2) * NUMBER;
        return result;
    }
}
