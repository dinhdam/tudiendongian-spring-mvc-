package com.codegym.converter;

import java.util.HashMap;
import java.util.Map;

public class DictionaryConverter {
    private static Map<String,String>data;
    static {
        data= new HashMap<>();
        data.put("fish","ca");
        data.put("rice","com");
        data.put("dog","cho");
        data.put("pig","con heo");
    }

    public DictionaryConverter() {
    }

    public HashMap<String,String>findAll(){
        return (HashMap<String,String>)data;
    }
    public String getvietnamese(String english){
        if(data.containsKey(english.toLowerCase())){
            return data.get(english);
        }else{
            return "Not found";
        }

    }

}
