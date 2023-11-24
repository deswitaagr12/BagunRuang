package modul2;

import modul2.bangun2d.*;

import java.util.Scanner;


public class LKBangun2D extends Mainjava{
    private double Luas;

    public double getLuas() {
        return Luas;
    }

    public void setLuas(double luas) {
        Luas = luas;
    }
    private  double Keliling;

    public double getKeliling() {
        return Keliling;
    }

    public void setKeliling(double keliling) {
        Keliling = keliling;
    }

    public void infoBangun(){
        char opr = 'y';
        do{
            Scanner Input = new Scanner(System.in);
            System.out.println("\n=== Selamat Datang di Program Bangun Ruang Dimensi ===");
            System.out.println("===     Silakan pilih Bangun Ruang 2 Dimensi !       1===");
            System.out.println("1. Belah Ketupat");
            System.out.println("2. JajarGenjang ");
            System.out.println("3. Lingkaran ");
            System.out.println("4. PersegiPanjang ");
            System.out.println("5. Persegi ");
            System.out.println("6. Segitiga ");

            System.out.println("Pilih Menu :");
            int pilih = Input.nextInt();

            switch (pilih){
                case 1 :
                    ketupat b = new ketupat();
                    b.Display();
                    break;
                case 2 :
                    JajarGenjang a = new JajarGenjang();
                    a.Display();
                    break;
                case 3:
                    Lingkaran c = new Lingkaran();
                    c.Display();
                    break;
                case 4:
                    persegi d = new persegi();
                    d.Display();
                    break;
                case 5:
                    PersegiPanjang e = new PersegiPanjang();
                    e.Display();
                    break;
                case 6:
                    Segitiga f = new Segitiga();
                    f.Display();
                    break;
                default:
                    System.out.println("Maaf inputan Gagal!");
                    System.out.println("Apakah Anda Ingin Mengulang y/n ?");
                    opr = Input.next().charAt(opr);

            }while(pilih <= 0 || pilih > 7 );



        }while(opr == 'y' || opr == 'Y');


    }
    public void hitungKeliling(){
    }
    public void hitungLuas(){

    }

}