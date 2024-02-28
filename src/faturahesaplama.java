import java.util.Scanner;

public class faturahesaplama {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Kişi Sayısını Giriniz: ");
        byte ks = giris.nextByte();

        String ad[] = new String[ks];
        byte dakika[] = new byte[ks];
        byte sms[] = new byte[ks];
        byte gb[] = new byte[ks];
        byte fatura[] = new byte[ks];

        for (int i = 0; i < ks; i++) {

            System.out.println((i + 1) + ". Kişinin Adını Giriniz: ");
            ad[i] = giris.next();

            System.out.println((i + 1) + ". Kişinin Dakika Kullanımını Giriniz: ");
            dakika[i] = giris.nextByte();

            System.out.println((i + 1) + ". Kişinin SMS Kullanımını Giriniz: ");
            sms[i] = giris.nextByte();

            System.out.println((i + 1) + ". Kişinin GB Kullanımını Giriniz: ");
            gb[i] = giris.nextByte();

            fatura[i] = (byte) (dakika[i] * 0.1 + sms[i] * 0.05 + gb[i] * 15);
        }

        for (; ; ) {

            System.out.println("1-Listeleme\n2-İsim Arama\n3-En Fazla Fatura\n4-En Az Fatura\n5-En Düşük Kullanım (Dakika, SMS, GB)\n6-Çıkış\nSeçiminizi Giriniz: ");
            byte menu = giris.nextByte();

            switch (menu) {
                case 1:
                    
                    for (int i = 0; i < ks; i++) {
                        System.out.println("Adı: " + ad[i]);
                        System.out.println("Dakika Kullanımı: " + dakika[i]);
                        System.out.println("SMS Kullanımı: " + sms[i]);
                        System.out.println("GB Kullanımı: " + gb[i]);
                        System.out.println("Fatura Tutarı: " + fatura[i] + " TL");
                        System.out.println();
                    }
                    break;
                case 2:
                    
                    System.out.println("Aranacak ismi giriniz: ");
                    String arananIsim = giris.next();
                    int bulunanIndex = -1;
                    for (int i = 0; i < ks; i++) {
                        if (ad[i].equals(arananIsim)) {
                            bulunanIndex = i;
                            break;
                        }
                    }
                    if (bulunanIndex != -1) {
                        System.out.println("**" + arananIsim + "** isimli kullanıcının bilgileri:");
                        System.out.println("Dakika Kullanımı: " + dakika[bulunanIndex]);
                        System.out.println("SMS Kullanımı: " + sms[bulunanIndex]);
                        System.out.println("GB Kullanımı: " + gb[bulunanIndex]);
                        System.out.println("Fatura Tutarı: " + fatura[bulunanIndex] + " TL");
                    } else {
                        System.out.println("**" + arananIsim + "** isimli kullanıcı bulunamadı!");
                    }
                    break;
                case 3:
                    
                    int enFazlaIndex = 0;
                    for (int i = 1; i < ks; i++) {
                        if (fatura[i] > fatura[enFazlaIndex]) {
                            enFazlaIndex = i;
                        }
                    }
                    System.out.println("En fazla faturaya sahip kullanıcı: " + ad[enFazlaIndex]);
                    System.out.println("Fatura Tutarı: " + fatura[enFazlaIndex] + " TL");
                    break;
                case 4:
                    
                    int enAzIndex = 0;
                    for (int i = 1; i < ks; i++) {
                        if (fatura[i] < fatura[enAzIndex]) {
                            enAzIndex = i;
                        }
                    }
                    System.out.println("En az faturaya sahip kullanıcı: " + ad[enAzIndex]);
                    System.out.println("Fatura Tutarı: " + fatura[enAzIndex] + " TL");
                    break;
                case 5:
                   
                    int enDusukDakikaIndex = 0, enDusukSmsIndex = 0, enDusukGbIndex = 0;
                    for (int i = 1; i < ks; i++) {
                        if (dakika[i] < dakika[enDusukDakikaIndex]) {
                            enDusukDakikaIndex = i;
                        }
                        if (sms[i] < sms[enDusukSmsIndex]) {
                            enDusukSmsIndex = i;
                        }
                        if (gb[i] < gb[enDusukGbIndex]) {
                            enDusukGbIndex = i;
                        }
                    }
                    System.out.println("En az dakika kullanan: " + ad[enDusukDakikaIndex]);
                    System.out.println("En az SMS kullanan: " + ad[enDusukSmsIndex]);
                    System.out.println("En az GB kullanan: " + ad[enDusukGbIndex]);
                    break;
                case 6:
                    System.out.println("Program bitti");
                    break;
            }
        }
    }
}
