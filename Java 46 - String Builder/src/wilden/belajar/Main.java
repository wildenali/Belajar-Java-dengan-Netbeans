/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.lang.StringBuilder;

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
        
        // String builder untuk mempermudah pengolahan string
        // misal mendelete kata di tengah2 kalimat
        // alasan lainnya karena string biasa boros memory, karena 
        // ketika menggunakan concat, dia akan membuat memory baru
        // String builder dari java ke 5
        
        // Builder punya kapasitar
        // 16 karakter adalah default nya si string builder

        
        StringBuilder builder = new StringBuilder("Hallow");
        printData(builder);
        
        
        // APPEND
        System.out.println("\n===== APPEND =====");
        builder.append(" semuanyaa...");
        printData(builder);
        
        System.out.println();
        builder.append(" warga wakanda");
        printData(builder);
        
        
        // INSERT
        System.out.println("\n===== INSERT =====");
        builder.insert(19, " Kota");
        printData(builder);
        
        // INSERT
        System.out.println("\n===== DELETE =====");
        builder.delete(19, 24);
        printData(builder);
        
        // CHANGE character pada index tertentu
        System.out.println("\n===== CHANGE Character =====");
        builder.setCharAt(14, 'W');
        printData(builder);
        
        // REPLACE
        System.out.println("\n===== REPLACE =====");
        builder.replace(20, 28, "Asgardian");
        printData(builder);
        
        // CASTING menjadi String
        System.out.println("\n===== CASTING =====");
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));
        
        
        
    }
    
    
    private static void printData(StringBuilder dataBuilder){
        System.out.println("Data = " + dataBuilder);
        System.out.println("Panjang = " + dataBuilder.length());
        System.out.println("Kapasitas = " + dataBuilder.capacity());
        
        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }
}
