package hatalar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class dosyayaYazma {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("dosya.txt",true);
            BufferedWriter writer=new BufferedWriter(fileWriter);
            writer.write("deneme1\n");
            writer.write("deneme2\n");
            writer.write("deneme3\n");
            writer.close();
            fileWriter.close();
        }catch (IOException e){
            System.out.println("Belirtilen Dosya Yaratılamadı");
        }
    }
}
