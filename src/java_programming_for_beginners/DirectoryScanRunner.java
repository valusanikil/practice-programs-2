package java_programming_for_beginners;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirectoryScanRunner {
	public static void main(String[] args) throws IOException {
		
		Files.list(Paths.get(".")).forEach((e)->System.out.println(e));
	}
}
