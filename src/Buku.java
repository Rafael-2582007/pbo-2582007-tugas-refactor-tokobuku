class Buku implements Produk {
    String jenis;            // "CETAK", "DIGITAL", atau "AUDIO"
    String judul;
    String penulis;
    int harga;
    int beratGram;
    double ukuranMB;
    int durasiMenit;

    Buku(String jenis, String judul, String penulis, int harga,
         int beratGram, double ukuranMB, int durasiMenit) {
        this.jenis = jenis;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
        this.beratGram = beratGram;
        this.ukuranMB = ukuranMB;
        this.durasiMenit = durasiMenit;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public int getBeratGram() {
        if (!jenis.equals("CETAK")) {
            throw new UnsupportedOperationException(judul + " tidak punya berat");
        }
        return beratGram;
    }

    public String linkUnduh() {
        String slug = judul.toLowerCase().replace(' ', '-');
        if (jenis.equals("DIGITAL")) {
            return "https://toko.buku/ebook/" + slug;
        } else if (jenis.equals("AUDIO")) {
            return "https://toko.buku/audio/" + slug;
        }
        throw new UnsupportedOperationException(judul + " tidak bisa diunduh");
    }

    public int getDurasiMenit() {
        if (!jenis.equals("AUDIO")) {
            throw new UnsupportedOperationException(judul + " bukan buku audio");
        }
        return durasiMenit;
    }

    int hitungOngkir() {
        int kelipatan = (getBeratGram() + 499) / 500;
        return kelipatan * 5000;
    }

    int hargaAkhir() {
        switch (jenis) {
            case "CETAK":
                return getHarga() + hitungOngkir();
            case "DIGITAL":
                return getHarga() * 80 / 100;
            case "AUDIO":
                return getHarga() * 90 / 100;
            default:
                return getHarga();
        }
    }

    String keterangan() {
        switch (jenis) {
            case "CETAK":
                return getBeratGram() + " gram, ongkir " + Rupiah.format(hitungOngkir());
            case "DIGITAL":
                return ukuranMB + " MB, diskon 20%";
            case "AUDIO":
                return getDurasiMenit() + " menit, diskon 10%";
            default:
                return "-";
        }
    }
}