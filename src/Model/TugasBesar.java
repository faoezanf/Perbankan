package Model;

import java.util.Scanner;

public class TugasBesar {

    public static void main(String[] args) {
        int opsi2 = 100;
        int opsi = 1;
        Bank b1 = new Bank("Ruth");
        Scanner scan = new Scanner(System.in);
        while (opsi >= 1 | opsi <= 4 | opsi == 0) {
            opsi = 0;
            System.out.println(" Selamat Datang di Aplikasi Bank Ruth ");
            System.out.println(" ==================================== ");
            System.out.println();
            System.out.println(" Menu : ");
            System.out.println();
            System.out.println(" 1. Lakukan Transaksi");
            System.out.println(" 2. Data Nasabah");
            System.out.println(" 3. Data Transaksi");
            System.out.println(" 4. Tambah Nasabah");
            System.out.printf("     Masukkan opsi :  ");
            opsi = scan.nextInt();
            while (opsi <= 0 | opsi >= 5) {
                System.out.println("Opsi tidak tersedia.");
                opsi = scan.nextInt();
            }

            while (opsi == 1) {
                System.out.println("MENU TRANSAKSI");
                System.out.println("==============");
                System.out.println("1. Transfer");
                System.out.println("2. Penarikan Saldo");
                System.out.println("3. Tambah tabungan (saldo)");
                System.out.println("0. kembali ke menu sebelumnya...");
                System.out.printf("Masukkan opsi:  ");
                int opsi3 = scan.nextInt();
                while (opsi3 == 1) {
                    if (b1.jumNasabah < 2) {
                        System.out.println("Maaf, jumlah nasabah tidak cukup, atau belum ada nasabah");
                        System.out.println("0. untuk kembali ke menu awal...");
                        opsi3 = scan.nextInt();
                    } else {
                        String rek1, rek2;
                        System.out.printf(" Masukkan no. Rekening : ");
                        rek1 = scan.next();
                        if (b1.isTerdaftar(rek1)) {
                            System.out.printf(" Masukkan no. Rekening tujuan : ");
                            rek2 = scan.next();
                            if (b1.isTerdaftar(rek2)) {
                                System.out.printf(" Masukkan Jumlah Uang : ");
                                double trans = scan.nextInt();
                                while (trans < 50000 | trans > 500000) {
                                    System.out.println(" Maaf, jumlah uang kurang dari Rp.50.000,-");
                                    System.out.println(" atau lebih dari Rp. 500.000,- . Pastikan ");
                                    System.out.println(" memasukkan jumlah uang yang benar.");
                                    System.out.printf(" Masukkan jumlah uang : ");
                                    trans = scan.nextInt();
                                }
                                if (b1.getNasabah(b1.getIndexNasabah(rek1)).getSaldo() < trans) {
                                    System.out.println(" Maaf, saldo rekening pengirim tidak mencukupi");
                                } else {
                                    b1.getNasabah(b1.getIndexNasabah(rek1)).saldoNasabah = b1.getNasabah(b1.getIndexNasabah(rek1)).saldoNasabah - trans - b1.hitungSisaSaldo();
                                    b1.getNasabah(b1.getIndexNasabah(rek2)).saldoNasabah = b1.getNasabah(b1.getIndexNasabah(rek2)).saldoNasabah + trans;
                                    System.out.printf(" Masukkan tanggal transfer : ");
                                    String date;
                                    date = scan.next();

                                    String t1, t2, t3, t4;
                                    t1 = b1.getNasabah(b1.getIndexNasabah(rek1)).namaNasabah;
                                    t2 = b1.getNasabah(b1.getIndexNasabah(rek2)).namaNasabah;
                                    t3 = b1.getNasabah(b1.getIndexNasabah(rek1)).noRek;
                                    t4 = b1.getNasabah(b1.getIndexNasabah(rek2)).noRek;
                                    Transfer t = new Transfer(t1, t2, t3, t4, trans, date);
                                    b1.tambahDataTransfer(t);
                                    System.out.println(" Transfer telah berhasil...");

                                }
                            }
                        }
                        System.out.println("0. untuk kembali ke menu awal...");
                        opsi3 = 0;
                    }
                }
                while (opsi3 == 2) {
                    if (b1.jumNasabah < 1) {
                        System.out.println("Maaf, belum ada nasabah.");
                        System.out.println("0. untuk kembali ke menu awal...");
                        opsi3 = scan.nextInt();
                    } else {
                        String rek;
                        double tarik;

                        System.out.printf("Masukkan no.Rekening : ");
                        rek = scan.next();
                        if (b1.isTerdaftar(rek)) {
                            System.out.printf("Masukkan jumlah uang yang akan ditarik : ");
                            tarik = scan.nextInt();
                            if (tarik > b1.getNasabah(b1.getIndexNasabah(rek)).getSaldo()) {
                                System.out.println("Maaf, saldo tidak mencukupi.");
                            } else {
                                System.out.println("Masukkan tanggal penarikan : ");
                                String date;
                                date = scan.next();
                                b1.getNasabah(b1.getIndexNasabah(rek)).saldoNasabah = b1.getNasabah(b1.getIndexNasabah(rek)).saldoNasabah - tarik;
                                System.out.println("Penarikan berhasil...");
                                String pen1, pen2;
                                pen1 = b1.getNasabah(b1.getIndexNasabah(rek)).namaNasabah;
                                pen2 = b1.getNasabah(b1.getIndexNasabah(rek)).noRek;
                                Penarikan Pen = new Penarikan(pen1, pen2, tarik, date);
                                b1.tambahDataPengeluaran(Pen);
                            }
                        }
                        opsi3 = 0;
                    }
                }
                while (opsi3 == 3) {

                    if (b1.jumNasabah < 1) {
                        System.out.println("Maaf, belum ada nasabah.");
                        System.out.println("0. untuk kembali ke menu awal...");
                        opsi3 = scan.nextInt();
                    } else {
                        String rek;
                        double masuk;

                        System.out.printf("Masukkan no.Rekening : ");
                        rek = scan.next();
                        if (b1.isTerdaftar(rek)) {
                            String date, pem1, pem2;
                            System.out.printf("Masukkan jumlah uang yang akan ditabung : ");
                            masuk = scan.nextInt();
                            System.out.println("Masukkan tanggal pemasukan : ");
                            date = scan.next();
                            b1.getNasabah(b1.getIndexNasabah(rek)).saldoNasabah = b1.getNasabah(b1.getIndexNasabah(rek)).saldoNasabah + masuk;
                            String pen1, pen2;
                            pem1 = b1.getNasabah(b1.getIndexNasabah(rek)).namaNasabah;
                            pem2 = b1.getNasabah(b1.getIndexNasabah(rek)).noRek;
                            Pemasukan Pen = new Pemasukan(pem1, pem2, masuk, date);
                            b1.tambahDataPemasukan(Pen);
                        }
                        opsi3 = 0;
                    }
                }
                opsi = 0;

            }
            while (opsi == 2) {
                System.out.println("DATA NASABAH");
                System.out.println("============");
                System.out.println("");
                if (b1.jumNasabah == 0) {
                    System.out.println("Belum ada nasabah.");
                } else {
                    for (int i = 0; i < b1.jumNasabah; i++) {
                        System.out.println((i + 1) + ". Nama          : " + b1.getNasabah(i).getNama());
                        System.out.println("   Jenis Kelamin : " + b1.getNasabah(i).getSex());
                        System.out.println("   No. Ktp       : " + b1.getNasabah(i).getNoKtp());
                        System.out.println("   No. Hp        : " + b1.getNasabah(i).getNoHp());
                        System.out.println("   No. Rekening  : " + b1.getNasabah(i).getNoRek());
                        System.out.println("   Balance Saldo : " + b1.getNasabah(i).getSaldo());
                        System.out.println("");
                    }
                }
                System.out.println("0. kembali ke menu sebelumnya...");
                System.out.println(scan.next());
                opsi = 0;
            }
            while (opsi == 3) {
                int opsi3;
                System.out.println("DATA TRANSAKSI");
                System.out.println("===============");
                System.out.println(" 1. Data Transfer");
                System.out.println(" 2. Data Penarikan");
                System.out.println(" 3. Data Pemasukan");
                System.out.println(" 0. kembali ke menu sebelumnya...");
                System.out.printf(" Masukkan opsi : ");
                opsi3 = scan.nextInt();
                while (opsi3 < 0 | opsi3 > 3) {
                    System.out.println("Opsi tidak tersedia.");
                    System.out.printf("Masukkan opsi :");
                    opsi3 = scan.nextInt();
                }
                if (opsi3 == 1) {
                    if (b1.jumTrans < 1) {
                        System.out.println(" Maaf, belum ada record transfer tersimpan.");
                        System.out.println("0. Untuk kembali ke menu awal...");
                        opsi3 = scan.nextInt();
                    } else {
                        for (int i = 0; i < b1.jumTrans; i++) {
                            System.out.println((i + 1) + ".  No. Transaksi        : 11" + (i + 1));
                            System.out.println("   Tanggal Transfer      : " + b1.getTransfer(i).tanggalTransfer);
                            System.out.println("   Nama Nasabah Pengirim : " + b1.getTransfer(i).namaPengirim);
                            System.out.println("   Nama Nasabah Penerima : " + b1.getTransfer(i).namaPenerima);
                            System.out.println("   No. Rekening Pengirim : " + b1.getTransfer(i).noRekPengirim);
                            System.out.println("   No. Rekening Penerima : " + b1.getTransfer(i).noRekPenerima);
                            System.out.println("   Jumlah Transfer       : " + b1.getTransfer(i).jumlahTransfer);
                        }
                    }
                } else if (opsi3 == 2) {
                    if (b1.jumPenarikan < 1) {
                        System.out.println(" Maaf, belum ada record penarikan tersimpan.");
                        System.out.println("0. Untuk kembali ke menu awal...");
                        opsi3 = scan.nextInt();
                    } else {
                        for (int i = 0; i < b1.jumPenarikan; i++) {
                            System.out.println((i + 1) + ". No. Transaksi       :   21" + (i + 1));
                            System.out.println("  Tanggal Penarikan     :   " + b1.getPenarikan(i).tanggalPenarikan);
                            System.out.println("  Nama Nasabah          :   " + b1.getPenarikan(i).namaPenarikan);
                            System.out.println("  No. Rekening          :   " + b1.getPenarikan(i).noRekPenarikan);
                            System.out.println("  Jumlah Penarikan      :   " + b1.getPenarikan(i).jumlahPenarikan);
                        }
                    }
                } else if (opsi3 == 3) {
                    for (int i = 0; i < b1.jumPemasukan; i++) {
                        System.out.println((i + 1) + ". No. Transaksi       :   31" + (i + 1));
                        System.out.println("  Tanggal Pemasukan     :   " + b1.getPemasukan(i).tanggalPemasukan);
                        System.out.println("  Nama Nasabah          :   " + b1.getPemasukan(i).namaPemasukan);
                        System.out.println("  No. Rekening          :   " + b1.getPemasukan(i).noRekPemasukan);
                        System.out.println("  Jumlah Pemasukan      :   " + b1.getPemasukan(i).jumlahPemasukan);
                    }
                }
                opsi = 0;
            }
            while (opsi == 4) {
                String a, b, c, d;
                double e;
                System.out.println("MENU TAMBAH NASABAH");
                System.out.println("===================");
                System.out.printf(" Masukkan nama : ");
                a = scan.next();
                System.out.printf(" Masukkan Jenis Kelamin :");
                b = scan.next();
                System.out.printf(" Masukkan No KTP : ");
                c = scan.next();
                System.out.printf(" Masukkan No HP : ");
                d = scan.next();
                System.out.printf(" Masukkan Saldo : ");
                e = scan.nextInt();
                while (e < 100000) {
                    System.out.println("Saldo yang anda masukkan kurang, pastikan");
                    System.out.println("memasukkan saldo minimal Rp. 100.000,-");
                    System.out.printf(" Masukkan saldo kembali : ");
                    e = scan.nextInt();
                }
                Nasabah N = new Nasabah(a, b, c, d, e, c);
                b1.tambahNasabah(N);
                opsi = 0;
            }
        }

    }
}
