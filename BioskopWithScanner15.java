import java.util.Scanner;
public class BioskopWithScanner15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] penonton = new String[4][2];
        String nama, next;
        int baris, kolom;

        while (true) {
            System.out.println("====== Pilihan menu bioskop 'DASPRO' ======");
            System.out.println("1. Input data penonton");
            System.out.println("2. Daftar Penonton");
            System.out.println("3. exit");
            System.out.print("Masukkan sesuai no yang tertera: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
        
        
            if (pilihan == 1){
                while (true){
                    System.out.println();
                    System.out.println("------ IDENTITAS PENONTON ------");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Input baris atau kolom tidak valid!");
                    } else {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton sukses disimpan!");
                            break;
                        } else {
                            System.out.println("Tempat sudah terisi, silakan pilih tempat lain.");
                        }
                    }

                    penonton[baris-1][kolom-1] = nama;

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();
                
                    if (next.equalsIgnoreCase("n")) {
                    break;
                    }
                }

            }if (pilihan == 2){
                System.out.println();
                System.out.println("------ DENAH KURSI PENONTON ------");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("Penonton pada baris ke-" + (i + 1) + ": ");
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.print((penonton[i][j] != null ? penonton[i][j] : "***") + "\t");
                    }
                    System.out.println();
                }

            } if (pilihan == 3) {
                break;
            }
        }
        System.out.println("====== Bioskop telah tutup ======");
    }
}
