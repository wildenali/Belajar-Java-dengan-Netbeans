/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.io.FileInputStream;
import java.io.IOException;
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
        
        int[] array = {0, 1, 2, 3};
        
        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.print("Nilai array ke: ");
        int index = userInput.nextInt();
        
        // Exception Handling (try, catch, finally);
        System.out.println("\n===== Handling out of bounding =====");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e);
        }
        
        
        // runtime rror jika file tidak ada
        System.out.println("\n===== Handling IO Not Found =====");
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (IOException e) {
            System.err.println(e);
        }
        
        
        // Menggabungkan dua exception
        System.out.println("\n===== Menggabungkan DUA Exception =====");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } catch (ArrayIndexOutOfBoundsException e) {
          System.err.println("Index yang anda masukan tidak sesuai dengan data kami");
        } catch (IOException e) {
            System.err.println(e);
        }
        
        // Finally 
       System.out.println("\n===== Menambahkan Finally =====");
        try {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
          System.err.println("Index yang anda masukan tidak sesuai dengan data kami");
        } finally {
            System.err.println("Finally");
        }
        
        System.out.println("\n Akhir program Masih di Ekse");
        
        
    }
    
}
