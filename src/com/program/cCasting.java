package com.program;

public class cCasting {
    public static void main(String[] args) {
        
        // Contoh 1: Pembagian dengan float dan double
        int x = 10;
        int y = 3;
        
        // Pembagian dengan float
        float floatResult = (float) x / y;
        System.out.println("Hasil pembagian dengan float: " + floatResult);
        
        // Tambahkan baris kosong
        System.out.println();
        
        // Pembagian dengan double
        double doubleResult = (double) x / y;
        System.out.println("Hasil pembagian dengan double: " + doubleResult);
        
        // Tambahkan baris kosong
        System.out.println();

        // Contoh 2: Operasi matematika dasar dengan float dan double
        float a = 10.5f;
        double b = 3.2;
        
        // Penjumlahan
        float sum = a + (float)b;
        System.out.println("Penjumlahan: " + sum);
        
        // Perkalian
        double product = a * b;
        System.out.println("Perkalian: " + product);
        
        // Pembagian
        double division = a / b;
        System.out.println("Pembagian: " + division);
        
        // Tambahkan baris kosong
        System.out.println();

        // Contoh 3: Casting antara float dan double
        float f = 9.8f;
        double d = f; // implicit casting dari float ke double
        System.out.println("Double value (dari float): " + d);

        double d2 = 9.8;
        float f2 = (float) d2; // explicit casting dari double ke float
        System.out.println("Float value after casting (dari double): " + f2);
        
        // Tambahkan baris kosong
        System.out.println();

        // Contoh 4: Penggunaan Float dan Double dalam Trigonometri
        double angle = 45.0;
        double radians = Math.toRadians(angle); // Mengubah derajat ke radian
        
        float sineValue = (float) Math.sin(radians); // Sin dalam float
        double cosValue = Math.cos(radians); // Cos dalam double
        
        System.out.println("Sin(45°) in float: " + sineValue);
        System.out.println("Cos(45°) in double: " + cosValue);
        
        // Tambahkan baris kosong
        System.out.println();

        // Contoh 5: Pembulatan angka dengan float dan double
        double number = 9.87654321;
        
        // Pembulatan ke dua tempat desimal
        double roundedNumber = Math.round(number * 100.0) / 100.0;
        System.out.println("Pembulatan menjadi dua angka desimal: " + roundedNumber);
        
        // Pembulatan ke integer (hilangkan angka desimal)
        int intNumber = (int) number;
        System.out.println("Pembulatan menjadi integer: " + intNumber);
    }
    }
