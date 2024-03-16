import java.util.Scanner;

public class maashesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kişi Sayısını Giriniz: ");
        int kisiSayisi = scanner.nextByte();

        String ad[] = new String[kisiSayisi];
        boolean cinsiyet[] = new boolean[kisiSayisi]; 
        boolean medeniDurum[] = new boolean[kisiSayisi];
        byte yas[] = new byte[kisiSayisi];
        int maas[] = new int[kisiSayisi];

        for (int i = 0; i < kisiSayisi; i++) {

            System.out.println((i + 1) + ". Kişinin Adını Giriniz: ");
            ad[i] = scanner.next();

            System.out.println((i + 1) + ". Kişinin Cinsiyetini Giriniz (K/E): ");
            String cinsiyetStr = scanner.next();
            cinsiyet[i] = cinsiyetStr.equalsIgnoreCase("K") ? false : true; // 'K' ise false, 'E' ise true atanır.

            System.out.println((i + 1) + ". Kişinin Medeni Durumunu Giriniz (E/B): ");
            String medeniDurumStr = scanner.next();
            medeniDurum[i] = medeniDurumStr.equalsIgnoreCase("E") ? true : false; // 'E' ise true, 'B' ise false atanır.

            System.out.println((i + 1) + ". Kişinin Yaşını Giriniz: ");
            yas[i] = scanner.nextByte();

            System.out.println((i + 1) + ". Kişinin Maaşını Giriniz: ");
            maas[i] = scanner.nextInt();

        }

        for (; ; ) {

            System.out.println("1-Listeleme\n2-İsim Arama\n3-Evlilerin maaş ortalaması\n4-Erkeklerin Maaş Ortalaması\n5-En Yüksek Maaşlı Kadın\n6-En Küçük Yaş Kime Ait?\n7-Çıkış\nSeçiminizi Giriniz: ");
            byte menu = scanner.nextByte();

            switch (menu) {
                case 1:
                    // Listeleme fonksiyonu
                    for (int i = 0; i < kisiSayisi; i++) {
                        System.out.println("Adı: " + ad[i]);
                        if (cinsiyet[i]) {
                            System.out.println("Cinsiyeti: Erkek");
                        } else {
                            System.out.println("Cinsiyeti: Kadın");
                        }

                        if (medeniDurum[i]) {
                            System.out.println("Medeni Durumu: Evli");
                        } else {
                            System.out.println("Medeni Durum: Bekar");
                        }

                        System.out.println("Yaşı: " + yas[i]);
                        System.out.println("Maaşı: " + maas[i] + " TL");
                        System.out.println();
                    }
                    break;
                case 2:
                    // İsim Arama fonksiyonu
                    System.out.println("Aranacak ismi giriniz: ");
                    String arananIsim = scanner.next();
                    int bulunanIndex = -1;
                    for (int i = 0; i < kisiSayisi; i++) {
                        if (ad[i].equals(arananIsim)) {
                            bulunanIndex = i;
                            break;
                        }
                    }
                    if (bulunanIndex != -1) {
                        System.out.println("Adı: " + ad[bulunanIndex]);
                        if (cinsiyet[bulunanIndex]) {
                            System.out.println("Cinsiyeti: Erkek");
                        } else {
                            System.out.println("Cinsiyeti: Kadın");
                        }

                        if (medeniDurum[bulunanIndex]) {
                            System.out.println("Medeni Durumu: Evli");
                        } else {
                            System.out.println("Medeni Durum: Bekar");
                        }
                        System.out.println("Yaşı: " + yas[bulunanIndex]);
                        System.out.println("Maaşı: " + maas[bulunanIndex] + " TL");
                        System.out.println();
                    } else {
                        System.out.println("**" + arananIsim + "** isimli kullanıcı bulunamadı!");
                    }
                    break;
                case 3:
                    double toplamMaas = 0.0;
                    int evliKisiSayisi = 0;

                    for (int i = 0; i < kisiSayisi; i++) {
                        if (medeniDurum[i]) {
                            toplamMaas += maas[i];
                            evliKisiSayisi++;
                        }
                    }

                    if (evliKisiSayisi > 0) {
                        double ortalamaMaas = toplamMaas / evliKisiSayisi;
                        System.out.println("Evli Kişilerin Ortalama Maaşı: " + ortalamaMaas + " TL");
                    } else {
                        System.out.println("Evli Kişi Bulunamadı!");
                    }
                    break;
                case 4:
                    int erkekSayisi =0;
                    double erkekMaasi =0;
                    for (int i = 0; i < kisiSayisi; i++){
                        if (cinsiyet[i]){
                            erkekMaasi +=maas[i];
                            erkekSayisi++;
                        }
                    }
                    if (erkekSayisi>0){
                        double erkekMaasOrtalamasi = erkekMaasi / erkekSayisi;
                        System.out.println("Erkek Kişilerin Ortalama Maaşı: " + erkekMaasOrtalamasi + "TL");
                    } else {
                        System.out.println("Evli Kişi Bulunamadı!");
                    }
                    break;
                case 5:
                    int enYuksekMaasliKadinIndex = -1;
                    int enYuksekMaas = Integer.MIN_VALUE;
                    for (int i = 0; i < kisiSayisi; i++) {

                        if (!cinsiyet[i]) { // Kadın ise
                            if (maas[i] > enYuksekMaas) {
                                enYuksekMaas = maas[i];
                                enYuksekMaasliKadinIndex = i;
                            }
                        }
                        if (enYuksekMaasliKadinIndex != -1) {
                            System.out.println("En yüksek maaşlı kadın: " + ad[enYuksekMaasliKadinIndex]);
                            System.out.println("Maaşı: " + enYuksekMaas + " TL");
                        } else {
                            System.out.println("Maaş bilgisi olan kadın bulunamadı!");
                        }
                    }
                    break;
                case 6:
                    int enKucukYas = 0;
                    for (int i = 1; i < kisiSayisi; i++){
                        if (yas[i] < yas[enKucukYas]){
                            enKucukYas = i;
                            System.out.println("En küçük yaşa sahip kişi: " + ad[enKucukYas]);
                            System.out.println("Yaşı: " + yas[enKucukYas]);
                        }
                    }
                case 7:
                    System.out.println("Programdan çıkılıyor...");
                    System.exit(0);
                    break;
            }
        }
    }
}
