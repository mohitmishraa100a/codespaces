//package com.hello;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Here :");
        String input = sc.nextLine();
        //System.out.println(input);
        System.out.println(input.length());
        char[] array1 = new char[99];
        char[] array2 = new char[99];
        int a = 0;
        int b = input.length();

        //System.out.println(input.charAt(1));

        while(input.length() > a) {
            array1[a] = input.charAt(a);
            //System.out.println(array1[a]);
            a++;
        }

        a = 0;

        while(input.length() > a) {
            array2[a] = input.charAt(b-1);
            //System.out.println(array2[a]);
            //System.out.println("this is triggered");
            a++;
            b--;
        }

        if(Arrays.equals(array1, array2)) {
            System.out.println("Both are same");
        } else {
            System.out.println("They are not same");
        }
    }
}
