package outputedge;
import java.util.Scanner;

public class OutputEdge {
  
  public static void main(String[] args) {
    
    String nama, kelas;
    int nim;
    
    try (Scanner input = new Scanner(System.in)) {
      
      System.out.print("Nama : ");
      nama = input.nextLine();
      
      System.out.print("Kelas : ");
      kelas = input.nextLine();
      
      System.out.print("NIM : ");
      nim = input.nextInt();
      
      System.out.print("Nama :" + nama);
      System.out.print(" NIM :" + nim);
      System.out.print(" Kelas :" + kelas);
      
    }
  }
}
