/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.util.Arrays;

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
        
        int[] arrayAngka = {11, 12, 13, 14, 15, 16, 17, 18, 19 ,20};
        
        // looping stanard
        System.out.println("Looping standard");
        for (int i = 0; i < 10; i++) {
            System.out.println("index ke-" + i + " adalah " + arrayAngka[i]);
        }
        
        System.out.println();
        
        // Looping dengan Property Array
        System.out.println("Looping dengan properti length");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println("index ke-" + i + " adalah " + arrayAngka[i]);
        }
        
        System.out.println();
        
        // Looping khususon untuk colleciton <- array
        System.out.println("Looping dengan For Each");
        for (int angka : arrayAngka) {
            System.out.println("Angka pada looping ini adalah " + angka);
        }
    }
    
}
