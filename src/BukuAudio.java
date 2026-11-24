class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;

    BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    public String linkUnduh() {
        return "https://toko.buku/audio/" + slug();
    }

    int hargaAkhir() {
        return getHarga() * 90 / 100;
    }

    String keterangan() {
        return durasiMenit + " menit, diskon 10%";
    }

    void daftarkanKe(Keranjang keranjang) {
        keranjang.tambahDiunduh(this);
    }
}