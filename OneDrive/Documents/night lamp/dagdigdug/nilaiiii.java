 import java.util.Scanner; // Digunakan untuk menerima input dari user

public class nilaiiii {
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
            System.out.println("      MENU UTAMA     ");
            System.out.println("1. Input Data Mahasiswa");
            System.out.println("2. Lihat Data Mahasiswa");
            System.out.println("3. Rekap Kelulusan");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan: ");

            int menu = input.nextInt();
            input.nextLine(); // membersihkan buffer

            switch (menu) {

                case 1:
                    // Input data mahasiswa
                    for (int i = 0; i < dataNama.length; i++) {
                        System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
                        dataNama[i] = input.nextLine();

                        System.out.print("Masukkan nilai akhir: ");
                        dataNilai[i] = input.nextInt();
                        input.nextLine();
                    }
                    dataAda = true;
                    break;

                case 2:
                    // Menampilkan data mahasiswa
                    if (!dataAda) {
                        System.out.println("Belum ada data yang dimasukkan.");
                    } else {
                        for (int i = 0; i < dataNama.length; i++) {
                            System.out.println((i + 1) + "." + dataNama[i]+ ": " + dataNilai[i]);
                        }
                    }
                    break;

                case 3:
                    // Rekap kelulusan
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

                        System.out.println("Mahasiswa Lulus      : " + totalLulus);
                        System.out.println("Mahasiswa Tidak Lulus: " + totalTidakLulus);
                    }
                    break;

                case 4:
                    // Keluar program
                    lanjut = false;
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

            // Konfirmasi ulang
            if (lanjut) {
                System.out.print("Ulangi program? (ya/tidak): ");
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
