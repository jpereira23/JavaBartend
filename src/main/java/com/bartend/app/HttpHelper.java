package com.bartend.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;




public class HttpHelper{
  String url = "http://138.197.205.247:8080/api/";
  public HttpHelper() throws Exception{
    String POST_PARAMS = compilePostRequest();
    System.out.println(POST_PARAMS);
    URL obj = new URL(url + "blueConnection");
    HttpURLConnection postConnection = (HttpURLConnection) obj.openConnection();
    postConnection.setRequestMethod("POST");
    postConnection.setRequestProperty("Content-Type", "application/json");
    postConnection.setDoOutput(true);
    postConnection.setConnectTimeout(12000);
    postConnection.setReadTimeout(12000);
    postConnection.connect();
    OutputStream os = postConnection.getOutputStream();
    os.write(POST_PARAMS.getBytes());
    os.flush();
    os.close();
    int responseCode = postConnection.getResponseCode();
    System.out.println(responseCode);
    if (responseCode == 400) { //success
        BufferedReader in = new BufferedReader(new InputStreamReader(
            postConnection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in .readLine()) != null) {
            response.append(inputLine);
        } in .close();
        // print result
        System.out.println(response.toString());
    } else {
        System.out.println("POST NOT WORKED");
    } 
  }


  private String compilePostRequest(){
    JSONObject obj = new JSONObject();
    obj.put("theSwitch", "on");
    obj.put("bartendId", "12345");
    return obj.toJSONString();
  }
} 
