class StrukPrinter {
    void cetak(String pelanggan, Keranjang keranjang, String namaMetode, int total, int bayar) {
        System.out.println("================ STRUK =================");
        System.out.println("Pelanggan : " + pelanggan);
        for (Buku b : keranjang.getIsi()) {
            System.out.println(b.getJudul() + " (" + b.getPenulis() + ")");
            System.out.println("  Harga       : " + Rupiah.format(b.getHarga()));
            System.out.println("  Keterangan  : " + b.keterangan());
            System.out.println("  Harga akhir : " + Rupiah.format(b.hargaAkhir()));
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total belanja : " + Rupiah.format(total));
        System.out.println("Metode bayar  : " + namaMetode);
        System.out.println("Total bayar   : " + Rupiah.format(bayar));
        System.out.println("Berat kiriman : " + keranjang.totalBeratKirim() + " gram");

        System.out.println("-------------- LINK UNDUH ---------------");
        for (BisaDiunduh d : keranjang.getDiunduh()) {
            System.out.println(d.linkUnduh());
        }
        System.out.println("-----------------------------------------");
    }
}