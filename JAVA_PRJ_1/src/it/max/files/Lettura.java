package it.max.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lettura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lettura l=new Lettura();
		l.esempioFileReader("D:\\testFile\\print-writer.txt");
	}
	public void esempioFileReader(String filepath) {
		File f =new File(filepath);
		FileReader fr=null;
		if(f.exists()) {
			try {
				fr=new FileReader(f);
				char[] testo=new char[1024];
				int size=fr.read(testo);
				
				for (int i=0; i< size;i++) {
					System.out.print(testo[i]);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
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
	public void esempioBufferedReader(String filepath) {
		File f =new File(filepath);
		BufferedReader br =null;
		if(f.exists()) {
			try {
				//lunica cosa che cambia è che la classe ha un baffer interno che salva piu caratteri alla volta 
				br=new BufferedReader(new FileReader(f));
				char[] testo=new char[1024];
				int size=br.read(testo);
				
				for (int i=0; i< size;i++) {
					System.out.print(testo[i]);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
