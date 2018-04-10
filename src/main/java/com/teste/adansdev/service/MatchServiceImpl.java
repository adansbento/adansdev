package com.teste.adansdev.service;

import com.teste.adansdev.entity.Match;
import com.teste.adansdev.repository.MatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchServiceImpl implements MatchService {

    private MatchRepository matchesRepository = new MatchRepository();

    @Override
    public List<Match> findAll() {
        return matchesRepository.findAll();
    }
}