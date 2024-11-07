package program_persegipanjang;
import java.util.Scanner;
public class ProgramLuas {
  
  public static void main(String[] args) {
    int panjang,lebar;
    Scanner input = new Scanner(System.in);
    System.out.println("====Program Luas Persegi Panjang====");
    
    System.out.print("Masukkan Panjang: ");
      panjang = input.nextInt();
    System.out.print("Masukkan Lebar: ");
      lebar = input.nextInt();
      
    int luas=panjang*lebar;
    
    System.out.println("Luas Persegi Panjang Adalah = "+luas);
    
    input.close();
  }
}