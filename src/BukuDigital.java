class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    public String linkUnduh() {
        return "https://toko.buku/ebook/" + slug();
    }

    int hargaAkhir() {
        return getHarga() * 80 / 100;
    }

    String keterangan() {
        return ukuranMB + " MB, diskon 20%";
    }

    void daftarkanKe(Keranjang keranjang) {
        keranjang.tambahDiunduh(this);
    }
}