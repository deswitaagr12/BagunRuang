package modul2;

import java.util.Scanner;
public class Mainjava {
    public static void main(String[] args) {
        char opr = 'y';

        do{
            Scanner Input = new Scanner(System.in);
            System.out.println("=== Selamat Datang di Program Bangun Ruang Dimensi ===");
            System.out.println("===      Silakan pilih Bangun Ruang Dimensi!       ===");
            System.out.println("1. Bangun Ruang 2 D");
            System.out.println("2. Bangun Ruang 3 D");
            System.out.println("3. Exit ");
            System.out.println("Pilih Menu :");
            int pilih = Input.nextInt();

            switch (pilih){
                case 1 :
                    LKBangun2D lkBangun2D = new LKBangun2D();
                    lkBangun2D.infoBangun();
                    break;
                case 2 :
                    LKBangun3D lkBangun3D = new LKBangun3D();
                    lkBangun3D.infoBangun();
                    break;
                case 3 :
                    System.out.println("YEY SELESAI!");
                    System.exit(0);

                default:
                    System.out.println("Maaf inputan Gagal!");
                    System.out.println("Apakah Anda Ingin Mengulang y/n ?");
                    opr = Input.next().charAt(opr);
            }
        }while (opr == 'y' || opr == 'Y');

    }
    public void hitung2D(){
        char opr = 'y';
        do{
            Scanner Input = new Scanner(System.in);
            System.out.println("=== Selamat Datang di Program Bangun Ruang Dimensi ===");
            System.out.println("===     Silakan pilih Bangun Ruang 2 Dimensi !    ===");
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


                    break;
                case 2 :

                    break;
                case 3 :
                    System.out.println("YEY SELESAI!");
                    System.exit(0);

                default:
                    System.out.println("Maaf inputan Gagal!");
                    System.out.println("Apakah Anda Ingin Mengulang y/n ?");
                    opr = Input.next().charAt(opr);
            }
        }while(opr == 'y' || opr == 'Y');
    }
    public void hitung3D(){
        char opr = 'y';
        do{
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
                    break;
                case 2 :
                    break;
                case 3 :
                    System.out.println("YEY SELESAI!");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Maaf inputan Gagal!");
                    System.out.println("Apakah Anda Ingin Mengulang y/n ?");
                    opr = Input.next().charAt(opr);
            }
        }while(opr == 'y' || opr == 'Y');

    }
//    public static void main(String[] args){
//        Mainjava main =  new Mainjava();
//        main.MainMenu();
//        LKBangun2D lkBangun2D = new LKBangun2D();
//        LKBangun3D lkBangun3D = new LKBangun3D();
//        lkBangun2D.hitungLuas();
//    }
}
