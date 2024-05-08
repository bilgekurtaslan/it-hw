package hatalar;
public class Main {
    public static void main(String[] args) {
        int a=10, b=2, c=0;
        String d="3 ";
        try {
            System.out.println(a+" / " +b+" = "+(a/b));
            System.out.println(a+" / " +c+" = "+(a/c));
            System.out.println(a+" / " +d+" = "+(a/Integer.parseInt(d)));
        } catch (ArithmeticException e) {
            c=1;
            System.out.println(a+" / " +c+" = "+(a/c));
            // System.out.println("Hata: " +e);
            // System.out.println("Hata: " +e.getMessage());
        }catch (NumberFormatException e){
            d=d.trim();
            System.out.println(a+" / " +d+" = "+(a/Integer.parseInt(d)));
        } catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Try bloğunun sonunda hata olmasa da çalışır");
        }
        System.out.println("Program bitti");

    }
}