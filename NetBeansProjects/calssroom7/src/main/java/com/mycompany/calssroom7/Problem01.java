/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calssroom7;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n) {
        long sum = 0; 
        for (int i = 2; i <= n; i++) { 
            if (isPrime(i)) { 
                sum += i; 
            }
        }
        return sum; 
    }

    /**
     * Checks if a given number is prime or not.
     * @param n the number to check
     * @return true if the number is prime, false otherwise
     */
    private static boolean isPrime(int n) {
        if (n <= 1) { 
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) { 
                return false;
            }
        }
        return true; 
    }

    
}