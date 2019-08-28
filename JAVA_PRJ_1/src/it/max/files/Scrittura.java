package it.max.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Scrittura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scrittura s=new Scrittura();
		s.esempioFileWriter("D:\\testFile\\provaScrittura.txt", "pippo pippo pippo");
		s.esempioBufferedWriter( "D:\\testFile\\buffered-writer.txt",  "Paolo", "Preite", "Corso", "Java", "Avanzato");
		s.esempioPrintWriter( "D:\\testFile\\print-writer.txt",  "Esempio di print writer","Paolo", "Preite", "Corso", "Java", "Avanzato");
	}
	
	public void esempioFileWriter(String filePath, String testo) {
		File f = getFile(filePath);
		
		FileWriter fw=null;
		try {
			fw = new FileWriter(f);
			fw.write(testo);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}
 //con la notazione String... indica che si tratta di un array di parametri variabile di tipo stringa
	public void esempioBufferedWriter(String filePath, String... testo) {
		File f = getFile(filePath);
		
		BufferedWriter bw=null;
		try {
			bw = new  BufferedWriter(new FileWriter(f));
			for (String string : testo) {
				bw.write(string);
				bw.newLine();
				
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	}

	
	 //con la notazione String... indica che si tratta di un array di parametri variabile di tipo stringa
		public void esempioPrintWriter(String filePath, String... testo) {
			File f = getFile(filePath);
			
			PrintWriter pw=null;
			try {
				pw = new  PrintWriter(new FileWriter(f));
				for (String string : testo) {
					//pw.write(string);
					pw.println(string);
					
				}
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
					pw.close();
				
			}
			
		
		}
	
	private File getFile(String filePath) {
		File f=new File(filePath);
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return f;
	}
}
