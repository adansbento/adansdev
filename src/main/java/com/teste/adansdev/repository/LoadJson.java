package com.teste.adansdev.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

class LoadJson{

    private static LoadJson loadJson;


    private LoadJson(){
    }

    public static LoadJson getInstance(){

        if(loadJson == null){
            loadJson = new LoadJson();
        }

        return loadJson;
    }


    public List load(EntityEnun entityEnun) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, entityEnun.getTypeClass());
            InputStream inputStream = TypeReference.class.getResourceAsStream(entityEnun.getPathFile());
            return mapper.readValue(inputStream, type);
        } catch (IOException e) {
            System.out.println("Erro LoadJsonFactory: " + e.getMessage());
        }
        return null;
    }

}