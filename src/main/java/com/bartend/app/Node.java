package com.bartend.app; 

public class Node{
  private Robot aRobot;
  private Drink drink;
  public Node(Drink d, Robot r){
    aRobot = r;
    drink = d;
  }


  public void print(){
    aRobot.print();
    drink.print();
  }
}
