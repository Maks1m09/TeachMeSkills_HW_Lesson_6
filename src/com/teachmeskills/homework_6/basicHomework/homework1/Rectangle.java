package com.teachmeskills.homework_6.basicHomework.homework1;

import java.util.Scanner;

public class Rectangle extends Figure implements Figure1 {
    public double side2;

    @Override
    public void perimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you side1");
        side1 = scanner.nextDouble();
        System.out.println("Enter you side2");
        side2 = scanner.nextDouble();
        double result = 2 * (side1 + side2);
        System.out.println("perimeterOfRectangle - " + result);
    }

    @Override
    public void square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you side1");
        side1 = scanner.nextDouble();
        System.out.println("Enter you side2");
        side2 = scanner.nextDouble();
        double result = side1 * side2;
        System.out.println("squareOfRectangle - " + result);
    }

    @Override
    public double perimeterRandom() {
        side1 = (1 + Math.random() * 10);
        side2 = (1 + Math.random() * 10);
        double result = 2 * (side1 + side2);
        return result;
    }

    @Override
    public double squareRandom() {
        side1 = (1 + Math.random() * 10);
        side2 = (1 + Math.random() * 10);
        double result = side1 * side2;
        return result;
    }
}
