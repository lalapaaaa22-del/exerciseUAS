import java.util.Scanner;
import java.util.ArrayList;

public class nilaiii4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ArrayList (tidak dibatasi jumlah data)
        ArrayList<String> dataNama = new ArrayList<>();
        ArrayList<Integer> dataNilai = new ArrayList<>();

        boolean dataAda = false;
        boolean lanjut = true;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Rekap Kelulusan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");

            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {

                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = input.nextLine();

                    System.out.print("Masukkan nilai akhir: ");
                    int nilai = input.nextInt();
                    input.nextLine();

                    dataNama.add(nama);    // tambah data
                    dataNilai.add(nilai);  // tambah data
                    dataAda = true;

                    break;

                case 2:
                    if (!dataAda) {
                        System.out.println("Belum ada data yang dimasukkan.");
                    } else {
                        for (int i = 0; i < dataNama.size(); i++) {
                            System.out.println((i + 1) + ". "+ dataNama.get(i)+ " | Nilai: " + dataNilai.get(i));
                        }
                    }
                    break;

                case 3:
                    if (!dataAda) {
                        System.out.println("Data kosong, silakan input terlebih dahulu.");
                    } else {
                        int totalLulus = 0;
                        int totalTidakLulus = 0;

                        for (int i = 0; i < dataNilai.size(); i++) {
                            if (dataNilai.get(i) >= 60) {
                                totalLulus++;
                            } else {
                                totalTidakLulus++;
                            }
                        }

                        System.out.println("Mahasiswa Lulus      : " + totalLulus);
                        System.out.println("Mahasiswa Tidak Lulus: " + totalTidakLulus);
                    }
                    break;

                case 4:
                    lanjut = false;
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

            if (lanjut) {
                System.out.print("\nUlangi program? (ya/tidak): ");
                String jawab = input.nextLine();
                if (!jawab.equalsIgnoreCase("ya")) {
                    lanjut = false;
                }
            }

        } while (lanjut);

        input.close();
        System.out.println("Aplikasi ditutup.");
    }
}
