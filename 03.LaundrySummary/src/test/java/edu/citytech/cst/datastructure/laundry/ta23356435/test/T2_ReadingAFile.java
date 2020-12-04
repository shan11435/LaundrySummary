package edu.citytech.cst.datastructure.laundry.ta23356435.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import org.junit.jupiter.api.Test;

public class T2_ReadingAFile {

	@Test
	public void whenReadSmallFileJava7_thenCorrect()
	  throws IOException {
	    String expected_value = "Hello, world!";
	    Path path = Paths.get("/Users/tahsinahmed/Desktop/CST3650/Assignment#6/public/washing-machine.csv");
	    List<String> read = Files.readAllLines(path);
	    for (String row : read) {
			System.out.println(row);
		}
	    assertEquals(expected_value, read);
	    
	    
  }
	
}