package mahasiswa_stmikdci;
import java.util.Scanner;

public class DataMahasiswa {

        public static void main(String[] args) {
            
            String nama, prodi, alamat;
            int nim, umur, semester;

            try (Scanner input = new Scanner(System.in)) {

            System.out.println("::___Data Mahasiswa STMIK DCI Tasikmalaya___::");

            System.out.print("Nama Lengkap Mahasiswa: ");
            nama = input.nextLine();

            System.out.print("Prodi: ");
            prodi = input.nextLine();

            System.out.print("Alamat: ");
            alamat = input.nextLine();

             while (true) {
                System.out.print("NIM: ");
                if (input.hasNextInt()) {
                    nim = input.nextInt();
                    break;
                } else {
                    System.out.println("Hanya Boleh Memasukkan Angka, Silahkan Coba Kembali!");
                    input.next();
                }
            }

            while (true) {
                System.out.print("Umur: ");
                if (input.hasNextInt()) {
                    umur = input.nextInt();
                    break;
                } else {
                    System.out.println("Hanya Boleh Memasukkan Angka, Silahkan Coba Kembali!");
                    input.next();
                }
            }

            while (true) {
                System.out.print("Semester: ");
                if (input.hasNextInt()) {
                    semester = input.nextInt();
                    break;
                } else {
                    System.out.println("Hanya Boleh Memasukkan Angka, Silahkan Coba Kembali!");
                    input.next();
                }
            }

            System.out.println("________________________________________________");
            System.out.println("Nama Lengkap Mahasiswa : " + nama);
            System.out.println("Prodi : " + prodi);
            System.out.println("NIM : " + nim);
            System.out.println("Alamat : " + alamat);
            System.out.println("Umur : " + umur);
            System.out.println("Semester : " + semester);
        }
    }
}
