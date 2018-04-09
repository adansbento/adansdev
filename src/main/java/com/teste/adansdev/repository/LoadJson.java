package com.teste.adansdev.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teste.adansdev.entity.Match;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class LoadJson {

    public List<Match> loadMatchesJson(){

        List<Match> matches = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Match>> typeReference = new TypeReference<List<Match>>(){};
        InputStream inputStream = TypeReference.class.getResourceAsStream("/json/matches.json");

        try {
            matches = mapper.readValue(inputStream,typeReference);
        } catch (IOException e){
            System.out.println("Unable to save matches: " + e.getMessage());
        }

        return matches;
    }


}
