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
        
        // CREATE the String
        String kataString = "hallo";
        
        char[] kataChar = {'h','a','l','l','o'};
        
        // SHOW the String
        System.out.println("SHOW the String");
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        System.out.println();
         
       // ACCESS from the String
        System.out.println("ACCESS the String");
        System.out.println("Komponen pertama dari char[] = " + kataChar[3]);
        System.out.println("Komponen pertama dari String = " + kataString.charAt(3));
        
        // CHANGE the String
        // itu tidak bisa,,, kenapa? karena string di java itu immutable
        System.out.println("\nCHANGE the String");
        kataChar[0] = 'c';
        System.out.println(Arrays.toString(kataChar));
        
        // kataString[0] = "c";         <---- tidak bisa
        // kataString.charAt(0) = "c";  <---- tidak bisa
        
        printAddress("kataString", kataString);
        kataString = "c" + kataString.substring(1,5);
        System.out.println(kataString);
        
        printAddress("kataString", kataString);
        
        
    }
    
    private static void printAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + data + "\t|| address = " + Integer.toHexString(address));
    }
}
