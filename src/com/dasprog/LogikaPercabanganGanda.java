package com.dasprog;
import java.util.Scanner;

public class LogikaPercabanganGanda {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("=== Program Logika Percabangan Ganda ===");
    System.out.print("Masukkan nilai = ");
    int nilai = input.nextInt();

    if (nilai >= 90) {
        System.out.println("Lulus dengan nilai tinggi");
    } else {
        System.out.println("Tidak memenuhi kriteria nilai tinggi");
    }
  }
}
