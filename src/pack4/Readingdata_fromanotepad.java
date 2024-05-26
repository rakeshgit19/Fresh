package pack4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readingdata_fromanotepad {

	public static void main(String[] args) throws IOException { 
//here i want to read
		FileReader fr = new FileReader("D://RakeshTest.txt");
		BufferedReader br = new BufferedReader(fr);
		String i = "";
		while ((i=br.readLine())!=null) 
		{
		
			System.out.println(i);
		}
		br.close();

		
		


	}

}
