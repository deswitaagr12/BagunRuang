package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;

public class Segitiga extends LKBangun2D{
    Scanner input = new Scanner(System.in);
    double hasil;
    private double a,b,c,t;

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

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();
        System.out.println("Masukkan sisi1: ");
        a = input.nextByte();
        System.out.println("Masukkan sisi2: ");
        b = input.nextByte();
        System.out.println("Masukkan sisi3: ");
        c = input.nextByte();
        hasil = a + b + c;
        System.out.println("Sisi1: " + a);
        System.out.println("Sisi2 : " + b);
        System.out.println("Sisi3 : " + c);
        System.out.println("Hasil Keliling Segitiga Siku-siku :" + hasil);
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        System.out.println("Masukkan Alas: ");
        a = input.nextByte();
        System.out.println("Masukkan Tinggi: ");
        t = input.nextByte();
        hasil = 0.5 * a * t;
        System.out.println("Alas : " + a);
        System.out.println("Tinggi : " + t);
        System.out.println("Hasil Luas Segitiga :" + hasil);
    }
    public void Display(){
        System.out.println("==== Pilih Hitung Bangun Ruang ====");
        System.out.println("1. Hitung Keliling");
        System.out.println("2. Hitung Luas");
        System.out.println("3. Exit");
        System.out.println("Pilih Menu :");
        int pilih = input.nextInt();

        if(pilih == 1){
            hitungKeliling();
        }else if (pilih == 2){
            hitungLuas();
        }else if (pilih == 3){
            System.exit(0);
        }else{
            System.out.println("Maaf! Inputan salah");
        }

    }
}