package practice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {

	public static void main(String[] args) throws IOException {
		File file=new File("Page.txt");
		FileWriter fw=new FileWriter(file);
		fw.write("I am Valusa Nikil from Warangal..... \n");
		fw.write("My age is 22 \nand completed my graduation in SR Engineering College");
		fw.close();
	}

}
