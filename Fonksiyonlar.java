import java.util.ArrayList;
import java.util.Scanner;

public class Fonksiyonlar {
    public static void KisiEkle(Scanner scanner, ArrayList<Kisi> kisiListe) {
        System.out.println("Tc No Giriniz: ");
        String tc =scanner.next();
        System.out.println("Ad Giriniz: ");
        String ad =scanner.next();
        System.out.println("Soyad Giriniz: ");
        String soyad =scanner.next();
        Kisi kisi = new Kisi(tc,ad,soyad);
        kisiListe.add(kisi);
        System.out.println(ad+ "Kaydı Yapıldı!");
    }

    public static void OgrenciEkle(Scanner scanner, ArrayList<Ogrenci> ogrenciListe) {
        System.out.println("Tc No Giriniz: ");
        String tc =scanner.next();
        System.out.println("Ad Giriniz: ");
        String ad =scanner.next();
        System.out.println("Soyad Giriniz: ");
        String soyad =scanner.next();
        System.out.println("Vize Notu Giriniz: ");
        int vn =scanner.nextInt();
        System.out.println("Final Notu Giriniz: ");
        int fn =scanner.nextInt();
        Ogrenci ogrenci=new Ogrenci(tc,ad,soyad,vn,fn);
        ogrenciListe.add(ogrenci);
        System.out.println(ad+"Kaydı Yapıldı!");
    }

    public static void KisiListele(ArrayList<Kisi> kisiListe) {
        if (kisiListe.isEmpty()){
            System.out.println("Kişi Listesinde Hiç Kayıt Yok.");
            return;
        }
        for (Kisi kisi: kisiListe
             ) {System.out.println(kisi);
        }
    }

    public static void OgrenciListele(ArrayList<Ogrenci> ogrenciListe) {
        if (ogrenciListe.isEmpty()){
            System.out.println("Kişi Listesinde Hiç Kayıt Yok.");
            return;
        }
        for (Ogrenci ogrenci: ogrenciListe
        ) {System.out.println(ogrenci);
        }
    }

    public static void KisiAra(Scanner scanner, ArrayList<Kisi> kisiListe) {
        if (kisiListe.isEmpty()){
            System.out.println("Kişi Listesinde Hiç Kayıt Yok.");
            return;
        }
        System.out.println("TC No Giriniz: ");
        String arananTcNo = scanner.next();
        for (Kisi kisi:kisiListe
             ) {
             if   (kisi.getTcNo().equalsIgnoreCase(arananTcNo)) {
                 kisi.Yazdir();
        }


        }
    }

    public static void OgrenciAra(Scanner scanner, ArrayList<Ogrenci> ogrenciListe) {
        if (ogrenciListe.isEmpty()){
            System.out.println("Kişi Listesinde Hiç Kayıt Yok.");
            return;
        }
        System.out.println("Ad Giriniz: ");
        String arananAd = scanner.next();
        for (Ogrenci ogrenci:ogrenciListe
        ) {
            if   (ogrenci.getAd().equalsIgnoreCase(arananAd)) {
                ogrenci.Yazdir();
            }


        }
    }

    public static void Enb(ArrayList<Ogrenci> ogrenciListe) {
        int enbVize = ogrenciListe.get(0).getVn();
        for (Ogrenci ogrenci: ogrenciListe) {
            if (ogrenci.getVn()>enbVize) enbVize=ogrenci.getVn();
        }
        for (Ogrenci ogrenci : ogrenciListe) {
            if (ogrenci.getVn()== enbVize){
                ogrenci.Yazdir();
            }
        }
    }
}
