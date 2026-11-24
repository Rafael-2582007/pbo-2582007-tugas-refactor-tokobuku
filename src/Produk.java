interface Produk {
    String getJudul();
    String getPenulis();
    int getHarga();
    int getBeratGram();      // hanya masuk akal untuk buku cetak
    String linkUnduh();      // hanya masuk akal untuk buku digital & audio
    int getDurasiMenit();    // hanya masuk akal untuk buku audio
}