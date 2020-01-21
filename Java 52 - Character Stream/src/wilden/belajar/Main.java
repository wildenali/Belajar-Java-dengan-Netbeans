/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.io.*;

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
        
        // Membuka File
        
        // byte stream -> FileInputStream
        // Character stream -> FileReader
        
        FileInputStream byteFileInput = new FileInputStream("input.txt");
        FileReader      charFileInput = new FileReader("input.txt");
        
        FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
        FileWriter       charFileOutput = new FileWriter("outputChar.txt");
        
        
        // Membaca File
        
        // byte file
        int buffer = byteFileInput.read();
        
        while (buffer != -1) {            
            System.out.print((char)buffer);
            byteFileOutput.write(buffer);
            buffer = byteFileInput.read();
        }
        
        System.out.println("\n");
        
        // Char file
        buffer = charFileInput.read();
        
        while (buffer != -1) {            
            System.out.print((char)buffer);
            charFileOutput.write(buffer);
            buffer = charFileInput.read();
        }
        
        // Menutup File
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();
        
        
        
    }
    
}
