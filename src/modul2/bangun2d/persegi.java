package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class persegi extends LKBangun2D{
    Scanner input = new Scanner(System.in);
    double hasil;
    private double sisi;

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

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();
        System.out.println("Masukkan sisi: ");
        sisi = input.nextByte();
        hasil = 4 * sisi;
        System.out.println("Sisi : " + sisi);
        System.out.println("Hasil Keliling Persegi :" + hasil);
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        System.out.println("Masukkan sisi: ");
        sisi = input.nextByte();
        hasil = sisi * sisi;
        System.out.println("Sisi : " + sisi);
        System.out.println("Hasil Luas Persegi :" + hasil);
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