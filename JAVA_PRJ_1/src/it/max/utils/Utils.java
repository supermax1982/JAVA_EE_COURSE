package it.max.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {
	public final  static String getString(InputStream is) {
		
		BufferedReader br=null;
		StringBuilder sb=new StringBuilder();
		String line;
		try {
			br=new BufferedReader(new InputStreamReader(is));

			while ((line = br.readLine())!=null) {
				sb.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return sb.toString();
	}
}
