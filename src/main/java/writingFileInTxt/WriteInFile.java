package writingFileInTxt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteInFile {
	
	public static void main(String[] args) throws Exception{
		
		File f=new File("./Files/mytest.html");
		FileWriter fw=new FileWriter(f,false );
		BufferedWriter writer=new BufferedWriter(fw);
		
//		writer.write("This is first line");
//		writer.newLine();
//		writer.write("Hi, this is kavit");
		
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				int num=(int)(Math.random()*100);
//				writer.write(num+"\t");
//			}
//			writer.newLine();
//		}
//		
		//csv file
		
//		for(int i=0;i<4;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				int num=(int)(Math.random()*100);
//				writer.write(num+",");
//			}
//			writer.newLine();
//		}
		
		writer.write("<html> <body> <title> Way2Automation </title> <h1> learing java from way2Automation.com </h1> </body> </html>");
		writer.close();
		
		System.out.println("File is created");
	}

}
