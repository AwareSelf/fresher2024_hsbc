package ioex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadWriteStringNio {
	
public static void main(String[] args) throws IOException {
		
		String string = Files.readString(Paths.get("src//ioex//readme"));
		System.out.println(string);
		
		Files.writeString(Paths.get("src//ioex//readme1"), string);
	}
	
	

}
