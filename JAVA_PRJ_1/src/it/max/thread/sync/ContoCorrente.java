package it.max.thread.sync;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jdk.jfr.events.FileWriteEvent;

public class ContoCorrente {
	public static ContoCorrente cc;
	
	public static ContoCorrente getIstance() {
		if (cc == null) {
			return new ContoCorrente();
		}
		return cc;
		
	}
	
	public double getSlado() {
		double saldo=0;
		BufferedReader br =null;

			try {
				File fin=new File(new File(".").getCanonicalPath()+"\\resources\\db.txt");
				br=new BufferedReader(new FileReader(fin));
				String line=null;
				while((line= br.readLine())!=null){
					saldo=Double.parseDouble(line);
					break;
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
					if(br!=null)
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		return saldo;
	}
	public synchronized void prelievo(double somma) throws Exception  {
		Thread.sleep(5000);
		
		BufferedWriter bw=null;
		FileWriter fw=null;
		 
		double nuovosaldo=getSlado() -somma;

			
			
				try {
					if(nuovosaldo>0) {
						fw=new FileWriter(new File(".").getCanonicalPath()+"\\resources\\db.txt");
				
						bw=new BufferedWriter(fw);
						bw.write(nuovosaldo+"");
					}
					else {
						throw new Exception("Saldo insufficente");
					}
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(bw!=null)
					bw.close();
				if(fw!=null)
					fw.close();
			}

		
		
	}
	public  void prelievoNonSync(double somma) throws Exception {
		Thread.sleep(5000);
		
		BufferedWriter bw=null;
		FileWriter fw=null;
		 
		double nuovosaldo=getSlado() -somma;

			
			
				try {
					if(nuovosaldo>0) {
						fw=new FileWriter(new File(".").getCanonicalPath()+"\\resources\\db.txt");
				
						bw=new BufferedWriter(fw);
						bw.write(nuovosaldo+"");
					}
					else {
						throw new Exception("Saldo insufficente");
					}
			} catch (IOException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(bw!=null)
					bw.close();
				if(fw!=null)
					fw.close();
			} 
	}
}
