package com.dasprog;
import java.util.Scanner;

public class LogikaPercabanganMajemuk {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Nilai = ");
    int nilai = input.nextInt();

    if (nilai >= 90) {
        System.out.println("Predikat Nilai Anda A");
    } else if (nilai >= 70) {
        System.out.println("Predikat Nilai Anda B");
    } else if (nilai >= 60) {
        System.out.println("Predikat Nilai Anda C");
    } else {
        System.out.println("Anda gagal, Silahkan Mengulang Kembali!");
    }
  }
}
