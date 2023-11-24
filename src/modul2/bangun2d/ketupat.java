package modul2.bangun2d;

import modul2.LKBangun2D;

import java.util.Scanner;

public class ketupat extends LKBangun2D{
    Scanner input = new Scanner(System.in);
    double hasil;
    private double sisi,d1,d2;

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();

        System.out.println("\nMasukan sisi : ");
        sisi = input.nextByte();
        hasil = 4 * sisi;

        System.out.println("Diagonal 1 : " + sisi);
        System.out.println("Hasil Keliling Belah Ketupat : " + hasil);
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        System.out.println("Masukan d1 : ");
        d1 = input.nextByte();
        System.out.println("Masukan d2 : ");
        d2 = input.nextByte();
        hasil = 0.5 * d1 * d2;

        System.out.println("Diagonal 1 : " + d1);
        System.out.println("Diagonal 2 : " + d2);
        System.out.println("Hasil Luas Belah Ketupat : " + hasil);
    }
    public void Display(){

        System.out.println("\n=== Pilih Hitung Bangun Ruang ===");
        System.out.println("1. Hitung Keliling ");
        System.out.println("2. Hitung Luas ");
        System.out.println("3. Exit ");
        System.out.println("Pilih Menu : ");
        int pilih = input.nextInt();

        if(pilih == 1){
            hitungKeliling();
        }else if(pilih == 2){
            hitungLuas();
        }else if(pilih == 3) {
            System.exit(0);
        }else{
            System.out.println("Maaf inputan gagal ");
        }

    }
}
