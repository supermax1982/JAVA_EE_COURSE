package it.max.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class CreaProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreaProperties c=new CreaProperties();
		c.caricaProperties();
	}
	private void caricaProperties() {
		Properties p = new Properties();
		InputStream is= CreaProperties.class.getClassLoader().getResourceAsStream("config.properties");
		try {
			p.load(is);
			System.out.println(p.get("db-name"));
			System.out.println(p.get("db-address"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
