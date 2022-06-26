package com.company;

import java.util.Scanner;

public class Main {
    public static void Triangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void IsoscelesTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
                for (j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
            System.out.println(" ");
            }
    }
    public static void EmptyTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= 2 * n - 1; j++) {
                if(i==n|| (j == (n-i+1)) || j ==n+i-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }



    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        n = sc.nextInt();
        Triangle(n);
        System.out.println("--------------------------");
        IsoscelesTriangle(n);
        System.out.println("----------------------");
        EmptyTriangle(n);
    }
}
