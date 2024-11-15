package uts_semester1; 
import java.util.Scanner;

public class UTS {

    public static void main(String[] args) {
        String nama, kelas, alamat;
        int nim, umur, x, y;

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("   ===UTS PEMROGRAMAN DASAR===\n");

            System.out.print("   Nama Lengkap  : ");
            nama = input.nextLine();

            while (true) {
                System.out.print("   NIM           : ");
                if (input.hasNextInt()) {
                    nim = input.nextInt();
                    input.nextLine();
                    break;
                } else {
                    System.out.println("   Hanya Boleh Memasukkan Angka, Silahkan Coba Kembali!");
                    input.nextLine();
                }
            }
            
            System.out.print("   Kelas         : ");
            kelas = input.nextLine();

            while (true) {
                System.out.print("   Umur          : ");
                if (input.hasNextInt()) {
                    umur = input.nextInt();
                    input.nextLine();
                    break;
                } else {
                    System.out.println("   Hanya Boleh Memasukkan Angka, Silahkan Coba Kembali!");
                    input.nextLine();
                }
            }

            System.out.print("   Alamat        : ");
            alamat = input.nextLine();

            while (true) {
                System.out.print("   Bilangan 1    : ");
                if (input.hasNextInt()) {
                    x = input.nextInt();
                    input.nextLine();
                    break;
                } else {
                    System.out.println("   Hanya Boleh Memasukkan Angka, Silahkan Coba Kembali!");
                    input.nextLine();
                }
            }

            while (true) {
                System.out.print("   Bilangan 2    : ");
                if (input.hasNextInt()) {
                    y = input.nextInt();
                    input.nextLine();
                    break;
                } else {
                    System.out.println("   Hanya Boleh Memasukkan Angka, Silahkan Coba Kembali!");
                    input.nextLine();
                }
            }

            int penjumlahan = x + y;
            int pengurangan = x - y;
            int perkalian = x * y;
            int pembagian = x / y;
            int modulus = x % y;

            System.out.println("************************************************************");
            System.out.println("*  ===DATA DIRI===");
            System.out.println("*  Nama Lengkap  : " + nama);
            System.out.println("*  NIM           : " + nim);
            System.out.println("*  Kelas         : " + kelas);
            System.out.println("*  Umur          : " + umur + " Tahun");
            System.out.println("*  Alamat        : " + alamat);
            System.out.println("*  ");
            
            System.out.println("*  ===PROGRAM ARITMATIKA===");
            System.out.println("*  " + x + " + " + y + " = " + penjumlahan);
            System.out.println("*  " + x + " - " + y + " = " + pengurangan);
            System.out.println("*  " + x + " × " + y + " = " + perkalian);
            System.out.println("*  " + x + " / " + y + " = " + pembagian);
            System.out.println("*  " + x + " % " + y + " = " + modulus);
            
            System.out.println("*  ");
            System.out.println("*  Copyright © 2024 RifkyPutraRamadhan. All rights reserved.");
            System.out.println("************************************************************");
        }
    }
}
