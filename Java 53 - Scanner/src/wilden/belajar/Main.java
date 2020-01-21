/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        
        FileReader fileInput = new FileReader("input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);
        
        Scanner scanner = new Scanner(bufferedReader);
        
        // ini untuk cek ada kata selanjutnya atau tidak
        System.out.println(scanner.hasNext());      // True
        
        // Untuk membaca kata, dengan pemisah/delimeter spasi
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        
        System.out.println(scanner.hasNext());      // False
        
        // Menggunakan delimmiter tertentu
        FileReader fileInput2 = new FileReader("input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);
        
        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");
        
        while (scanner.hasNext()) {
            System.out.println(scanner.next());            
        }
        
        // Menggunakan String tokenizer
        bufferedReader.reset();
        String data = bufferedReader.readLine();
        System.out.println(data);
        
        StringTokenizer stringToken = new StringTokenizer(data, ",");
        
        while (stringToken.hasMoreElements()) {            
            System.out.println(stringToken.nextToken());
        }
        
        // Baris kedua
        data = bufferedReader.readLine();
        System.out.println(data);
        
        stringToken = new StringTokenizer(data, ",");
        
        while (stringToken.hasMoreElements()) {            
            System.out.println(stringToken.nextToken());
        }
        
    }
    
}
