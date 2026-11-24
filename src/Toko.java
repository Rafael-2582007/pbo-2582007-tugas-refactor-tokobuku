class Toko {
    Keranjang keranjang = new Keranjang();
    StrukPrinter printer = new StrukPrinter();
    EmailSender email = new EmailSender();
    FileRiwayat riwayat = new FileRiwayat();

    void tambah(Buku buku) {
        keranjang.tambah(buku);
    }

    String namaMetode(String metode) {
        if (metode.equals("TUNAI")) {
            return "Tunai";
        } else if (metode.equals("TRANSFER")) {
            return "Transfer (+Rp2.500)";
        } else if (metode.equals("EWALLET")) {
            return "E-Wallet (diskon 2%)";
        }
        return "?";
    }

    int totalBayar(String metode, int totalBelanja) {
        if (metode.equals("TUNAI")) {
            return totalBelanja;
        } else if (metode.equals("TRANSFER")) {
            return totalBelanja + 2500;
        } else if (metode.equals("EWALLET")) {
            return totalBelanja * 98 / 100;
        }
        return totalBelanja;
    }

    void checkout(String pelanggan, String alamatEmail, String metode) {
        int total = keranjang.totalBelanja();
        int bayar = totalBayar(metode, total);

        printer.cetak(pelanggan, keranjang, namaMetode(metode), total, bayar);

        riwayat.simpan(pelanggan + ";" + keranjang.jumlah() + " buku;" + Rupiah.format(bayar));
        email.kirim(alamatEmail, "Terima kasih " + pelanggan + ", total bayar " + Rupiah.format(bayar));
    }
}