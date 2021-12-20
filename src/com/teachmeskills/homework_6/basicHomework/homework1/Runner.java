package com.teachmeskills.homework_6.basicHomework.homework1;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");
        Triangle triangle = new Triangle();
        System.out.println("perimeterOfTriangle: " + triangle.perimeterRandom());
        System.out.println("squareOfTriangle: " + triangle.squareRandom());
        Rectangle rectangle = new Rectangle();
        System.out.println("perimeterOfRectangle: " + rectangle.perimeterRandom());
        System.out.println("squareOfRectangle: " + rectangle.squareRandom());
        Circle circle = new Circle();
        System.out.println("perimeterOfCircle: " + circle.perimeterRandom());
        System.out.println("squareOfCircle: " + circle.squareRandom());
        double sum = 0;

        double[] myArray = new double[5];
        myArray[0] = new Triangle().perimeterRandom();
        myArray[1] = new Circle().perimeterRandom();
        myArray[2] = new Rectangle().perimeterRandom();
        myArray[3] = new Triangle().perimeterRandom();
        myArray[4] = new Triangle().perimeterRandom();

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("the perimeter of the figure under the number " + i + ": " + myArray[i]);
        }

        for (int j = 0; j < myArray.length; j++) {
            sum += myArray[j];
        }
        System.out.println("sum of perimeters - " + sum);
        System.out.println("End");
    }
}
