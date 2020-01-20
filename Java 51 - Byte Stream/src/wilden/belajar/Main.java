/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author wilden
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;
        
        // Membuka File
        fileInput = new FileInputStream("input.txt");
        
        // Membaca File
        int data = fileInput.read();
        
        while (data != -1) {            
            System.out.print((char)data);   // System.out.println((char)data);
            data = fileInput.read();
        }
        
        // Menutup File
        fileInput.close();
        
        // Salah satu contoh skenario program pembukaan file
        try {
            // Membuka File
            fileInput = new FileInputStream("input2.txt");
            fileOutput = new FileOutputStream("output2.txt");
            
            // Membaca File
            int buffer = fileInput.read();
            
            while (buffer != -1) {                
                fileOutput.write(buffer);
                buffer = fileInput.read();
            }
        } finally {
            if (fileInput != null) {
                fileInput.close();
            }
            
            if (fileOutput != null) {
                fileOutput.close();
            }
        }
        
        // Yang Terakhir (try with resources)
        try (
            FileInputStream in = new FileInputStream("input.txt");
            FileOutputStream out = new FileOutputStream("output.txt")
            ) {
            
            // Membaca File
            int data2 = in.read();
            
            while (data2 != -1) {                
                out.write((char)data2);
                data2 = in.read();
            }
            
        }
        
    }
    
}
