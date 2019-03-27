package com.bartend.app;


public class MixerAlcohol{
  private Beverage beverage;
  private int scale;
  private int max;
  public MixerAlcohol(Beverage bev, int s, int m){
    beverage = bev;
    scale = s;
    max = m;
  }
  

  public void print(){
    beverage.print();
    System.out.println(scale);
    System.out.println(max);
  }
}
