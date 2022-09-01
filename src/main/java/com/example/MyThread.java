package com.example;

public class MyThread implements Runnable {
    private int count;
    private String name;

    public MyThread(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        System.out.println("Hello " + name + " " + count + " times");
    }
}
