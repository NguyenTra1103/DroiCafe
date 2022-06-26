package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
 //Solution 1
    static boolean checkIsPrimeNumber(int n){
        if(n < 2)
            return false;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0)
                    return false;
            }
        }
        return true;
    }
    public static void  AnalysisPrime(int n){
        for (int i = 2; i <= n; i++) {
            while (checkIsPrimeNumber(i) && (n % i == 0)) {
                System.out.print(" "+ i );
                n /= i;
            }
        }
    }
    public static void main(String[] args) {
        int n;
        int k=2;
        int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        System.out.print(n + " is result of multiplication: " );
        AnalysisPrime(n);

        System.out.println("\n Prime numbers are less than n: ");
        for (int i = 1; i < n; i++) {
            if (checkIsPrimeNumber(i))
                System.out.print(" " + i);
        }
        System.out.println("\n " + n + "Prime Number includes: ");
        while (count < n){
            if (checkIsPrimeNumber(k)){
                System.out.print(" " + k);
                count++;
            }
            k++;
        }
    }
}
