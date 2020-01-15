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
        
        // Program untuk menjumlahkan angka dengan rentang
        
        int nilaiAwal, nilaiAkhir, total;
        
        Scanner inputUser = new Scanner(System.in);
        
        System.out.print("Masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        
        System.out.print("Masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();
        
        total = 0;
        
        while (nilaiAwal <= nilaiAkhir) {            
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }
        
    }
    
}
