package com.lambton;

public class CollegeExample
{

    public static void main(String[] args)
    {
        int a, b;
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("SUM : " + arithmetic.sum(a:20, b:3));
        System.out.println("SUB : " + arithmetic. difference(a:20, b:3));
        System.out.println("PRODUCT: " + arithmetic.product(a:20, b:3));
        System.out.println("Division: " + arithmetic.quot(a:20, b:2));
        System.out.println("Remainder: " + arithmetic.rem(a:20, b:3));

    }
}
