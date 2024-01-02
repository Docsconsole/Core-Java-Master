package com.docsconsole.tutorials;


public class ExceptionExample {

    public void testExecutionFlow(){
        //try {
            System.out.println(" Statement - 1");
            System.out.println(" Statement - 2");
            System.out.println(" Statement - 3");
            int n = 10/0;
            System.out.println(" Statement - 4 with variable "+ n);
            System.out.println(" Statement - 5");
            System.out.println(" Statement - 6");
        /*}catch (Exception e){
            System.out.println(" Due to exception normal execution flow is disturbed.");
        }*/


    }

}