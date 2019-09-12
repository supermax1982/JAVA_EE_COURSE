package it.max.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import it.max.utils.Utils;

public class GetSitePage extends Thread {
	private String url;
	private String content;
	
	
	
	public GetSitePage(String url) {

		this.url = url;
	}
	@Override
	public void run() {
		
		URL siteUrl;
		try {
			siteUrl = new URL(url);
			URLConnection uc=siteUrl.openConnection();
			InputStream is=uc.getInputStream();
			setContent(Utils.getString(is));
		}catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
