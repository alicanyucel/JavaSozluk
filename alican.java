package alican;
import java.io.*;
import java.util.Scanner;
public class alican {

public static void main(String[] args) throws IOException {

	FileReader f=new FileReader("C:\\java\\sozluk.txt");
	BufferedReader in=new BufferedReader(f);
	String[] line = new String[601];
	int i=1;
	String str;
	System.out.print("Sozluk Yukleniyor ");
	 System.out.print("Sozluk Yuklendi ");
	Scanner input = new Scanner(System.in); //Kullanıcıdan string değer alabilmek için Scanner sınıfını kullandık
	 System.out.println("Lutfen Kelimeyi Buyuk Harflerle Giriniz: ");
    String mesaj = input.nextLine(); //String değer
	while((str=line[i]=in.readLine())!=null)
	{
	
    
	if (line[i].startsWith(mesaj)) {
	System.out.println("Olasi Kelimeler["+i + "]: " + line[i] + " " + i + " " +" . kez bulundu");
	i++;
	}
	}
	f.close();

	}

	}

