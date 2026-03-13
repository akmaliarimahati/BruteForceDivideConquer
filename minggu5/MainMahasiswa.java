package minggu5;
import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] mhs = new Mahasiswa[8];
        mhs[0] = new Mahasiswa("Ahmad", "220101001", 2022, 78, 82);
        mhs[1] = new Mahasiswa("Budi", "220101002", 2022, 85, 88);
        mhs[2] = new Mahasiswa("Cindy", "220101003", 2021, 90, 87);
        mhs[3] = new Mahasiswa("Dian", "220101004", 2021, 76, 79);
        mhs[4] = new Mahasiswa("Eko", "220101005", 2023, 92, 95);
        mhs[5] = new Mahasiswa("Fajar", "220101006", 2020, 88, 85);
        mhs[6] = new Mahasiswa("Gina", "220101007", 2023, 80, 83);
        mhs[7] = new Mahasiswa("Hadi", "220101008", 2020, 82, 84);

        while (true) {
            System.out.println("\nMenu Perhitungan Data Mahasiswa:");
            System.out.println("1. Tampil Semua Data");
            System.out.println("2. Tampilkan Nilai UTS Tertinggi (Divide & Conquer)");
            System.out.println("3. Tampilkan Nilai UTS Terendah (Divide & Conquer)");
            System.out.println("4. Tampilkan Rata-rata Nilai UAS (Brute Force)");
            System.out.println("5. Keluar");

            System.out.print("Pilih menu (1-5): ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.printf("\n%-20s %-20s %-20s %-20s %-20s \n", "Nama", "NIM", "Tahun Masuk", "Nilai UTS", "Nilai UAS");
                    for(int i = 0; i < mhs.length; i++) {
                        mhs[i].tampilData();
                    }
                    break;

                case 2:
                    int max = Mahasiswa.maxUts(mhs, 0, mhs.length - 1);
                    System.out.println("\nNilai UTS Tertinggi: " + max);
                    break;

                case 3:
                    int min = Mahasiswa.minUts(mhs, 0, mhs.length - 1);
                    System.out.println("\nNilai UTS Terendah: " + min);
                    break;

                case 4:
                    double rata = Mahasiswa.rataUas(mhs);
                    System.out.println("\nRata - Rata Nilai UAS: " + rata);
                    break;

                case 5:
                    System.out.println("\nProgram Selesai. Terima Kasih!");
                    return;

                default:
                    System.out.println("\nPilihan Menu Tidak Valid! Silakan Pilih Menu 1-5.");
            }
        }
    }
}
