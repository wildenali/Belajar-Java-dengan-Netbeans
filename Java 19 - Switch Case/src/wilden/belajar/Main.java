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
        
        String input;
        Scanner inputUser = new Scanner(System.in);
        
        System.out.println("Panggil nama: ");
        input = inputUser.next();
        
        // ekspresinya berupa satuan (int, long, byte, short), String, enum
        switch(input){
            case "otong":
                System.out.println("Hadir Bos, saya Otong");
                break;
            case "ucup":
                System.out.println("Hadir Bos, saya Ucup");
                break;
            case "mario":
                System.out.println("Hadir Bos, saya Mario");
                break;
            default:
                System.out.println(input + " Tidak Hadir Bos");
                break;
        }
        
        System.out.println("Selesai Laporan");
    }
    
}
