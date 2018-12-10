package Model;

public class Nasabah  {

    public String namaNasabah;
    public String sexNasabah;
    public String noKtpNasabah;
    public String noHpNasabah;
    public double saldoNasabah;
    public String noRek;

    public Nasabah(String a, String b, String c, String d, double e, String noRek) {
        namaNasabah = a;
        sexNasabah = b;
        noKtpNasabah = c;
        noHpNasabah = d;
        this.noRek = "1" + noKtpNasabah;
        saldoNasabah = e;
    }

    public double getSaldo() {
        return saldoNasabah;
    }

    public String getNoRek() {
        String s;
        s = '1' + noKtpNasabah;
        return s;
    }
    public String getNama() {
        return namaNasabah;
    }

    public String getSex() {
        return sexNasabah;
    }

    public String getNoKtp() {
        return noKtpNasabah;
    }

    public String getNoHp() {
        return noHpNasabah;
    }

   
}
