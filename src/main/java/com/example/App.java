package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(new MyThread("Nhan", i + 1), "t1");
            t1.start();
            //t1.join();
            Thread t2 = new Thread(new MyThread("QA", i + 1), "t2");
            t2.start();
            //t2.join();
        }
    }
}
