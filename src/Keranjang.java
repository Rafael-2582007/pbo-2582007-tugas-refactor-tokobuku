import java.util.ArrayList;

class Keranjang {
    private ArrayList<Buku> isi = new ArrayList<>();

    void tambah(Buku buku) {
        isi.add(buku);
    }

    ArrayList<Buku> getIsi() {
        return isi;
    }

    int jumlah() {
        return isi.size();
    }

    int totalBelanja() {
        int total = 0;
        for (Buku b : isi) {
            total += b.hargaAkhir();
        }
        return total;
    }

    int totalBeratKirim() {
        int totalBerat = 0;
        for (Buku b : isi) {
            if (b.jenis.equals("CETAK")) {
                totalBerat += b.getBeratGram();
            }
        }
        return totalBerat;
    }
}