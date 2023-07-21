/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Carirumah;

/**
 *
 * @author asus*/
 import java.util.Scanner;
import java.util.InputMismatchException;
public class RumahBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        boolean inginInputLagi = false;

        do {
            // Membuat objek rumah dengan detail
            System.out.println("Informasi Rumah:");
            System.out.print("Masukkan Alamat Rumah: ");
            String alamat = input.nextLine();
            int jumlahKamar = 0; 
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Masukkan Jumlah Kamar: ");
                    jumlahKamar = input.nextInt();
                    validInput = true; 
                } 
                catch (InputMismatchException e) {
                    input.nextLine(); 
                    System.out.println("Input tidak valid. Masukkan angka untuk Jumlah Kamar.");
                }
            }
            System.out.print("Masukkan Jumlah Kamar: ");
            System.out.print("Masukkan Luas Bangunan: ");
            double luasBangunan = input.nextDouble();
            input.nextLine(); 

            
            String memilikiGarasi = "";
            boolean inputValid = false;
            while (!inputValid) {
                System.out.print("Apakah Memiliki Garasi? (ya/tidak): ");
                String memilikiGarasiInput = input.nextLine();
                if (memilikiGarasiInput.equalsIgnoreCase("ya")) {
                    memilikiGarasi = "true";
                    inputValid = true;
                } else if (memilikiGarasiInput.equalsIgnoreCase("tidak")) {
                    memilikiGarasi = "false";
                    inputValid = true;
                } else {
                    System.out.println("Input tidak valid. Masukkan ya atau tidak.");
                }
            }

            System.out.print("Masukkan Nama Pemilik: ");
            String namaPemilik = input.nextLine();
            System.out.print("Masukkan Tahun Dibangun: ");
            int tahunDibangun = input.nextInt();

            

            // Menampilkan informasi rumah dengan detail
            System.out.println("Informasi Rumah:");
           

            input.nextLine(); 

            
            System.out.print("Ingin menginput data rumah lagi? (ya/tidak): ");
            String inginInputLagiInput = input.nextLine();
            inginInputLagi = inginInputLagiInput.equalsIgnoreCase("ya");
        } while (inginInputLagi);

        System.out.println("Akhmad Dian Adifajar 2110010147 4C REG PAGI Banjarbaru");

        input.close();
    }
    
}
