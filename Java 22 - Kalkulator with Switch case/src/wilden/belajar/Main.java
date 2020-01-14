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
        
        Scanner inputUser;
        float a,b,hasil;
        String operator;
        
        inputUser = new Scanner(System.in);
        
        System.out.print("Nilai a = ");
        a = inputUser.nextFloat();
        
        System.out.print("Operator = ");
        operator = inputUser.next();
        
        System.out.print("Nilai b = ");
        b = inputUser.nextFloat();
        
        switch(operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("Operator " + operator + "Tidak ditemukan");
        }
        
        
    }
    
}
