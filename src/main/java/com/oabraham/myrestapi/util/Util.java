package com.oabraham.myrestapi.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Util {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    private final ObjectMapper objMapper = new ObjectMapper();

    public String convertObjToJson(Object obj) {
        String jsonString = null;
        try {
            jsonString = objMapper.writeValueAsString(obj);
        } catch (JsonProcessingException ex) {
            logger.error("Error converting Obj to JSON string: {0}", ex);
        }
        return jsonString;
    }

    public Object convertJsonToObj(String json, Object obj){
        Object result;
        try {
            result = objMapper.readValue(json, obj.getClass());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}