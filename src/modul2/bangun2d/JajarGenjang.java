package modul2.bangun2d;

import modul2.LKBangun2D;

import java.util.Scanner;

public class JajarGenjang extends LKBangun2D{
    Scanner input = new Scanner(System.in);
    double hasil;
    private double a,t,m;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();

        System.out.println("Masukan Alas : ");
        a = input.nextByte();
        System.out.println("Masukan Miring: ");
        m = input.nextByte();
        hasil = 2 * (a + m);
        System.out.println("Alas : " + a);
        System.out.println("Miring : " + m);
        System.out.println("Hasil Keliling Belah Ketupat : " + hasil);
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        System.out.println("Masukan Alas : ");
        a = input.nextByte();
        System.out.println("Masukan Tinggi: ");
        t = input.nextByte();
        hasil = a * t;
        System.out.println("Alas : " + a);
        System.out.println("Tinggi: " + t);
        System.out.println("Hasil Keliling Belah Ketupat : " + hasil);
    }
    public void Display(){
        System.out.println("\n");
        System.out.println("=== Pilih Hitung Bangun Ruang ===");
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
