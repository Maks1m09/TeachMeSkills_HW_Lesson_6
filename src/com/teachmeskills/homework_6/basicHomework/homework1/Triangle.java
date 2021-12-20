package com.teachmeskills.homework_6.basicHomework.homework1;

import java.util.Scanner;

public class Triangle extends Figure implements Figure1 {
    public double side2;
    public double side3;
    public double height;

    @Override
    public void perimeter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you side1");
        side1 = scanner.nextDouble();
        System.out.println("Enter you side2");
        side2 = scanner.nextDouble();
        System.out.println("Enter you side3");
        side3 = scanner.nextDouble();
        double result = side1 + side2 + side3;
        System.out.println("perimeterOfTriangle - " + result);
    }

    @Override
    public void square() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you side1");
        side1 = scanner.nextDouble();
        System.out.println("Enter you height");
        height = scanner.nextDouble();
        double result = 0.5 * height * side1;
        System.out.println("squareOfTriangle - " + result);
    }

    @Override
    public double perimeterRandom() {
        side1 = (1 + Math.random() * 10);
        side2 = (1 + Math.random() * 10);
        side3 = (1 + Math.random() * 10);
        double result = side1 + side2 + side3;
        return result;
    }

    @Override
    public double squareRandom() {
        side1 = (1 + Math.random() * 10);
        height = (1 + Math.random() * 10);
        double result = 0.5 * height * side1;
        return result;
    }
}
