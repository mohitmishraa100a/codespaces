//package com.mycompany.app;
import java.util.Scanner;

public class Main {

    public static void Sum(Double a,Double b) {
        Double SumAB = a + b;
        System.out.println(SumAB);
    }

    public static void Sub(Double a,Double b) {
        Double SubAB = a - b;
        System.out.println(SubAB);
    }

    public static void Mul(Double a,Double b) {
        Double MulAB = a * b;
        System.out.println(MulAB);
    }

    public static void Div(Double a,Double b) {
        Double DivAB = a / b;
        System.out.println(DivAB);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Here :");
        String input = sc.next();

        
        if(input.contains("+")) {

        String str = input;
        String[] arrOfStr = str.split("\\+", 2);
        String str1 = arrOfStr[0];
        String str2 = arrOfStr[1];

        
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);

        Sum(num1,num2);

        }

        if(input.contains("-")) {

        String str = input;
        String[] arrOfStr = str.split("\\-", 2);
        String str1 = arrOfStr[0];
        String str2 = arrOfStr[1];
    
            
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
    
        Sub(num1,num2);
    
        }

        if(input.contains("*")) {

        String str = input;
        String[] arrOfStr = str.split("\\*", 2);
        String str1 = arrOfStr[0];
        String str2 = arrOfStr[1];
        
                
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
        
        Mul(num1,num2);
        
        }
        
        if(input.contains("/")) {

        String str = input;
        String[] arrOfStr = str.split("\\/", 2);
        String str1 = arrOfStr[0];
        String str2 = arrOfStr[1];
            
                    
        double num1 = Double.parseDouble(str1);
        double num2 = Double.parseDouble(str2);
            
        Div(num1,num2);
            
        }
    }
}
