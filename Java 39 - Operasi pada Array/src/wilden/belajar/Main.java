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
        
        int[] arrayAngka1 = {1,2,3,4,5};
        
        // CHANGE Array menjadi String
        System.out.println("\nUbah Array menjadi STRING");
        printArray(arrayAngka1);
        
        // COPY Array
        System.out.println("COPY Array");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        System.out.println("\nCOPY dengan Loop");
        for (int i = 0; i < arrayAngka1.length; i++) {
            arrayAngka2[i] = arrayAngka1[i];
        }
        
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        
        // COPYOF
        System.out.println("\nCOPY dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1,3);
        
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        // COPYOFRANGE
        System.out.println("\nCOPY dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1,2,5);
        
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        
        // FILL Array
        System.out.println("\nFill Array");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);
        
        // COMPARE Array
        System.out.println("\nCOMPARE Array");
        int[] arrayAngka6 = {1,2,3,4,9};
        int[] arrayAngka7 = {1,2,3,4,5};
        
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        if (Arrays.equals(arrayAngka6, arrayAngka7)) {
            System.out.println("Array ini SAMA");
        } else {
            System.out.println("Array ini BEDA");
        }
        
        // System.out.println("\nCek Mana array yg lebih BESAR");
        // System.out.println(Arrays.compare(arrayAngka6,arrayAngka7));
        
        
        // System.out.println("\nngecek mana index yang berbeda");
        // System.out.println(Arrays.mismatch(arrayAngka6,arrayAngka7));
        
         // sort array
        System.out.println("\nsort array\n==============");
        int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        
        // search array
        System.out.println("\nsearch array\n==============");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka " + angka + " ada di index " + posisi);
        
        
        
        
        
    }
    
    public static void printArray(int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
    
}
