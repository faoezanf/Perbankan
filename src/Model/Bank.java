package Model;

public class Bank {

    public String namaBank;
    private Nasabah[] daftarNasabah = new Nasabah[50];
    private Transfer[] daftarTransfer = new Transfer[50];
    private Penarikan[] daftarPenarikan = new Penarikan[50];
    private Pemasukan[] daftarPemasukan = new Pemasukan[50];
    int jumNasabah = 0;
    int jumTrans = 0;
    int jumPemasukan = 0;
    int jumPenarikan = 0;

    public Bank(String namaBank) {
        this.namaBank = namaBank;
    }

    public Bank() {

    }

    public void tambahNasabah(Nasabah b) {
        daftarNasabah[jumNasabah] = b;
        jumNasabah++;
    }

    public void tambahDataPemasukan(Pemasukan pem) {
        daftarPemasukan[jumPemasukan] = pem;
        jumPemasukan++;
    }

    public void tambahDataPengeluaran(Penarikan pen) {
        daftarPenarikan[jumPenarikan] = pen;
        jumPenarikan++;
    }

    public String getNamaBank() {
        return namaBank;
    }

    

    public boolean isTerdaftar(String x) {
        for (int i = 0; i < jumNasabah; i++) {
            if (x.equals(daftarNasabah[i].noRek)) {
                return true;
            }
        }
        return false;
    }

    public int getIndexNasabah(String x) {
        int idx = 0;
        for (int i = 0; i < jumNasabah; i++) {
            if (x.equals(daftarNasabah[i].noRek)) {
                idx = i + 1;
                return i;
            }
        }
        return idx;
    }

    public void tambahDataTransfer(Transfer t) {
        daftarTransfer[jumTrans] = t;
        jumTrans++;
    }

    public Nasabah getNasabah(int i) {
        return daftarNasabah[i];
    }

    public Transfer getTransfer(int i) {
        return daftarTransfer[i];
    }

    public Penarikan getPenarikan(int i) {
        return daftarPenarikan[i];
    }

    public Pemasukan getPemasukan(int i) {
        return daftarPemasukan[i];
    }

    public double hitungSisaSaldo() {
        return 5000;
    }
}
