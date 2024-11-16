package uts_semester1; 
import java.util.Scanner;

public class UTS {
    
    // Mendefinisikan warna untuk output terminal
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        // Mendeklarasikan variabel untuk menyimpan data input
        String nama, kelas, alamat;
        int nim, umur, x, y;

        // Membaca input dari pengguna
        try (Scanner input = new Scanner(System.in)) {

            // Menampilkan judul UTS
            System.out.println("************************************************************");
            System.out.println("*  ===UTS PEMROGRAMAN DASAR===");

            // Input untuk nama lengkap
            System.out.print("*  | Nama Lengkap  : ");
            nama = input.nextLine();

            // Validasi input untuk NIM (harus berupa angka)
            while (true) {
                System.out.print(RESET + "*  | NIM           : ");
                if (input.hasNextInt()) {
                    nim = input.nextInt();
                    input.nextLine();  // membersihkan buffer
                    break;
                } else {
                    System.out.println(RED + "*  | NIM harus berupa angka! Silahkan Coba Kembali!");
                    input.nextLine();  // membersihkan buffer
                }
            }

            // Input untuk kelas
            System.out.print("*  | Kelas         : ");
            kelas = input.nextLine();

            // Validasi input untuk umur (harus berupa angka)
            while (true) {
                System.out.print(RESET + "*  | Umur          : ");
                if (input.hasNextInt()) {
                    umur = input.nextInt();
                    input.nextLine();  // membersihkan buffer
                    break;
                } else {
                    System.out.println(RED + "*  | Umur harus berupa angka! Silahkan Coba Kembali!");
                    input.nextLine();  // membersihkan buffer
                }
            }

            // Input untuk alamat
            System.out.print("*  | Alamat        : ");
            alamat = input.nextLine();

            // Validasi input untuk bilangan pertama (harus ganjil)
            while (true) {
                System.out.print(RESET + "*  | Bilangan 1    : ");
                if (input.hasNextInt()) {
                    x = input.nextInt();
                    
                    // Memeriksa apakah bilangan ganjil
                    if (x % 2 != 0) {  
                        break; // Keluar dari loop jika bilangan ganjil
                    } else {
                        System.out.println(RED + "*  | Bilangan 1 harus ganjil! Silahkan coba lagi." + RESET);
                    }
                } else {
                    System.out.println(RED + "*  | Bilangan 1 harus berupa angka! Silahkan coba lagi." + RESET);
                }
                input.nextLine();  // membersihkan buffer
            }
            
            // Validasi input untuk bilangan kedua (harus genap)
            while (true) {
                System.out.print(RESET + "*  | Bilangan 2    : ");
                if (input.hasNextInt()) {
                    y = input.nextInt();
                    
                    // Memeriksa apakah bilangan genap
                    if (y % 2 == 0) {  
                        break; // Keluar dari loop jika bilangan genap
                    } else {
                        System.out.println(RED + "*  | Bilangan 2 harus genap! Silahkan coba lagi." + RESET);
                    }
                } else {
                    System.out.println(RED + "*  | Bilangan 2 harus berupa angka! Silahkan coba lagi." + RESET);
                }
                input.nextLine();  // membersihkan buffer
            }


            // Menghitung hasil operasi aritmatika
            int penjumlahan = x + y;
            int pengurangan = x - y;
            int perkalian = x * y;
            int pembagian = x / y;
            int modulus = x % y;

            // Menampilkan data mahasiswa
            System.out.println(BLUE + "************************************************************");
            System.out.println(BLUE + "*  ===DATA MAHASISWA===");
            System.out.println(BLUE + "*  | Nama Lengkap  : " + nama);
            System.out.println(BLUE + "*  | NIM           : " + nim);
            System.out.println(BLUE + "*  | Kelas         : " + kelas);
            System.out.println(BLUE + "*  | Umur          : " + umur + " Tahun");
            System.out.println(BLUE + "*  | Alamat        : " + alamat);
            System.out.println(BLUE + "************************************************************");

            // Menampilkan hasil perhitungan aritmatika
            System.out.println(BLUE + "*  ===PROGRAM ARITMATIKA===");
            System.out.println(BLUE + "*  | " + x + " + " + y + " = " + penjumlahan);
            System.out.println(BLUE + "*  | " + x + " - " + y + " = " + pengurangan);
            System.out.println(BLUE + "*  | " + x + " × " + y + " = " + perkalian);
            System.out.println(BLUE + "*  | " + x + " / " + y + " = " + pembagian);
            System.out.println(BLUE + "*  | " + x + " % " + y + " = " + modulus);

            // Menampilkan copyright
            System.out.println(BLUE + "************************************************************");
            System.out.println(RESET + "   Copyright © 2024 RifkyPutraRamadhan. All rights reserved.");
        }
    }
}
