package dosyalama;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyadanOkuma {

	public static void main(String[] args) {
		try {
			FileReader fileReader=new FileReader("dosya1.txt");
			BufferedReader reader=new BufferedReader(fileReader);
			int okunan;
			String satir;
			//System.out.println(reader.skip(30));
			while(true) {
				 //okunan=reader.read(); if(okunan<0) break; System.out.printf("%c",okunan);
				 
				satir=reader.readLine();
				if(satir==null) break;
				System.out.println(satir);
			}
			
			System.out.println("-----------------------");
			reader.close();
			fileReader.close();
			FileReader fileReader1=new FileReader("dosya1.txt");
			BufferedReader bufferedReader=new BufferedReader(fileReader1);
			while((satir=bufferedReader.readLine())!=null) {
				System.out.println(satir);
			}
			//System.out.printf("%c",reader.read());
		} catch (FileNotFoundException e) {
			System.out.println("Okunacak dosya mevcut değil");
		} catch (IOException e) {
			System.out.println("Dosya okunamadı");
		}

	}

}
