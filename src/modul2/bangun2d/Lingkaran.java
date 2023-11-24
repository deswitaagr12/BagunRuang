package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class Lingkaran extends LKBangun2D {
    Scanner input = new Scanner(System.in);
    double hasil;
    private double r;

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

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();
        System.out.println("Masukkan jari-jari: ");
        r = input.nextByte();
        hasil = 2 * 3.14 * r;
        System.out.println("Jari-jari : " + r);
        System.out.println("Hasil Keliling Lingkaran :" + hasil);
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        System.out.println("Masukkan jari-jari: ");
        r = input.nextByte();
        hasil = 3.14 * r * r;
        System.out.println("Jari-jari : " + r);
        System.out.println("Hasil Luas Lingkaran :" + hasil);
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