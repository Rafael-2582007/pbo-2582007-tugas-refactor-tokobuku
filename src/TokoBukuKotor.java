public class TokoBukuKotor {
    public static void main(String[] args) {
        Toko toko = new Toko();
        toko.tambah(new Buku("CETAK", "Pemrograman Java", "John Doe", 120000, 750, 0, 0));
        toko.tambah(new Buku("CETAK", "Algoritma Dasar", "Jane Smith", 95000, 400, 0, 0));
        toko.tambah(new Buku("DIGITAL", "Belajar OOP", "Ani Wijaya", 80000, 0, 12.5, 0));
        toko.tambah(new Buku("AUDIO", "Kisah Programmer", "Budi Santoso", 60000, 0, 0, 240));
        toko.checkout("Sari", "sari@mail.com", "EWALLET");
    }
}