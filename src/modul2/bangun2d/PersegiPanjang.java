package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class PersegiPanjang extends LKBangun2D{
    Scanner input = new Scanner(System.in);
    double hasil;
    private double p,l;

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

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();
        System.out.println("Masukkan Panjang: ");
        p = input.nextByte();
        System.out.println("Masukkan Lebar: ");
        l = input.nextByte();
        hasil = 2 * (p+l);
        System.out.println("Panjang : " + p);
        System.out.println("Lebar : " + l);
        System.out.println("Hasil Keliling Persegi Panjang :" + hasil);
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        System.out.println("Masukkan Panjang: ");
        p = input.nextByte();
        System.out.println("Masukkan Lebar: ");
        l = input.nextByte();
        hasil = p * l;
        System.out.println("Panjang : " + p);
        System.out.println("Lebar : " + l);
        System.out.println("Hasil Luas Persegi Panjangt :" + hasil);
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