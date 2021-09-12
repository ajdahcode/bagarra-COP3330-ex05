/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 alden bagarra
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnN = new Scanner(System.in);
        System.out.print( "What is the first number? " );
        String num1 = scnN.next();
        int number1 = Integer.parseInt(num1);
        System.out.print( "What is the second number? " );
        String num2 = scnN.next();
        int number2 = Integer.parseInt(num2);
        System.out.print( num1 +" + "+ num2 +" = "+ (number1+number2) +
                "\n"+ num1 +" - "+ num2 +" = "+ (number1-number2) +
                "\n"+ num1 +" * "+ num2 +" = "+ (number1*number2) +
                "\n"+ num1 +" / "+ num2 +" = "+ (number1/number2));
    }
}
