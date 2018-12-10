package Model;

public class Penarikan extends Transaksi {

    public String namaPenarikan;
    public double jumlahPenarikan;
    public String tanggalPenarikan;
    public String noRekPenarikan;

    public Penarikan(String nama, String noRek, double jum, String date) {
        this.namaPenarikan = nama;
        this.noRekPenarikan = noRek;
        this.jumlahPenarikan = jum;
        this.tanggalPenarikan = date;
    }

    public Penarikan(String noRekPenarikan, double jumlahPenarikan, String tanggalPenarikan) {
        this.jumlahPenarikan = jumlahPenarikan;
        this.tanggalPenarikan = tanggalPenarikan;
        this.noRekPenarikan = noRekPenarikan;
    }

    public double getJumlahPenarikan() {
        return jumlahPenarikan;
    }

    public String getTanggalPenarikan() {
        return tanggalPenarikan;
    }

    public String getNoRekPenarikan() {
        return noRekPenarikan;
    }
    
    
}
