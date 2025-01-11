package com.dasprog;

import java.util.Scanner;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class IkyCafe {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Random rand = new Random();
            int pilihan, jumlah, noMeja = 0;
            int totalHarga = 0, uangDibayar = 0, kembalian = 0;
            boolean selesai = false;
            String namaMenu = "";
            int hargaMenu = 0;
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            formatter.setTimeZone(TimeZone.getTimeZone("Asia/Jakarta"));
            String Tanggal = formatter.format(new Date());
            int[] meja = new int[10];
            StringBuilder detailPesanan = new StringBuilder();

            for (int i = 0; i < meja.length; i++) {
                meja[i] = rand.nextInt(2);
            }

            detailPesanan.append(String.format("%-20s %-10s %-15s\n", "| Nama Menu", "Jumlah", "Harga"));
            detailPesanan.append(String.format("%-20s %-10s %-15s\n", "| ---------", "------", "-----"));

            while (!selesai) {
                System.out.println("\n>>> Selamat Datang Di IkyCafe <<<");
                System.out.println("=== MENU CAFE ===");
                System.out.println("| 1. Makanan    |");
                System.out.println("| 2. Minuman    |");
                System.out.println("=================");

                try {
                    System.out.print("Pilih kategori (1/2): ");
                    pilihan = input.nextInt();

                    if (pilihan < 1 || pilihan > 2) {
                        System.out.println("Kategori tidak valid! Pilih antara 1 atau 2.");
                        continue;
                    }

                    switch (pilihan) {
                        case 1:
                            System.out.println("\n======== Menu Makanan ========");
                            System.out.println("| 1. Nasi Goreng - Rp 20.000 |");
                            System.out.println("| 2. Ayam Goreng - Rp 25.000 |");
                            System.out.println("| 3. Mie Goreng - Rp 18.000  |");
                            System.out.println("| 4. Bakso - Rp 15.000       |");
                            System.out.println("| 5. Soto Ayam - Rp 19.000   |");
                            System.out.println("==============================");
                            System.out.print("Pilih makanan (1-5): ");
                            pilihan = input.nextInt();

                            if (pilihan < 1 || pilihan > 5) {
                                System.out.println("Menu tidak valid! Pilih antara 1 sampai 5.");
                                continue;
                            }

                            switch (pilihan) {
                                case 1 -> { namaMenu = "Nasi Goreng"; hargaMenu = 20000; }
                                case 2 -> { namaMenu = "Ayam Goreng"; hargaMenu = 25000; }
                                case 3 -> { namaMenu = "Mie Goreng"; hargaMenu = 18000; }
                                case 4 -> { namaMenu = "Bakso"; hargaMenu = 15000; }
                                case 5 -> { namaMenu = "Soto Ayam"; hargaMenu = 19000; }
                            }
                            break;

                        case 2:
                            System.out.println("\n======== Menu Minuman ========");
                            System.out.println("| 1. Teh - Rp 5.000          |");
                            System.out.println("| 2. Kopi - Rp 10.000        |");
                            System.out.println("| 3. Jus - Rp 15.000         |");
                            System.out.println("| 4. Susu - Rp 14.000        |");
                            System.out.println("| 5. Air Mineral - Rp 5.000  |");
                            System.out.println("==============================");
                            System.out.print("Pilih minuman (1-5): ");
                            pilihan = input.nextInt();

                            if (pilihan < 1 || pilihan > 5) {
                                System.out.println("Menu tidak valid! Pilih antara 1 sampai 5.");
                                continue;
                            }

                            switch (pilihan) {
                                case 1 -> { namaMenu = "Teh"; hargaMenu = 5000; }
                                case 2 -> { namaMenu = "Kopi"; hargaMenu = 10000; }
                                case 3 -> { namaMenu = "Jus"; hargaMenu = 15000; }
                                case 4 -> { namaMenu = "Susu"; hargaMenu = 14000; }
                                case 5 -> { namaMenu = "Air Mineral"; hargaMenu = 5000; }
                            }
                            break;
                    }

                    System.out.print("Masukkan Jumlah Menu \"" + namaMenu + "\": ");
                    jumlah = input.nextInt();

                    if (jumlah <= 0) {
                        System.out.println("Jumlah tidak valid! Masukkan angka lebih dari 0.");
                        continue;
                    }

                    totalHarga += hargaMenu * jumlah;
                    detailPesanan.append(String.format("| %-20s %-10d Rp.%,-15d", namaMenu, jumlah, hargaMenu * jumlah)).append("\n");

                    System.out.print("Apakah Anda Ingin Menambah Menu Lain? (y/n): ");
                    char tambah = input.next().charAt(0);
                    if (tambah == 'n' || tambah == 'N') {
                        selesai = true;
                    }

                } catch (Exception e) {
                    System.out.println("Input tidak valid! Masukkan angka.");
                    input.nextLine();
                }
            }

            boolean mejaValid = false;
            while (!mejaValid) {
                try {
                    System.out.print("Masukkan Nomor Meja (1-10): ");
                    noMeja = input.nextInt();

                    if (noMeja < 1 || noMeja > 10) {
                        System.out.println("Nomor meja tidak valid! Pilih antara 1 sampai 10.");
                        continue;
                    }

                    if (meja[noMeja - 1] == 1) {
                        System.out.println("Maaf, Meja " + noMeja + " Sudah Terisi.");
                    } else {
                        meja[noMeja - 1] = 1;
                        mejaValid = true;
                        System.out.println("Meja " + noMeja + " Tersedia. Silahkan lanjutkan.");
                    }
                } catch (Exception e) {
                    System.out.println("Input tidak valid! Masukkan angka.");
                    input.nextLine();
                }
            }

            boolean validUang = false;
            while (!validUang) {
                try {
                    System.out.print("Masukkan Uang yang Dibayar (Rp): ");
                    uangDibayar = input.nextInt();

                    if (uangDibayar < totalHarga) {
                        System.out.println("Uang yang diberikan kurang. Silahkan coba lagi.");
                    } else {
                        kembalian = uangDibayar - totalHarga;
                        validUang = true;
                    }
                } catch (Exception e) {
                    System.out.println("Input tidak valid! Masukkan angka.");
                    input.nextLine();
                }
            }

            System.out.println("\n============= STRUK PEMBAYARAN =============");
            System.out.println("| Waktu      : " + Tanggal);
            System.out.println("| No Meja    : " + noMeja);
            System.out.println("| Pesanan    : ");
            System.out.println(detailPesanan.toString());
            System.out.println("| -------------------------------------------");
            System.out.println(String.format("| %-12s: Rp.%,-15d", "Total Bayar", totalHarga));
            System.out.println(String.format("| %-12s: Rp.%,-15d", "Uang Dibayar", uangDibayar));
            System.out.println(String.format("| %-12s: Rp.%,-15d", "Kembalian", kembalian));
            System.out.println("=============================================");
            System.out.println("Terima kasih Atas Kunjungan Anda Ke IkyCafe");
            System.out.println("");
        }
    }
}
