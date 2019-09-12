package it.max.thread.concorrenza;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

import it.max.utils.Utils;

public class GetSitePageExecutor implements Callable<String> {

	private String url;
	
	
	public GetSitePageExecutor(String url) {
		super();
		this.url = url;
	}


	@Override
	public String call() throws Exception {
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
