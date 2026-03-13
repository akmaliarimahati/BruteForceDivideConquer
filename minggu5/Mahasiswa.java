package minggu5;

public class Mahasiswa {
    String nama, nim;
    int tahunMasuk, nilaiUts, nilaiUas;

    public Mahasiswa() {

    }

    public Mahasiswa(String nama, String nim, int tahunMasuk, int nilaiUts, int nilaiUas) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    void tampilData() {
        System.out.printf("%-20s %-20s %-20d %-20d %-20d \n", nama, nim, tahunMasuk, nilaiUts, nilaiUas);
    }

    static int maxUts(Mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUts;
        }

        int mid = (l + r) / 2;
        int lmax = maxUts(mhs, l, mid);
        int rmax = maxUts(mhs, mid + 1, r);

        if (lmax > rmax) {
            return lmax;
        } else {
            return rmax;
        }
    }

    static int minUts(Mahasiswa [] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUts;
        }

        int mid = (l + r) / 2;
        int lmax = minUts(mhs, l, mid);
        int rmax = minUts(mhs, mid + 1, r);

        if (lmax < rmax) {
            return lmax;
        } else {
            return rmax;
        }
    }

    static double rataUas(Mahasiswa[] mhs) {
        double total = 0; 
        for(int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUas;
        }
        return total / mhs.length;
    }
}
