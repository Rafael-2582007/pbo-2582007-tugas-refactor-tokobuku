import java.util.ArrayList;

class Keranjang {
    private ArrayList<Buku> isi = new ArrayList<>();
    private ArrayList<BisaDikirim> dikirim = new ArrayList<>();
    private ArrayList<BisaDiunduh> diunduh = new ArrayList<>();

    void tambah(Buku buku) {
        isi.add(buku);
        buku.daftarkanKe(this);
    }

    void tambahDikirim(BisaDikirim item) {
        dikirim.add(item);
    }

    void tambahDiunduh(BisaDiunduh item) {
        diunduh.add(item);
    }

    ArrayList<Buku> getIsi() {
        return isi;
    }

    ArrayList<BisaDiunduh> getDiunduh() {
        return diunduh;
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
        for (BisaDikirim d : dikirim) {
            totalBerat += d.getBeratGram();
        }
        return totalBerat;
    }
}