/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcit50.pkg2018;

/**
 *
 * @author Cyril
 */
public class NewClass {
    static int x=0;
    
    public static void main(String[] args) {
//        int x = sum(1, 4);
//        int x = 0;
        System.out.println("variable x inside of main method");
        System.out.println(x);
        method();
    }
    
    public static void method(){
        x = 1;
        System.out.println("Variable x inside this method");
        System.out.println(x);
    }
    
    
//    public static int sum(int x, int y){
////        System.out.println(x+y);
//        int sum = x+y;
//        return sum;
//    }
//    
//    public static void diff(int x, int y){
//    }
//    
//    public static void diff(int x, double y){
//    }
//    
//    public static void diff(double x, int y){
//    }
//    
//    public static void diff(double x, double y){
//    }
//    
//    public static void diff(int x, int y, int z){
//    }
//    
//    public static void diff(int x, int y, int z, int w){
//    }
    
    
}
