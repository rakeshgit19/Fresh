package practise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Revision30 
{

	public static void main(String[] args) throws IOException 
	{
		
		File f = new File("C:\\Users\\RAKESH\\Desktop\\Mama.txt");
		f.createNewFile();
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		//now write file
		bw.write("i love one girl named Mama");
		bw.newLine();
		bw.write("i love her a lot than my life");
		bw.newLine();
		bw.write("i want to marry her");
		bw.newLine();
		bw.write("she is very good hearted girl");
		bw.newLine();
		bw.write("she is very good and beautiful");
		bw.newLine();
		bw.write("she is a very simple girl");
		bw.newLine();
		bw.write("she is very innocent,so i love her a lot");
		bw.newLine();
		bw.write("she has a happy and good family");
		bw.newLine();
		bw.flush();
		bw.close();

	}

}
