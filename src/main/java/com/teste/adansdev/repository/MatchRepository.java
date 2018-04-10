package com.teste.adansdev.repository;

import com.teste.adansdev.entity.Match;

import java.util.List;

public class MatchRepository {


   public List<Match> findAll() {
      return LoadJson.getInstance().load(EntityEnun.MATCH);
   }
}