package Rapoarte2;
import java.io.*;

public class ExportFile {   //update export in .pdf,  more lines
  public void export(String data){
		try{
		File dir = new File("D:/Rapoarte"); dir.mkdir();	
		File file = new File(dir,"Rapoarte.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bf = new BufferedWriter(fw);
		bf.write(data);
		bf.newLine();
		//bf.flush();
		bf.close();
		
		
	}catch(Exception e){}
	
	}
}
