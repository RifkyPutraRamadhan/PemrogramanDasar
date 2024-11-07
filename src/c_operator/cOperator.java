package c_operator;

public class cOperator {
    public static void main(String[] args) {
        // 1. Operator penegasan
        boolean isTrue = true;
        System.out.println("Nilai isTrue: " + isTrue);
        
        // 2. Operator Aritmatika
        int x = 4;
        x++; // Increment
        System.out.println("Hasil Increment x: " + x);
        
        int y = 3;
        int sum = x + y; // Penjumlahan
        System.out.println("Hasil Penjumlahan: " + sum);
        
        int product = x * y; // Perkalian
        System.out.println("Hasil Perkalian: " + product);
        
        // 3. Operator Pembanding
        boolean isEqual = (x == y);
        System.out.println("Apakah x sama dengan y? " + isEqual);
        
        boolean isGreater = (x > y);
        System.out.println("Apakah x lebih besar dari y? " + isGreater);
        
        // 4. Operator Logika
        boolean andCondition = (isTrue && isEqual);
        System.out.println("Hasil AND: " + andCondition);
        
        boolean orCondition = (isTrue || isEqual);
        System.out.println("Hasil OR: " + orCondition);
    }
}