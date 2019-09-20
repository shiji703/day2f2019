package com.lambton;

public class Arithmetic
{
    int sum(int a, int b)
    {
        int c;
        c = a + b;
        return c;
    }
     int difference( int a, int b)
     {
         int c;
         c = a - b;
         return c;
     }

     int product(int a, int b)
     {
         int c;
         c = a * b;
         return c;
     }

     int quot(int a, int b)
     {
         int c;
         c = a / (float)b;
         return c;
     }

     int rem(int a, int b)
     {
         int c;
         c = a % b;
         return c;
     }
}
