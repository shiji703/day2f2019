package com.lambton;

public class CollegeExample
{

    public static void main(String[] args)
    {
        int a, b;
        Arithmetic arithmetic = new Arithmetic();
        System.out.println("SUM : " + arithmetic.sum(20, 3));
        System.out.println("SUB : " + arithmetic. difference(20, 3));
        System.out.println("PRODUCT: " + arithmetic.product(20, 3));
        System.out.println("Division: " + arithmetic.quot(20, 2));
        System.out.println("Remainder: " + arithmetic.rem(20, 3));

        Student s1 = new Student();
        s1.setMarks1(50);
        s1.setMarks2(60);
        s1.setMarks3(70);
        s1.setMarks4(40);
        s1.setMarks5(90);
        s1.generateResult();

        s1.calculateTotal();
        s1.calculatePercentage();

        System.out.println(s1.getFullName());
        System.out.println(s1.getMarks1());
        System.out.println(s1.getMarks2());
        System.out.println(s1.getMarks3());
        System.out.println(s1.getMarks4());
        System.out.println(s1.getMarks5());



    }
}
