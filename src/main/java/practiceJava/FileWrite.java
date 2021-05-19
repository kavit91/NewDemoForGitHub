package practiceJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fos=new FileOutputStream("./Files/kavit.txt");
		FileInputStream fis=new FileInputStream("./Files/kavit.txt");
		
//		String s="Hello all how are you???";
//		byte b[]=s.getBytes();
//		fos.write(b);
//		fos.close();
//		File f=new File("./Files/kavit.txt");
		Scanner scan=new Scanner(fis);
		while(scan.hasNext())
			System.out.print(scan.next()+" ");
		
		System.out.println("done");
	}
}
