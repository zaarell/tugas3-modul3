/**
 * Kelas MainApp berfungsi sebagai kelas utama (main class)
 * yang menjalankan program perhitungan gaji karyawan.
 * Kelas ini membuat beberapa objek karyawan dan menampilkan slip gaji masing-masing.
 */
public class MainApp {
    /** Konstanta untuk menentukan persentase bonus kehadiran (10%) */
    private static final double GAJI_UTAMA = 0.1;

    /**
     * Mengembalikan nilai konstanta bonus kehadiran.
     * @return  nilai bonus dalam bentuk desimal (misal 0.1 = 10%)
     */
    public static double getGajiUtama() {
        return GAJI_UTAMA;
    }

    /**
     * Method utama untuk menjalankan program.
     * Membuat beberapa objek karyawan, lalu menampilkan slip gaji
     * Menggunakan method {@code displayInfo()}.
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        System.out.println("  SISTEM KALKULATOR GAJI KARYAWAN");
        System.out.println("====================================");

        Tugas2 karyawan1 = new Tugas2("Aurel", "Manager", 8000000, 23);
        Tugas2 karyawan2 = new Tugas2("Salza", "Staff", 5000000, 20);
        Tugas2 karyawan3 = new Tugas2("Abel", "Supervisor", 6500000, 22);
        Tugas2 karyawan4 = new Tugas2("Lia", "Magang", 3000000, 21);
        Tugas2 karyawan5 = new Tugas2("Mahes", "Manager", 8000000, 23);

        karyawan1.displayInfo();
        karyawan2.displayInfo();
        karyawan3.displayInfo();
        karyawan4.displayInfo();
        karyawan5.displayInfo();
    }
}

