package com.docsconsole.tutorials;

public class LambdaBasicExample {
    public static void main(String[] args) {
        MathOperations operationsAdd = (a, b) -> a + b;
        int resultAdd = operationsAdd.operation(20, 10);
        System.out.println(resultAdd);


        MathOperations operationsSub = (a, b) -> a - b;
        int resultSub = operationsSub.operation(20, 10);
        System.out.println(resultSub);
    }

}
