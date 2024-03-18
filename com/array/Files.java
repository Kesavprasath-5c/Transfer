package com.array;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		File ff=new File("/usr/local/bin/iddddddd");
	try {
		if(!ff.exists())
			ff.createNewFile();
			//ff.delete();
		// Write integer value to the file
        FileWriter fileWriter = new FileWriter(ff);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        int intValue = 123; // Example integer value to write
        bufferedWriter.write(Integer.toString(intValue));
        bufferedWriter.close(); // Close the writer after writing
        
        System.out.println("Integer value successfully written to the file.");
	} 
	catch (IOException e) {
	System.out.println("specified location is not exist");
	}
		
	}

}
