/**
 * Merepresentasikan data dan perhitungan gaji seorang karyawan.
 * Kelas ini mencakup atribut dasar seperti nama, jabatan, gaji pokok, dan jumlah hadir.
 * Di dalamnya juga terdapat logika untuk menghitung tunjangan, bonus, potongan,serta gaji bersih yang diterima.
 */
public class Tugas2 {

    private String nama;
    private String jabatan;
    private double gajiPokok;
    private int jumlahHadir;

    /**
     * Konruktor untuk menginisialisasi objek karyawan dengan data dasar.
     * @param nama
     * @param jabatan
     * @param gajiPokok
     * @param jumlahHadir
     */
    public Tugas2(String nama, String jabatan, double gajiPokok, int jumlahHadir) {
        this.setNama(nama);
        this.setJabatan(jabatan);
        this.setGajiPokok(gajiPokok);
        this.setJumlahHadir(jumlahHadir);
    }

    /**
     * Menampilkan informasi lengkap slip gaji karyawan, termasuk:
     * gaji pokok
     * tunjangan berdasarkan jabatan
     * bonus kehadiran
     * potongan tetap
     * total gaji bersih
     */
    public void displayInfo() {
        // MASALAH 3: Magic numbers (angka hardcode tanpa penjelasan)
        // MASALAH 4: Logika perhitungan tunjangan langsung di method ini (tidak modular!)
        double tunjangan = 0;
        if (getJabatan().equals("Manager")) {
            tunjangan = 500000 + 400000 + 600000; // Apa maksud angka-angka ini?
        } else if (getJabatan().equals("Supervisor")) {
            tunjangan = 400000 + 350000 + 450000;
        } else if (getJabatan().equals("Staff")) {
            tunjangan = 300000 + 250000 + 200000;
        } else {
            tunjangan = 200000 + 150000 + 100000; // Untuk Magang
        }

        // MASALAH 5: Logika perhitungan bonus langsung di sini juga
        double bonus = 0;
        if (getJumlahHadir() >= 22) { // Magic number: 22
            bonus = getGajiPokok() * MainApp.getGajiUtama(); // Magic number: 0.1
        }

        // MASALAH 6: Logika perhitungan potongan langsung di sini

        // MASALAH 7: Perhitungan gaji bersih langsung
        double gajibersih = getGajiPokok() + tunjangan + bonus - getPotongan();

        // MASALAH 8: Nama variabel tidak deskriptif (tunjangan, bonus, potongan, gajibersih)
        System.out.println("=== SLIP GAJI KARYAWAN ===");
        System.out.println("Nama            : " + getNama());
        System.out.println("Jabatan         : " + getJabatan());
        System.out.println("Gaji Pokok      : Rp " + getGajiPokok());
        System.out.println("Tunjangan       : Rp " + tunjangan);
        System.out.println("Bonus Hadir     : Rp " + bonus);
        System.out.println("Potongan        : Rp " + getPotongan());
        System.out.println("---------------------------");
        System.out.printf("Gaji Bersih     : Rp %.0f%n", gajibersih);
        System.out.println("===========================\n");
    }

    /**
     *  Mengembalikan nilai potongan tetap yang berlaku untuk setiap karyawan.
     *  Saat ini nilainya tetap (Rp 50.000 + Rp 25.000).
     * @return jumlah potongan dalam rupiah
     */
    private static double getPotongan() {
        double potongan = 50000 + 25000; // Magic numbers: 50000, 25000
        return potongan;
    }

    /** @return nama karyawan */
    public String getNama() {
        return nama;
    }

    /** @param nama nama karyawan */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /** @return jabatan karyawan */
    public String getJabatan() {
        return jabatan;
    }

    /** @param jabatan jabatan karyawan */
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    /** @return gaji pokok karyawan */
    public double getGajiPokok() {
        return gajiPokok;
    }

    /** @param gajiPokok gaju pokok karyawan */
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /** @return jumlah kehadiran karyawan dalam sebulan */
    public int getJumlahHadir() {
        return jumlahHadir;
    }

    /** @param jumlahHadir jumlah kehadiran karyawan */
    public void setJumlahHadir(int jumlahHadir) {
        this.jumlahHadir = jumlahHadir;
    }
}

