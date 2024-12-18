package com.program;

public class cIfTunggal {
  public static void main(String[] args) {
    
    int nilai = 80; // Nilai yang akan diperiksa
    String jurusan = "Informatika"; // Jurusan yang akan diperiksa
    
    // Memeriksa jurusan menggunakan equals() (memperhatikan kapitalisasi)
    if (jurusan.equals("Informatika")) {
      System.out.println("Jurusan dengan equals(): Benar");
    } else {
      System.out.println("Jurusan dengan equals(): Salah !");
    }

    // Memeriksa jurusan menggunakan equals() (perbedaan kapitalisasi)
    if (jurusan.equals("informatika")) {
      System.out.println("Jurusan dengan equals(): Benar (tanpa memperhatikan kapitalisasi)");
    } else {
      System.out.println("Jurusan dengan equals(): Salah (perbedaan kapitalisasi)");
    }

    // Memeriksa jurusan menggunakan equalsIgnoreCase() (tidak memperhatikan kapitalisasi)
    if (jurusan.equalsIgnoreCase("InFormAtika")) {
      System.out.println("Jurusan dengan equalsIgnoreCase(): Benar");
    } else {
      System.out.println("Jurusan dengan equalsIgnoreCase(): Salah !");
    }

    // Memeriksa jurusan menggunakan == (perbandingan referensi, bukan isi string)
    String jurusan2 = "Informatika";
    if (jurusan == jurusan2) {
      System.out.println("Jurusan dengan == (referensi yang sama): Benar");
    } else {
      System.out.println("Jurusan dengan == (referensi yang sama): Salah !");
    }

    // Memeriksa jurusan2 dan jurusan3 menggunakan == (perbandingan referensi berbeda)
    String jurusan3 = new String("Informatika");
    if (jurusan == jurusan3) {
      System.out.println("Jurusan dengan == (referensi yang sama): Benar");
    } else {
      System.out.println("Jurusan dengan == (referensi yang berbeda): Salah !");
    }
    
    // Memeriksa nilai
    if (nilai >= 75) {
      System.out.println("Nilai lebih besar atau sama dengan 75: Lulus");
    } else {
      System.out.println("Nilai kurang dari 75: Tidak Lulus");
    }
    
    // Cek jika nilai lebih dari 90
    if (nilai > 90) {
      System.out.println("Nilai lebih dari 90: Sangat Lulus");
    } else {
      System.out.println("Nilai kurang dari atau sama dengan 90: Tidak Sangat Lulus");
    }
  }
}
