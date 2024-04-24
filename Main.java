import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Kisi> kisiListe= new ArrayList<Kisi>();
        ArrayList<Ogrenci> ogrenciListe= new ArrayList<Ogrenci>();
        byte menu;
        while (true){
            System.out.println("0-Çıkış/1-Kişi Ekle/2-Öğrenci Ekle/3-Kişi Listele/");
            System.out.println("4-Öğrenci Listele/5-Kişi Ara/6-En Büyük Vize");
            menu=scanner.nextByte();
            switch (menu){
                case 0:System.out.println("Program bitti"); System.exit(0);
                    break;
                case 1:Fonksiyonlar.KisiEkle(scanner,kisiListe);
                    break;
                case 2:Fonksiyonlar.OgrenciEkle(scanner,ogrenciListe);
                    break;
                case 3:Fonksiyonlar.KisiListele(kisiListe);
                    break;
                case 4:Fonksiyonlar.OgrenciListele(ogrenciListe);
                    break;
                case 5:Fonksiyonlar.KisiAra(scanner,kisiListe);
                    break;
                case 6:Fonksiyonlar.OgrenciAra(scanner,ogrenciListe);
                    break;
                case 7:Fonksiyonlar.Enb(ogrenciListe);
                    break;
                default:System.out.println("Yanlış Menü Değeri Girildi");
                    break;
            }
        }
    }
}
