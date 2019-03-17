package com.bartend.app;

import io.socket.emitter.Emitter;
import io.socket.client.IO;
import io.socket.client.Socket;
import java.net.*;
import java.lang.Object;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;




public class SocketHelper
{
  Socket socket;
  GUIHelper aGUI;
  public SocketHelper(GUIHelper gh) throws URISyntaxException, IOException{
    aGUI = gh;
    try{
      socket = IO.socket("http://138.197.205.247:4000");  
    } catch (URISyntaxException e) {
      System.out.println("SocketHelper");
    }
    socket.on(Socket.EVENT_CONNECT, new Emitter.Listener() {
      @Override 
      public void call(Object ... args){  
	System.out.println("Connecting");	
	try {
	  HttpHelper aHelper = new HttpHelper();
	} catch(Exception e){
	  System.out.println("Something is wrong");
	}
      }
    });

    socket.on(Socket.EVENT_DISCONNECT, new Emitter.Listener(){
      @Override 
      public void call(Object ...args){
	System.out.println("Disconnecting");
      }
    });
    socket.on("Jeffery", new Emitter.Listener() {
      @Override
      public void call(Object ... args){
	System.out.println("fuck you");
      }
    });
    socket.on("12345", new Emitter.Listener() {
      @Override
      public void call(Object ... args){  
	JSONObject data = (JSONObject) args[0];	
	try{
	  JSONArray anArray = data.getJSONArray("message");
	  JSONObject anObject = anArray.optJSONObject(0);
	  JSONObject object2 = anObject.getJSONObject("aRobot");
	  JSONObject object1 = anObject.getJSONObject("theDrink");
	  String drinkName = object1.getString("drinkName");
	  String username = object2.getString("username");
	  aGUI.addRowToLobby(drinkName, username);
	  
	} catch (JSONException e){
	  System.out.println("Didnt work");
	}
      }
    });
    socket.open();
  }

  void startStuff() throws URISyntaxException{
   
  }


} 
