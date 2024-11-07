package nama_inisial;

public class inisial {
    public static void main(String[] args) {
      
        int tinggi = 7;
        int lebar = 5;
        
        for (int baris = 0; baris < tinggi; baris++) {
            for (int kolom = 0; kolom < lebar; kolom++) {
                if (kolom == 0 || 
                    (baris == 0 && kolom < lebar - 1) || 
                    (baris == tinggi / 2 && kolom < lebar - 1) || 
                    (kolom == lebar - 1 && baris > 0 && baris < tinggi / 2) || 
                    (baris > tinggi / 2 && kolom == baris - tinggi / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
