package hatalar;

import java.util.Scanner;

public class hata2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char karakter='A';
        int sayi[]={1,2,3,4,7};
        int a=12345;
        try {
            System.out.println("İlk elemanı: "+sayi[0]);
            System.out.println("Son elemanı: "+sayi[sayi.length-1]);
            System.out.println((a+" / " +karakter+" = "+(a/karakter)));
        } catch (IndexOutOfBoundsException e){
            System.out.println("Son elemanı: " +sayi[sayi.length-1]);
        } catch (Exception e){
            System.out.println("Hata: " +e);
        }


    }
}
