/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcit50.pkg2018;

import java.util.Scanner;

/**
 *
 * @author Cyril
 */
public class DCIT502018 {

    public static void main(String[] args) {
        //        printHello();
        //        System.out.println(printSomething());
        //        int num = getNumberOne();
//         Scanner sc = new Scanner(System.in);
//         int num1;
//         int num2;
//         System.out.println("Enter first number:");
//         num1 = sc.nextInt();
//         System.out.println("Enter second number:");
//         num2 = sc.nextInt();
        
//         int sum = add(num1, num2);
//         if(sum<0){
//             System.out.println("Negative");
//         } else {
//             System.out.println("Positive");
//         }

// //        int sum2 = add(40, 1);
// //        System.out.println("Sum 1: " + sum);
//         System.out.println("Sum : " + sum);


        String cammelCasing;
        String snake_casing;
    }

    public static void printHello(String toPrint) {
    }

    public static void printHello() {
        System.out.println("Hello");
        int x = 10;
    }

    public static String printSomething() {
        return "Something";
    }

    public static int getNumberOne() {
        return 1;
    }

    public static int add(int x, int y) {
//        int sum  = x + y;
        return x + y;
    }
    
// Method overloading same name different parameters

    public static int add(int x, int y, int z) {
//        int sum  = x + y;
        return x + y + z;
    }

}
