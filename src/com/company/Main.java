package com.company;
import java.math.BigInteger;

public class Main 
{
    public static void main(String[] args)
    {
        // Variable for calculating factorial
        BigInteger fact = BigInteger.ONE;

        // Calculate the factorial of number
        for (int i = 2; i <= 100; i++)
            fact = fact.multiply(BigInteger.valueOf(i));

        // Variable for calculating sum of all digits in the factorial
        BigInteger sum = BigInteger.ZERO;

        // Calculate sum of all digits in the number
        while (fact != BigInteger.ZERO)
        {
            sum = sum.add(fact.mod(BigInteger.TEN));
            fact = fact.divide(BigInteger.TEN);
        }

        System.out.println("Sum of the all digits in the number: " + sum);
    }
}
