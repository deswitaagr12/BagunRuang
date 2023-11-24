package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;
public class Kubus extends LKBangun3D{
    Scanner input = new Scanner(System.in);
    double hasil;
    private double rusuk;

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

    public double getRusuk() {
        return rusuk;
    }

    public void setRusuk(double rusuk) {
        this.rusuk = rusuk;
    }

    @Override
    public void hitungVolume() {
        super.hitungVolume();
        System.out.println("Masukan Rusuk : ");
        rusuk = input.nextByte();
        hasil = rusuk * rusuk * rusuk;
        System.out.println("Rusuk: " + rusuk);
        System.out.println("Hasil Volume Kubus: " + hasil);
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
