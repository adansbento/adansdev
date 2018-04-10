package com.teste.adansdev.controller;


import com.teste.adansdev.entity.Match;
import com.teste.adansdev.service.MatchServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/match")
public class MatchController   {

   private final MatchServiceImpl matchesService = new MatchServiceImpl();


   @RequestMapping(value = "/all", produces ="application/json", method = RequestMethod.GET)
   public List<Match> matches() {
      return matchesService.findAll();
   }


}