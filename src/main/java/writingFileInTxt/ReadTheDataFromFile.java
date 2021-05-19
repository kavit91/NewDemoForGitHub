package writingFileInTxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTheDataFromFile  {

	public static void main(String[] args)throws Exception {
		
		File f=new File("./Files/myText.txt");
		FileReader fr=new FileReader(f);
		BufferedReader reader=new BufferedReader(fr);
		
//		System.out.println(reader.readLine());
		
		String line=null;
		while((line=reader.readLine())!=null)
		{
			System.out.println(line);
		}
		
		reader.close();
		
	}
}
