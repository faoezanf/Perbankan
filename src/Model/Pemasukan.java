package Model;

public class Pemasukan extends Transaksi {

    public String namaPemasukan;
    public double jumlahPemasukan;
    public String tanggalPemasukan;
    public String noRekPemasukan;

    public Pemasukan(String nama, String noRek, double jum, String date) {
        this.namaPemasukan = nama;
        this.noRekPemasukan = noRek;
        this.jumlahPemasukan = jum;
        this.tanggalPemasukan = date;
    }

    public Pemasukan(String noRek, double jum, String date) {
        this.noRekPemasukan = noRek;
        this.jumlahPemasukan = jum;
        this.tanggalPemasukan = date;
    }

    public double getJumlahPemasukan() {
        return jumlahPemasukan;
    }

    public String getTanggalPemasukan() {
        return tanggalPemasukan;
    }

    public String getNoRekPemasukan() {
        return noRekPemasukan;
    }

    
}
