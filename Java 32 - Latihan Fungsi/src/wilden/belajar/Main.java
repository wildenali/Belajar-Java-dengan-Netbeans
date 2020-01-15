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
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Panjang = ");
        int inputPanjang = userInput.nextInt();
        
        System.out.print("Lebar = ");
        int inputLebar = userInput.nextInt();
        
        gambar(inputPanjang, inputLebar);
        
        System.out.println("Luas = " + luas(inputPanjang, inputLebar));
        System.out.println("Keliling = " + keliling(inputPanjang, inputLebar));
        
        tampilkanKelilingdanLuas(inputPanjang, inputLebar);
    }
    
    private static void tampilkanKelilingdanLuas(int panjang, int lebar){
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("Keliling = " + keliling(panjang, lebar));
    }
    
    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }
    
    private static int luas(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
    
    private static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
