//package com.hello;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Here :");
        int input = sc.nextInt();

        int a = 0;
        int sq = 0;

        while (input != sq) {
            a++;
            sq = a*a;
        } 

        if (a == 2147483647) {
            System.out.println("Does not exist");
        }
                else {
                System.out.print("The no. squared is :");
                System.out.println(a);
            }
        }
    }