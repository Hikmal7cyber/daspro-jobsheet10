import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.println("Pilihan menu bioskop 'DASPRO'");
            System.out.println("1. Input data penonton");
            System.out.println("2. Daftar Penonton");
            System.out.println("3. exit");
            System.out.print("Masukkan sesuai no yang tertera: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
        
        
            if (pilihan == 1){
                while (true){
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                
                    if (next.equalsIgnoreCase("n")) {
                    break;
                    }
                }
            }if (pilihan == 2){
                System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
                System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
                System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
                System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);
            } if (pilihan == 3) {
                break;
            }
        }
        System.out.println("Bioskop telah tutup");
    }
}
