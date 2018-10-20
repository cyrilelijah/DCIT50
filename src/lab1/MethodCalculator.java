/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Cyril
 */
public class MethodCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char opt;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Choose an operation:");
        System.out.println("+ add");
        System.out.println("- sub");
        System.out.println("* mul");
        System.out.println("/ div");
        opt = sc.next().charAt(0);
        System.out.println("Enter second number:");
        num2 = sc.nextInt();
        compute(num1, opt, num2);
        
    }
    
    public static void compute(int num1, char opt, int num2) {
        int result = 0;
        switch (opt) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        System.out.println("The result is " + result);
    }

}
