abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    String getJudul() {
        return judul;
    }

    String getPenulis() {
        return penulis;
    }

    int getHarga() {
        return harga;
    }

    String slug() {
        return judul.toLowerCase().replace(' ', '-');
    }

    abstract int hargaAkhir();

    abstract String keterangan();

    abstract void daftarkanKe(Keranjang keranjang);
}