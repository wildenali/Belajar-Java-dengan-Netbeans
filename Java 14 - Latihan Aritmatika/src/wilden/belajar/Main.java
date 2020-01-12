/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.util.Scanner;

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
        
        int panjang, lebar, luas, tinggi, volume;
        
        Scanner userInput = new Scanner(System.in);
        
        // 1. Luas Persegi Panjang
        System.out.println("===== Luas Persegi Panjang =====");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        
        luas = panjang * lebar;
        System.out.print("Luas = " + luas);
        System.out.println("\n");
        
        
        // 1. Volume Persegi Panjang
        System.out.println("===== Volume Persegi Panjang =====");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        
        volume = panjang * lebar * tinggi;
        System.out.println("Volume = " + volume);
        System.out.println();
        
        
        
        
    }
    
}
