package com.bartend.app;


public class Beverage{
  private String drinkName;
  private boolean alcohol;
  private boolean mixer;

  public Beverage(String drink, boolean alc, boolean mix){
    drinkName = drink; 
    alcohol = alc;
    mixer = mix;
  }

  public String getDrink(){
    return drinkName;
  }

  public boolean getAlcohol(){
    return alcohol;
  }

  public boolean getMixer(){
    return mixer;
  }

  public void print(){
    System.out.println(drinkName);
  }
}
