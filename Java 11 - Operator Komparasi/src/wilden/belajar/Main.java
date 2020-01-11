/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wilden.belajar;

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
        
        // Operator Komparasi --> akan menghasilkan nilai dalam bentuk boolean
        
        int a, b;
        boolean hasilKomparasi;
        
        // 1. Operator Equal (Persamaan)
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.println("--------- PERSAMAAN ---------");
        System.out.printf("%d == %d --> %s", a, b, hasilKomparasi);
        System.out.println();
        
        a = 10;
        b = 15;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s", a, b, hasilKomparasi);
        System.out.println("\n");
        
        
        // 2. Operator Not Equal (PerTIDAK samaan)
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.println("--------- PERTIDAKSAMAAN ---------");
        System.out.printf("%d != %d --> %s", a, b, hasilKomparasi);
        System.out.println();
        
        a = 10;
        b = 15;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s", a, b, hasilKomparasi);
        System.out.println("\n");
        
        
        // 3. Operator Less Than (Kurang Dari)
        a = 6;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.println("--------- KURANG DARI ---------");
        System.out.printf("%d < %d --> %s", a, b, hasilKomparasi);
        System.out.println();
        
        a = 10;
        b = 5;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s", a, b, hasilKomparasi);
        System.out.println("\n");
        
        // 4. Operator Less Than Equal (Kurang Dari atau Kurang Dari Sama Dengan)
        a = 6;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.println("--------- KURANG DARI SAMA DENGAN ---------");
        System.out.printf("%d <= %d --> %s", a, b, hasilKomparasi);
        System.out.println();
        
        a = 15;
        b = 15;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s", a, b, hasilKomparasi);
        System.out.println("\n");
        
        // 5. Operator Greater Than (Lebih Dari)
        a = 6;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.println("--------- LEBIH DARI ---------");
        System.out.printf("%d > %d --> %s", a, b, hasilKomparasi);
        System.out.println();
        
        a = 10;
        b = 5;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s", a, b, hasilKomparasi);
        System.out.println("\n");
        
        // 5. Operator Greater Than Equal (Lebih Dari atau Lebih Dari Sama Dengan)
        a = 6;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.println("--------- LEBIH DARI SAMA DENGAN ---------");
        System.out.printf("%d >= %d --> %s", a, b, hasilKomparasi);
        System.out.println();
        
        a = 15;
        b = 15;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s", a, b, hasilKomparasi);
        System.out.println("\n");
        
        
    }
    
}
