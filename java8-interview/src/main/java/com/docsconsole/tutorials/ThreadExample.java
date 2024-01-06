package com.docsconsole.tutorials;

class ThreadExample implements Runnable {
    private Employee employee1;
    private Employee employee2;

    ThreadExample(Employee employee1, Employee employee2) {
        this.employee1 = employee1;
        this.employee2 = employee2;
    }

    public void run() {
        synchronized (employee1) {
            try {
                employee1.displayId();
                Thread.sleep(1000l);
                synchronized (employee2) {
                    employee2.displayId();
                    Thread.sleep(1000l);
                    System.out.println("Name: " + Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
