package uk.co.euanmorrison.ehealth.push;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import uk.co.kyleharrison.ehealth.service.xml.XMLFacade;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.notnoop.apns.APNS;
import com.notnoop.apns.ApnsService;

public class pusher {

	public static void main(String[] args) {

		// test out JSON object maker thing
		JSONObject myObj = testJson();
		
		//String testJson = "test notification";
		//System.out.println(testJson);
	}
	
	public static int post_iOS(JSONObject itemToBeSent) {
		ApnsService service =
			    APNS.newService()
			    .withCert("/E-Health Server/resources/APNS.pem", "apnsCertificateForEuan")
			    .withSandboxDestination()
			    .build();
		
		String payload = APNS.newPayload().alertBody("Test for Toby!").build();
		String token = "fedfbcfb....";
		service.push(token, payload);
		
		return 0;
	}
	
	public static int post_android(JSONObject itemToBeSent) {
		return 0;
	}
	
	public static void someSortOfPost() throws IOException {
		String urlParameters = "param1=a&param2=b&param3=c";
		String request = "http://example.com/index.php";
		URL url = new URL(request); 
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();           
		connection.setDoOutput(true);
		connection.setDoInput(true);
		connection.setInstanceFollowRedirects(false); 
		connection.setRequestMethod("POST"); 
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); 
		connection.setRequestProperty("charset", "utf-8");
		connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
		connection.setUseCaches (false);

		//DataOutputStream wr = new DataOutputStream(connection.getOutputStream ());
		//wr.writeBytes(urlParameters);
		//wr.flush();
		//wr.close();
		//connection.disconnect();
	}
	
	public static JSONObject testJson() {
		// from http://www.mkyong.com/java/json-simple-example-read-and-write-json/
		JSONObject obj = new JSONObject();
		obj.put("key1", "value1");
		obj.put("key2", "value2");
		//obj.put("age", new Integer(100));
	 
		JSONArray list = new JSONArray();
		list.add("msg1");
		list.add("msg2");
		list.add("msg3");
	 
		obj.put("messages", list);
		
		return obj;
		
		//System.out.print(obj);
	}

}
