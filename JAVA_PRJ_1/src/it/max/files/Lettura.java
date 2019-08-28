package it.max.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lettura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public void esempioFileReader(String filepath) {
		File f =new File(filepath);
		FileReader fr=null;
		if(!f.exists()) {
			try {
				fr=new FileReader(f);
				char[] testo=new char[1024];
				int size=fr.read(testo);
				
				for (char c : testo) {
					System.out.println(c);
				}
			} catch (FileNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
