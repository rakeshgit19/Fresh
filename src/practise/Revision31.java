package practise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Revision31 
{

	public static void main(String[] args) throws IOException 
	{
		
		FileReader fr = new FileReader("D:\\RakeshTest.txt");
		BufferedReader br = new BufferedReader(fr);
		String text = "";
		while ((text = br.readLine())!= null) 
		{
		
			System.out.println(text);
		}
		br.close();

	}

}
