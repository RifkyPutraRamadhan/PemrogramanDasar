// Package declaration
package com.dasprog;

import java.util.Scanner; // Untuk membaca input dari pengguna
import java.util.Random;  // Untuk menghasilkan angka acak (ketersediaan meja)
import java.util.Date;    // Untuk mendapatkan waktu saat ini
import java.text.SimpleDateFormat; // Untuk memformat tanggal dan waktu
import java.util.TimeZone; // Untuk menentukan zona waktu

public class IkyCafe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner untuk input pengguna
        Random rand = new Random(); // Random untuk status meja
        int pilihan, jumlah, noMeja = 0; // Variabel untuk pilihan menu, jumlah pesanan, dan nomor meja
        int totalHarga = 0; // Variabel untuk menyimpan total harga
        boolean selesai = false; // Flag untuk menghentikan loop pesanan
        String namaMenu = ""; // Variabel untuk menyimpan nama menu
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); // Format waktu
        formatter.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta")); // Set zona waktu Asia/Jakarta
        String Tanggal = formatter.format(new Date()); // Dapatkan waktu saat ini dalam format yang ditentukan
        int[] meja = new int[10]; // Array untuk status meja (0 = kosong, 1 = terisi)

        // Inisialisasi status meja secara acak
        for (int i = 0; i < meja.length; i++) {
            meja[i] = rand.nextInt(2); // 0 atau 1 secara acak
        }

        while (!selesai) { // Loop utama untuk pemesanan menu
            System.out.println("\n>>> Selamat Datang Di IkyCafe <<<");
            System.out.println("=== MENU CAFE ===");
            System.out.println("| 1. Makanan    |");
            System.out.println("| 2. Minuman    |");
            System.out.println("=================");
        
            System.out.print("Pilih kategori (1/2): ");
            pilihan = input.nextInt();

            switch (pilihan) { // Pilihan kategori
                case 1: // Kategori makanan
                    System.out.println("\n======== Menu Makanan ========");
                    // Menampilkan daftar makanan
                    System.out.println("| 1. Nasi Goreng - Rp 20.000 |");
                    System.out.println("| 2. Ayam Goreng - Rp 25.000 |");
                    System.out.println("| 3. Mie Goreng - Rp 18.000  |");
                    System.out.println("| 4. Bakso - Rp 15.000       |");
                    System.out.println("| 5. Soto Ayam - Rp 19.000   |");
                    System.out.println("==============================");
                    System.out.print("Pilih makanan (1-5): ");
                    pilihan = input.nextInt();

                    // Menentukan menu makanan berdasarkan pilihan
                    switch (pilihan) {
                        case 1:
                            namaMenu = "Nasi Goreng";
                            totalHarga += 20000;
                            break;
                        case 2:
                            namaMenu = "Ayam Goreng";
                            totalHarga += 25000;
                            break;
                        case 3:
                            namaMenu = "Mie Goreng";
                            totalHarga += 18000;
                            break;
                        case 4:
                            namaMenu = "Bakso";
                            totalHarga += 15000;
                            break;
                        case 5:
                            namaMenu = "Soto Ayam";
                            totalHarga += 19000;
                            break;
                        default:
                            System.out.println("Menu tidak valid!"); // Validasi pilihan menu
                            continue;
                    }
                    break;

                case 2: // Kategori minuman
                    System.out.println("\n======== Menu Minuman ========");
                    // Menampilkan daftar minuman
                    System.out.println("| 1. Teh - Rp 5.000          |");
                    System.out.println("| 2. Kopi - Rp 10.000        |");
                    System.out.println("| 3. Jus - Rp 15.000         |");
                    System.out.println("| 4. Susu - Rp 14.000        |");
                    System.out.println("| 5. Air Mineral - Rp 5.000  |");
                    System.out.println("==============================");
                    System.out.print("Pilih minuman (1-5): ");
                    pilihan = input.nextInt();

                    // Menentukan menu minuman berdasarkan pilihan
                    switch (pilihan) {
                        case 1:
                            namaMenu = "Teh";
                            totalHarga += 5000;
                            break;
                        case 2:
                            namaMenu = "Kopi";
                            totalHarga += 10000;
                            break;
                        case 3:
                            namaMenu = "Jus";
                            totalHarga += 15000;
                            break;
                        case 4:
                            namaMenu = "Susu";
                            totalHarga += 14000;
                            break;
                        case 5:
                            namaMenu = "Air Mineral";
                            totalHarga += 5000;
                            break;
                        default:
                            System.out.println("Menu tidak valid!"); // Validasi pilihan menu
                            continue;
                    }
                    break;

                default: // Validasi pilihan kategori
                    System.out.println("Kategori tidak valid!");
                    continue;
            }

            // Input jumlah pesanan
            System.out.print("Masukkan Jumlah Menu \"" + namaMenu + "\": ");
            jumlah = input.nextInt();
            totalHarga *= jumlah;

            // Menanyakan apakah ingin menambah pesanan
            System.out.print("Apakah Anda Ingin Menambah Menu Lain? (y/n): ");
            char tambah = input.next().charAt(0);
            if (tambah == 'n' || tambah == 'N') {
                selesai = true; // Keluar dari loop jika tidak ingin menambah pesanan
            }
        }

        // Validasi nomor meja
        boolean mejaValid = false;
        while (!mejaValid) {
            System.out.print("Masukkan Nomor Meja (1-10): ");
            noMeja = input.nextInt();

            if (meja[noMeja - 1] == 1) { // Jika meja sudah terisi
                System.out.println("Maaf, Meja " + noMeja + " Sudah Terisi.");
            } else { // Jika meja tersedia
                meja[noMeja - 1] = 1;
                mejaValid = true;
                System.out.println("Meja " + noMeja + " Tersedia. Silakan lanjutkan.");
            }
        }

        // Menampilkan struk pembayaran
        System.out.println("\n=========== STRUK PEMBAYARAN ===========");
        System.out.println("| Waktu      : " + Tanggal);
        System.out.println("| No Meja    : " + noMeja);
        System.out.println("| Total Bayar: Rp " + totalHarga);
        System.out.println("========================================");
        System.out.println("Terima kasih telah memesan di Cafe Kami!");
    }
}
