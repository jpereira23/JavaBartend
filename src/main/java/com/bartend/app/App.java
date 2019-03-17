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

      GUIHelper gh = new GUIHelper();
      try{
	SocketHelper helper = new SocketHelper(gh);
      } catch(URISyntaxException e){
      }
    }
} 
