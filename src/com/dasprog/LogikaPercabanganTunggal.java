package com.dasprog;
import java.util.Scanner;

public class LogikaPercabanganTunggal {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("=== Program Logika Percabangan Tunggal ===");
    System.out.print("Masukkan Nilai = ");
    int nilai = input.nextInt();

    if (nilai >= 90) { 
        System.out.println("Lulus Dengan Nilai Tinggi");
    }
  }
}
