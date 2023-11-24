package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;
public class Tabung extends LKBangun3D{
    Scanner input = new Scanner(System.in);
    double hasil;
    private double r,t;

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

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    @Override
    public void hitungVolume() {
        super.hitungVolume();
        System.out.println("Masukan Jari-jari : ");
        r = input.nextByte();
        System.out.println("Masukan Tinggi : ");
        t = input.nextByte();
        hasil = 3.14 * r * r * t;
        System.out.println("Jari-jari: " + r);
        System.out.println("Tinggi : " + t);
        System.out.println("Hasil Volume Tabung : " + hasil);
    }
    public void Display(){
        System.out.println("\n");
        System.out.println("=== Pilih Hitung Bangun Ruang ===");
        System.out.println("1. Hitung Volume ");
        System.out.println("2. Exit ");
        System.out.println("Pilih Menu : ");
        int pilih = input.nextInt();

        if(pilih == 1){
            hitungVolume();
        }else if(pilih == 2) {
            System.exit(0);
        }else{
            System.out.println("Maaf inputan gagal ");
        }

    }
}
