public class Ogrenci  extends Kisi{
    private int vn;
    private int fn;
    public Ogrenci(String tcNo, String ad, String soyad, int vn, int fn){
        super(tcNo,ad,soyad);
        this.vn= vn;
        this.fn=fn;
    }

    public int getVn() {
        return vn;
    }

    public void setVn(int vn) {
        this.vn = vn;
    }

    public int getFn() {
        return fn;
    }

    public void setFn(int fn) {
        this.fn = fn;
    }
    public String toString(){
        return super.toString()+" Ogrenci [vn=" + vn + ", fn=" +fn + "]";
    }
    public  int BasariNotHesap(){
        return (int) (this.vn*.4+this.fn*.6);
    }
    public  void Yazdir(){
        super.Yazdir();
        System.out.println("Vize Notu: " + this.vn);
        System.out.println("Final Notu: " + this.fn);
        System.out.println("Başarı Notu: " + BasariNotHesap());
    }
}
