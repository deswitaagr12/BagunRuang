package modul2;
import modul2.bangun3d.*;

import java.util.Scanner;

public class LKBangun3D extends Mainjava{
    private double Volume;

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }
    public void infoBangun(){
        char opr = 'y';
        do{
            System.out.println("\n");
            Scanner Input = new Scanner(System.in);
            System.out.println("=== Selamat Datang di Program Bangun Ruang Dimensi ===");
            System.out.println("===     Silakan pilih Bangun Ruang 2 Dimensi !     ===");
            System.out.println("1. Balok ");
            System.out.println("2. Bola ");
            System.out.println("3. Kerucut ");
            System.out.println("4. Kubus  ");
            System.out.println("5. Tabung ");

            System.out.println("Pilih Menu :");
            int pilih = Input.nextInt();

            switch (pilih){
                case 1 :
                    Balok b = new Balok();
                    b.Display();
                    break;
                case 2 :
                    Bola c = new Bola();
                    c.Display();
                    break;
                case 3 :
                    Kerucut d = new Kerucut();
                    d.Display();
                    break;
                case 4 :
                    Kubus f = new Kubus();
                    f.Display();
                    break;
                case 5 :
                    Tabung g = new Tabung();
                    g.Display();
                    break;
                case 6 :
                    System.out.println("YEY SELESAI!");
                    System.exit(0);
                default:
                    System.out.println("Maaf inputan Gagal!");
                    System.out.println("Apakah Anda Ingin Mengulang y/n ?");
                    opr = Input.next().charAt(opr);
            }
        }while(opr == 'y' || opr == 'Y');

    }
    public void hitungVolume(){


    }
}
