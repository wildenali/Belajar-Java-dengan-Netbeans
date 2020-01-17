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
        int[] arrayAngka1 = {2,3,5,1,2,3,6,5,3};
        int[] arrayAngka2 = {0,4,1,2,1,5,3,1,1,4};
        
        // JUMLAH dua buah Array
        System.out.println("===== JUMLAH Array =====");
        int[] arrayHasil1 = tambahArray(arrayAngka1, arrayAngka2);
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayHasil1, "Hasil 1");
        
        
        // GABUNG dua buah array
        System.out.println("\n===== GABUNG Array =====");
        int[] arrayHasil2 = new int[arrayAngka1.length + arrayAngka2.length];
        for (int i = 0; i < arrayAngka1.length ; i++) {
            arrayHasil2[i] = arrayAngka1[i];
        }
        for (int i = 0; i < arrayAngka2.length; i++) {
            arrayHasil2[i + arrayAngka1.length] = arrayAngka2[i];
        }
        printArray(arrayAngka1, "Array 1");
        printArray(arrayAngka2, "Array 2");
        printArray(arrayHasil2, "Hasil 2");
        
        // SORTING REVERSE
        System.out.println("\n===== SORTING REVERSE Array =====");
        printArray(arrayAngka1, "Array 1");
        reverse(arrayAngka1);
        printArray(arrayAngka1, "Reverse 1");
        
        printArray(arrayAngka2, "Array 2");
        reverse2(arrayAngka2);
        printArray(arrayAngka2, "Reverse 2");
        
        
    }
    
    public static int[] tambahArray(int[] arrayInt1, int[]arrayInt2){
        int[] arrayHasil = new int[arrayInt1.length];
        for (int i = 0; i < arrayInt1.length; i++) {
            arrayHasil[i] = arrayInt1[i] + arrayInt2[i];
        }
        return arrayHasil;
    }
    
    public static void printArray(int[] dataArray, String message){
        System.out.println(message + " = " + Arrays.toString(dataArray));
    }
    
    public static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
        
        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }
    
    public static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;
        
        for (int i = 0; i < dataArray.length/2; i++) {
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }
    
}
