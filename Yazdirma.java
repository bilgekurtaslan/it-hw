package hatalar;

public class Yazdirma {
    public static void main(String[] args) {
        /*for (int i=0; i<256; i++){
            if (i%10==0) System.out.printf("%c",13);
                System.out.printf("%d : %c   | ",i, i);
            }
            */
        int b=255;
        System.out.printf("%X : \n",b);
        System.out.printf("%o : \n",b);
        System.out.printf("%x : \n",b);
        double fsayi=2342.4567891234567;
        System.out.printf("%+2.10f%n",fsayi);
        System.out.printf("%+2.2f%n",fsayi);
        }
}
