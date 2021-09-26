package com.dipesh.cn.oops2.exception;

public class ExceptionDemo {
    public static void main(String[] args) {
//      Either Throw the exception to the function which called current function or handle here
//      If Thrown from main then exception goes to java runtime system and show exception in console, also it will not execute further
//      If Handle here then, have "try and catch" block

        try {
            // If try block receive error it will throw it to catch and will not execute further code in try block
            divide(10,0);
            System.out.println("WithIn Try Block");
        } catch (DivideByZeroException e) {
//          If error received then execute code of catch block and continue the program
            System.out.println("Divide by zero exception occurred: "+e);
//            e.printStackTrace();
        }
        System.out.println("From Main");
    }

    public static int divide(int a, int b) throws DivideByZeroException{
        if(b == 0) {
//          Once Exception, Either Throw the exception to the function which called current function or handle here
            throw new DivideByZeroException();
//            throw new ArithmeticException(); // Throw explicitly existed Exception
        }
        return a/b;
    }
}
