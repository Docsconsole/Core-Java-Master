package com.docsconsole.tutorials;

public class CreateDeadLock {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1001);
        Employee employee2 = new Employee(1002);
        Thread thread1 = new Thread(new ThreadExample(employee1,employee2),"t1");
        Thread thread2 = new Thread(new ThreadExample(employee1,employee2),"t2");
        thread1.start();
        thread2.start();


    }
}


