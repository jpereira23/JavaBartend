package com.bartend.app;



import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

public class JSONAssembler{
  private JSONObject data;

  public JSONAssembler(JSONObject aData){
    data = aData;
    try {
    getSkeleton();
    } catch(JSONException e){

    } 
  }


  private void getSkeleton() throws JSONException{
    JSONArray anArray = data.getJSONArray("message");
    anArray.getString(0);
  }
}
