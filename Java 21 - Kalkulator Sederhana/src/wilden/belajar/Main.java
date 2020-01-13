/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.util.*;


/**
 *
 * @author wilden
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("Operator (+ - * /) -> ");
        operator = inputUser.next().charAt(0);
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();
        
        System.out.println("Input user: " + a + " " + operator + " " + b);
        
        // Operator tersedia * / + -
        
        if (operator == '+') {
            hasil = a + b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("Hasil = " + hasil);
        } else if (operator == '/') {
            if(b == 0 ){
                System.out.println("Tak hingga");
            } else {
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }
        } else {
            System.out.println("Salah masukin operator");
        }
                
        
    }
    
}
