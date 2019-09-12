package it.max.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.RecursiveTask;

import it.max.utils.Utils;

public class GetSitePageForkJoin extends RecursiveTask<String> {
	private String url;
	
	
	
	
	public GetSitePageForkJoin(String url) {
		super();
		this.url = url;
	}

	



	public String getUrl() {
		return url;
	}





	public void setUrl(String url) {
		this.url = url;
	}





	@Override
	protected String compute() {
		URL siteUrl;
		try {
			siteUrl = new URL(url);
			URLConnection uc=siteUrl.openConnection();
			InputStream is=uc.getInputStream();
			return Utils.getString(is);
		}catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
