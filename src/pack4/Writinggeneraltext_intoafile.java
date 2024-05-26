package pack4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writinggeneraltext_intoafile {

	public static void main(String[] args) throws IOException {
		
		//first we will create one file in D drive
		File f = new File("D://RakeshTest.txt");
		f.createNewFile();
		
		//for writing something in file 'f' we have to create one physical memory
		FileWriter fw = new FileWriter(f);
		
//here we have to allocate or create one buffered memory in physical memory to allocating space for write
		BufferedWriter bw = new BufferedWriter(fw);
		
	//now write some text whatever you want in buffered memory	
		bw.write("i am a lazy boy");
		bw.newLine();
		bw.write("i am not a good student");
		bw.newLine();
		bw.write("i love my lord Jagannath");
		bw.flush();
		bw.close();

	}

}
