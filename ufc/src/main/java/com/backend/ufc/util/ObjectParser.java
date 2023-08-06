package com.backend.ufc.util;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectParser {
    public static ObjectMapper objectMapper;
    static{
        objectMapper= new ObjectMapper();
    }
    public static<T> T JsonToJavaObject(String requestBody,Class<T> classType){
        T t=null;
        try {
          t=  objectMapper.readValue(requestBody, classType);
        }
        catch (Exception e){
//            throw new Exception("Bad Request payload");
        }
                return t;
    }
    public String JavaToJson(Object object){
        String obj="";
        try {
            obj= objectMapper.writeValueAsString(object);
        }
        catch (Exception e){

        }
        return obj;
    }
}
