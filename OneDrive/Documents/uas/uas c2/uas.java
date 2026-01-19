import java.util.Scanner;

public class uas {

    Scanner scanner = new Scanner (System.in);
    String[] namaPenyewa = new String [4];
    String[] kategoriPenyewaan = new String [4];
    String[] jenisKendaraan = new String [4];
    int[] jumlahHariSewa = new int[4];
    double[] totalSewa = new double[4];

    int i = 0;

    public double tarif (String jenisKendaraan) {
        double tarif = 0;

        switch (jenisKendaraan) {
            case "Motor":
                tarif = 75000;
                break;
            case "Mobil":
                tarif = 250000;
                break;
            case "Minibus":
                tarif = 400000;
                break;
        }
        return tarif;
        }
    

        double hitungTotal(double tarif, int hari) {
        double total = tarif * hari;

        if (hari > 3) {
                total = total - (0.15 * total);
            }
            return total;
        }

        String Kategori(double totalSewa) {
        for (int i = 0; i < 4; i++) {
        if (totalSewa < 300000) {
            return "Ekonomis";
        } else if (totalSewa <= 750000) {
            return "Standar";
        } else {
            return "Premium"; 
        } 

        }
        
        
    public void inputDataUser() {

        for (int i = 0; i < 4; i++) {

            if (i == 4) {
                System.out.println("Data sudah penuh!");
                break;
            }

            System.out.println(" Data ke-" + (i + 1));
        
                System.out.print("Masukkan Nama Penyewa: ");
                namaPenyewa[i] = scanner.nextLine();

                System.out.print("Masukkan Jenis Kendaraan (Motor/Mobil/Minibus): ");
                jenisKendaraan[i] = scanner.nextLine();

                try {

                System.out.print("Masukkan Jumlah Hari Sewa: ");
                jumlahHariSewa[i] = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception error) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();

                double tarif = tarif(jenisKendaraan[i]);totalSewa[i] = hitungTotal(tarif, jumlahHariSewa[i]);
                kategoriPenyewaan[i] = Kategori(totalSewa[i]);
            }
            }
        }

        public void tampilDataUser() {

        if ( i == 0) {
            System.out.println("Data belum ada!");
        } else {
            for (int i = 0; i < 4; i++) {
                System.out.println("Data " + (i + 1));
                System.out.println("Nama      : " + namaPenyewa[i]);
                System.out.println("Kendaraan : " + jenisKendaraan[i]);
                System.out.println("Hari      : " + jumlahHariSewa[i]);
                System.out.println("Total     : Rp " + totalSewa[i]);
                System.out.println("Kategori  : " + kategoriPenyewaan[i]);
            }
        }
    }

     public void ratarata() {

        if (i == 0) {
            System.out.println("Belum ada data!");
        } else {

            for (int i = 0; i < 4; i++) {
            }

            System.out.println("     RATA RATA  ");
            for (int i=0; i < jenisKendaraan.length; i++) {
            System.out.println(jenisKendaraan[i] + "=" + jumlahHariSewa[i]);
            }

        }
    }

    public static void main(String[] args) {

        uas obj = new uas();
        String kondisi;

        do {
            System.out.println("TAMPILAN MENU");
            System.out.println("1. Hitung Biaya Sewa");
            System.out.println("2. Tampilan Sewa Kendaraan");
            System.out.println("3. Rata-rata Biaya Sewa");
            System.out.println("4. keluar");
            System.out.print("masukkan pilihan anda: ");
            int pilihan = obj.scanner.nextInt();
            obj.scanner.nextLine();

            switch (pilihan) {
                case 1:
                    obj.inputDataUser();
                    break;
                case 2:
                    obj.tampilDataUser();
                    break;
                case 3:
                    obj.ratarata();
                    break;
                
                    default:
                    System.out.println("Menu tidak tersedia");

                
            }
                System.out.print("apakah anda ingin lanjut? ");
                kondisi = obj.scanner.nextLine();
                } while (kondisi.equals("y"));

       System.out.println("saya ngga tau errornya dimana lagi ini pak:(");
    }

}
