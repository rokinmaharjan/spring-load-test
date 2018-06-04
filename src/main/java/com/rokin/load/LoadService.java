package com.rokin.load;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LoadService {

	@Async
	public void performDdos(String url) throws ClientProtocolException, IOException {
		CloseableHttpClient httpClient = getHttpClient();
		
		HttpGet httpGet = new HttpGet(url);
		
		for (int i = 0; i < 100000; i++) {
			CloseableHttpResponse response = httpClient.execute(httpGet);
			
				HttpEntity httpEntity = response.getEntity();
				
			    System.out.println(EntityUtils.toString(httpEntity) + " " + i);
		}
	}
	
	public CloseableHttpClient getHttpClient() {
		return HttpClients.createDefault();
	}

}
