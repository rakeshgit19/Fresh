package practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Revision33 
{

	public static void main(String[] args) throws IOException 
	{
		
		File f = new File("C:\\Users\\RAKESH\\Desktop\\Mama1.txt");
		f.createNewFile();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String str = "";
		while ((str=br.readLine())!=null) 
		{
		
			System.out.println(str);
			
		}

	}

}
