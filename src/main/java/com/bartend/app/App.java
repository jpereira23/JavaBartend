package com.bartend.app;

import java.net.MalformedURLException;
import java.io.IOException;
import java.net.*;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException
    {
      /*
      ArduinoHelper helper = new ArduinoHelper();
      helper.initialize();
      Thread t = new Thread(){
	public void run(){
	  try {Thread.sleep(1000000);} catch (InterruptedException ie){
	  }
	}

      };
      t.start();
      */
      GUIHelper gh = new GUIHelper();
      try{
	SocketHelper nhelper = new SocketHelper(gh);
      } catch(URISyntaxException e){
      }
    }
} 
