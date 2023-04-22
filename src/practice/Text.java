package practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) throws FileNotFoundException {
		String details="C:\\Users\\Valusa Nikil\\OneDrive\\Desktop\\Nikil\\Docs\\Details.txt";
		FileReader fileName=new FileReader(details);
		Scanner sc=new Scanner(fileName);
		
		while(sc.hasNext()) {
			String line=sc.nextLine();
			System.out.println(line);
		}
		sc.close();
		
	}

}
