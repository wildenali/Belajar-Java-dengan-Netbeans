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
        
        System.out.println("Array MULTIDIMENSI");
        
        int[][] array_2D = {
            {1, 2},
            {3, 4}
        };
        
        // Cara Membuat Array 2 Dimensi dengan deklarasi
        // int[baris][kolom]
        int[][] arrayAngka = new int[5][4];
        
        printArray2D(arrayAngka);
        
        int[][] array_2D_2 = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
        };
        printArray2D(array_2D_2);
        
        int[][] array_ragged = {
            {1,2,3},
            {4,5,6,7},
            {8},
        };
        printArray2D(array_ragged);
        
    }
    
    private static void printArray2D(int[][] dataArray){
        System.out.print("{\n");
        for (int[] baris: dataArray) {
            System.out.print("{");
            for(int angka: baris){
                System.out.print(angka + ",");
            }
            System.out.print("}\n");
        }
        System.out.print("}\n");
    }
    
}
