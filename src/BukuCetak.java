class BukuCetak extends Buku implements BisaDikirim {
    private int beratGram;

    BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    public int getBeratGram() {
        return beratGram;
    }

    private int hitungOngkir() {
        int kelipatan = (beratGram + 499) / 500;
        return kelipatan * 5000;
    }

    int hargaAkhir() {
        return getHarga() + hitungOngkir();
    }

    String keterangan() {
        return beratGram + " gram, ongkir " + Rupiah.format(hitungOngkir());
    }

    void daftarkanKe(Keranjang keranjang) {
        keranjang.tambahDikirim(this);
    }
}