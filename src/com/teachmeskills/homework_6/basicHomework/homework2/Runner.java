package com.teachmeskills.homework_6.basicHomework.homework2;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Start");
        Accountant accountant = new Accountant();
        accountant.printPosts();
        Director director = new Director();
        director.printPosts();
        Worker worker = new Worker();
        worker.printPosts();
        System.out.println("End");
    }
}
