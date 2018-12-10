package Model;

public class Transfer extends Transaksi implements Charge {

    public double jumlahTransfer;
    public String tanggalTransfer;
    public String namaPengirim;
    public String namaPenerima;
    public String noRekPengirim;
    public String noRekPenerima;
    public String date;

    public Transfer(String namaPengirim, String namaPenerima, String noRekPengirim, String noRekPenerima, double jumlahTransfer, String tanggalTransfer) {
        this.namaPengirim = namaPengirim;
        this.namaPenerima = namaPenerima;
        this.noRekPengirim = noRekPengirim;
        this.noRekPenerima = noRekPenerima;
        this.jumlahTransfer = jumlahTransfer;
        this.tanggalTransfer = tanggalTransfer;
    }

    public Transfer(String noRekPengirim, String noRekPenerima, double jumlahTransfer, String tanggalTransfer) {
        this.jumlahTransfer = jumlahTransfer;
        this.tanggalTransfer = tanggalTransfer;
        this.noRekPengirim = noRekPengirim;
        this.noRekPenerima = noRekPenerima;
    }

    public double getJumlahTransfer() {
        return jumlahTransfer;
    }

    public String getTanggalTransfer() {
        return tanggalTransfer;
    }

    public String getNoRekPengirim() {
        return noRekPengirim;
    }

    public String getNoRekPenerima() {
        return noRekPenerima;
    }
    
    
    
    @Override
    public double hitungSisaSaldo() {
        return -5000;
    }

}
