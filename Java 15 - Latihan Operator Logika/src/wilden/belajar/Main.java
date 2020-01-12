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
        
        Scanner inputUser = new Scanner(System.in);
        
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("Masukan nilai tebakan anda: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah: " + nilaiTebakan);
        
        // Operasi logika 
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan anda: " + statusTebakan);
        
        // Operasi aljabar boolean (and / or)
        System.out.print("Masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = inputUser.nextInt();
        
        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
        /*
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
        */
        System.out.println("Tebakan anda: " + statusTebakan);
    }
    
}
