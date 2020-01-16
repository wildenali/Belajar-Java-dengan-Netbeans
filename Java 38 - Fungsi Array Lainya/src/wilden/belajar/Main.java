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
        int[] arrayAngka2 = new int[5];
        
        System.out.println(arrayAngka1);
        System.out.println(arrayAngka2);
        
        arrayAngka2 = arrayAngka1;
        
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));
        
        arrayAngka1[0] = 100;
        arrayAngka2[4] = 300;
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));
        
        ubahArray(arrayAngka1);
        System.out.println("Array 1 -> " + Arrays.toString(arrayAngka1));
        System.out.println("Array 2 -> " + Arrays.toString(arrayAngka2));
        
    }
    
    
    // method yg argumentnya adalah reference, pass by reference
    // bukan pass by value
    
    private static void ubahArray(int[] dataArray) {
        dataArray[0] = 125;
    }
    
}
