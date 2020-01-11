/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

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
        
        // Unary = operasi yang dilakukan pada satu variable
        
        // Unary + dan -
        int angka = 2;
        System.out.printf("Unary '+', %d menjadi %d\n", angka, +angka);
        System.out.printf("Unary '-', %d menjadi %d\n", angka, -angka);
        System.out.println();
        
        // Unary decrement dan increment
        int angka2 = 10;
        angka2++;
        System.out.println("Nilai dengan '++' (angka2++) menjadi = " + angka2);
        System.out.println();
        
        int angka3 = 10;
        angka3--;
        System.out.println("Nilai dengan '--' (angka3--) menjadi = " + angka3);
        System.out.println();
        
        int angka4 = 55;
        System.out.printf("Nilai(55) dengan '++' prefix (++angka4) menjadi = %d\n", ++angka4);
        System.out.println();
        
        int angka5 = 55;
        System.out.printf("Nilai(55) dengan '++' postfix (angka5++) menjadi = %d\n", angka5++);
        System.out.println();
        
        
    }
    
}
