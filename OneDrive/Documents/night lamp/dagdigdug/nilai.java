import java.util.Scanner; // Digunakan untuk menerima input dari user

public class nilai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Menyimpan data mahasiswa
        String[] dataNama = new String[3];
        int[] dataNilai = new int[3];

        // Status program
        boolean dataAda = false;
        boolean lanjut = true;

        // Loop utama aplikasi
        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Rekap Kelulusan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");

            int menu = input.nextInt();
            input.nextLine(); // membersihkan buffer

            if (menu == 1) {
                // Input data mahasiswa
                for (int index = 0; index < dataNama.length; index++) {
                    System.out.print("Masukkan nama mahasiswa ke-" + (index + 1) + ": ");
                    dataNama[index] = input.nextLine();

                    System.out.print("Masukkan nilai akhir: ");
                    dataNilai[index] = input.nextInt();
                    input.nextLine();
                }
                dataAda = true;

            } else if (menu == 2) {
                // Menampilkan data mahasiswa
                if (!dataAda) {
                    System.out.println("Belum ada data yang dimasukkan.");
                } else {
                    for (int i = 0; i < dataNama.length; i++) {
                        System.out.println((i + 1) + ". " + dataNama[i]
                                + " | Nilai: " + dataNilai[i]);
                    }
                }

            } else if (menu == 3) {
                // Menghitung lulus dan tidak lulus
                if (!dataAda) {
                    System.out.println("Data kosong, silakan input terlebih dahulu.");
                } else {
                    int totalLulus = 0;
                    int totalTidakLulus = 0;

                    for (int i = 0; i < dataNilai.length; i++) {
                        if (dataNilai[i] >= 60) {
                            totalLulus++;
                        } else {
                            totalTidakLulus++;
                        }
                    }

                    System.out.println("Mahasiswa Lulus     : " + totalLulus);
                    System.out.println("Mahasiswa Tidak Lulus: " + totalTidakLulus);
                }

            } else if (menu == 4) {
                // Keluar dari aplikasi
                lanjut = false;

            } else {
                System.out.println("Menu tidak tersedia.");
            }

            // Konfirmasi ulang
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