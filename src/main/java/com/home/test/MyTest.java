package com.home.test;

public class MyTest {

    public static void main(String[] args) {
        
        System.out.println(Thread.currentThread().getName() + "  000000000");       
        new MyThread().start();    
        System.out.println(Thread.currentThread().getName() + "  1111111111");

    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  MyThread");
    }
}

class MyClass {

    public void doSomthing() {
        System.out.println(Thread.currentThread().getName() + "  MyClass");
    }
}
