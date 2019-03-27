package com.bartend.app;

public class Robot{
  private String bartendId;
  private String username;
  public Robot(String id, String name){
    bartendId = id;
    username = name;
  }

  String getBartendId(){
    return bartendId;
  }

  String getUsername(){
    return username;
  } 

  public void print(){
    System.out.println(bartendId);
    System.out.println(username);
  }
} 
