package modul2.bangun3d;
import modul2.LKBangun3D;
import java.util.Scanner;

public class Bola extends LKBangun3D{
    Scanner input = new Scanner(System.in);
    double hasil;
    private double jari;

    public Scanner getInput() {
        return input;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public void hitungVolume() {
        super.hitungVolume();
        System.out.println("Masukan Jari-jari : ");
        jari = input.nextByte();
        hasil = 4/3  * 3.14 * jari * jari * jari;

        System.out.println("Jari-jari : " + jari);
        System.out.println("Hasil Volume Bola : " + hasil);
    }
    public void Display(){
        char opr = 'y';
        do {
            System.out.println("\n");
            System.out.println("=== Pilih Hitung Bangun Ruang ===");
            System.out.println("1. Hitung Volume ");
            System.out.println("2. Exit ");
            System.out.println("Pilih Menu : ");
            int pilih = input.nextInt();

            if (pilih == 1) {
                hitungVolume();
            } else if (pilih == 2) {
                System.exit(0);
            } else {
                System.out.println("Maaf inputan gagal ");
            }
        }while(opr == 'y' || opr == 'Y');
    }
}
