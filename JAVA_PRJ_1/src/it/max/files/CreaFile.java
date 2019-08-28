package it.max.files;

import java.io.File;
import java.io.IOException;

public class CreaFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreaFile cf=new CreaFile();
		String dir="D:\\testFile";
		cf.creaDirectory(dir);
		
		cf.creaFile(dir+"\\filediProva.txt");
		
		File d = new File(dir);
		System.out.println("èm una directory: "+d.isDirectory()); 
		
		File f = new File(dir);
		System.out.println("è un file: "+f.isFile());
		
		File[] listaFile=d.listFiles();
		System.out.println("INIZIO LISTA FILE");
		for (File file : listaFile) {
			System.out.println(file.getName()); 
			
			file.delete();
		}
		System.out.println("FINE LISTA FILE");
		
				
	}
	public void creaFile(String filePath) {
		File f=new File(filePath);
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void creaDirectory(String filePath) {
		File d=new File(filePath);
		
		if (!d.exists()) {
		
				d.mkdir();
			
		}
		
	}
	

}
