class Toko {
    Keranjang keranjang = new Keranjang();
    StrukPrinter printer = new StrukPrinter();
    EmailSender email = new EmailSender();
    FileRiwayat riwayat = new FileRiwayat();

    void tambah(Buku buku) {
        keranjang.tambah(buku);
    }

    void checkout(String pelanggan, String alamatEmail, MetodeBayar metode) {
        int total = keranjang.totalBelanja();
        int bayar = metode.totalBayar(total);

        printer.cetak(pelanggan, keranjang, metode.nama(), total, bayar);

        riwayat.simpan(pelanggan + ";" + keranjang.jumlah() + " buku;" + Rupiah.format(bayar));
        email.kirim(alamatEmail, "Terima kasih " + pelanggan + ", total bayar " + Rupiah.format(bayar));
    }
}