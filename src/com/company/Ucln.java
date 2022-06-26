package com.company;

import java.util.Scanner;

public class Ucln {
    public static int ucln(int a, int b){
        while (a != b){
            if (a > b){
                a -= b;
            }else {
                b -= a;
            }
        }
        return a;
    }
    public static int bcnn(int a,int b){
        int bc = (a*b)/ucln(a,b);
        return bc;
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        a = sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        b = sc.nextInt();
        System.out.println("ucln:" + ucln(a,b));
        System.out.println("bcnn: " + bcnn(a,b));
    }
}
