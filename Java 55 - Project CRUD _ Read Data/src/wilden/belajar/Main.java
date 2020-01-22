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
        
        Scanner terminalInput = new Scanner(System.in);
        String pilihanUser;
        boolean isLanjutkan = true;
        
        while (isLanjutkan) {            
            clearScreen();
            System.out.println("===== Database Perpustakaan =====\n");
            System.out.println("1.\tLihat Seluruh Buku");
            System.out.println("2.\tCari Data Buku");
            System.out.println("3.\tTambah Dat Buku");
            System.out.println("4.\tUbah Data Buku");
            System.out.println("5.\tHapus Data Buku");
            
            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalInput.next();
            
            switch (pilihanUser) {
                case "1":
                    System.out.println("\n====================");
                    System.out.println("LIST SELURUH BUKU");
                    System.out.println("====================");
                    tampilkanData();
                    break;
                case "2":
                    System.out.println("\n====================");
                    System.out.println("CARI BUKU");
                    System.out.println("====================");
                    // Cari Data
                    break;
                case "3":
                    System.out.println("\n====================");
                    System.out.println("TAMBAH DATA BUKU");
                    System.out.println("====================");
                    // Tambah Data Buku
                    break;
                case "4":
                    System.out.println("\n====================");
                    System.out.println("UBAH DATA BUKU");
                    System.out.println("====================");
                    // Ubah Data Buku
                    break;
                case "5":
                    System.out.println("\n====================");
                    System.out.println("HAPUS DATA BUKU");
                    System.out.println("====================");
                    // Hapus Data Buku
                    break;
                default:
                    System.err.println("\nInput anda SALAH, hanya menerima 1-5");
            }
            isLanjutkan = getYesorNo("Apakah Anda ingin melanjutkan");
            
        }   
    }
    
    private static void tampilkanData() throws IOException{
        
        FileReader fileInput;
        BufferedReader bufferInput;
        
        try {
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e){
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }
        
        System.out.println("\n| No | Tahun |\tPenulis             |\tPenerbit            |\tJudul Buku");
        System.out.println("----------------------------------------------------------------------------------------------------------");

        String data = bufferInput.readLine();
        int nomorData = 0;
        while (data != null) {            
            nomorData++;
            
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            
            stringToken.nextToken();
            System.out.printf("| %2d", nomorData);
            System.out.printf("|\t%4s", stringToken.nextToken());
            System.out.printf("|\t%-20s", stringToken.nextToken());
            System.out.printf("|\t%-20s", stringToken.nextToken());
            System.out.printf("|\t%s", stringToken.nextToken());
            System.out.print("\n");
            
            data = bufferInput.readLine();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
    
    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + message + " (y/n)? ");
        String pilihanUser = terminalInput.next();
        
        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + message + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
    }
    
    private static void clearScreen(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {                // ini untuk windows
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor(); // ini untuk windows
            } else {
                System.out.print("\033\143");   // ini selain windows
            }
        } catch (Exception ex) {
            System.err.println("Tidak bisa clear screen");
        }
    }
    
}
