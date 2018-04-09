package com.teste.adansdev.service;

import com.teste.adansdev.entity.Match;
import com.teste.adansdev.repository.LoadJson;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchesServiceImpl implements MatchesService{

    private LoadJson loadJson = new LoadJson();


    @Override
    public List<Match> findAll() {
        return loadJson.loadMatchesJson();
    }
}