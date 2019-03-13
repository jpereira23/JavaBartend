package com.bartend.app;

import io.socket.emitter.Emitter;
import io.socket.client.IO;
import io.socket.client.Socket;
import java.net.*;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;




public class SocketHelper
{
  Socket socket;
  SocketListener listener;
  public SocketHelper() throws URISyntaxException, IOException{
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
    socket.on("Jeffery", new Emitter.Listener() {
      @Override
      public void call(Object ... args){
	System.out.println("fuck you");
      }
    });
    socket.open();
  }

  void startStuff() throws URISyntaxException{
   
  }


} 
