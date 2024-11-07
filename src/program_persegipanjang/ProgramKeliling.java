package program_persegipanjang;
import java.util.Scanner;

public class ProgramKeliling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, keliling;
        System.out.println("====Program Keliling Persegi Panjang====");

        System.out.print("Masukkan Panjang: ");
        panjang = input.nextDouble();

        System.out.print("Masukkan Lebar: ");
        lebar = input.nextDouble();

        keliling = 2 * (panjang + lebar);

        System.out.println("Keliling Persegi Panjang Adalah: " + keliling);
        
        input.close();
    }
}