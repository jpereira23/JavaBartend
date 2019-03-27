package com.bartend.app;


public class Drink{
  private String drinkName;
  private MixerAlcohol[] mixerAlcohols;
  private boolean selectedForDeleting;
  public Drink(String drink, MixerAlcohol[] mixers, boolean selected){
    drinkName = drink;
    mixerAlcohols = mixers; 
    selectedForDeleting = selected;
  }


  public void print(){
    System.out.println(drinkName);
    for(int i = 0; i < mixerAlcohols.length; i++){
	mixerAlcohols[i].print();
    }
  }

}
