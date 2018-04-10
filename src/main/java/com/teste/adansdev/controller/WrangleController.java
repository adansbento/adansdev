package com.teste.adansdev.controller;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.teste.adansdev.entity.Wrangle;
import com.teste.adansdev.service.WrangleService;
import com.teste.adansdev.service.WrangleServiceImpl;
import com.teste.adansdev.vo.RequestTopGamer;
import com.teste.adansdev.vo.TopGamerResponse;
import com.teste.adansdev.vo.TopGunsResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/wrangle")
public class WrangleController {

   private final WrangleService wrangleService = new WrangleServiceImpl();

   @RequestMapping(value = "/all", produces ="application/json", method = RequestMethod.GET)
   public List<Wrangle> matches() {
      return wrangleService.findAll();
   }

   @RequestMapping(value = "/topGamer", produces ="application/json", method = RequestMethod.GET)
   public List<TopGamerResponse> topGamer() {
      return wrangleService.topGamer();
   }

   @RequestMapping(value = "/topGuns", produces ="application/json", method = RequestMethod.GET)
   public List<TopGunsResponse> topGuns() {
      return wrangleService.topGuns();
   }

   @RequestMapping(value = "/saveKill", produces ="application/json", consumes = "application/json",method = RequestMethod.POST)
   @JsonDeserialize(using = LocalDateDeserializer.class)
   public String saveKill(@RequestBody Wrangle wrangle) {
      try {
         wrangleService.saveKill(wrangle);
         return "Sucesso";
      } catch (Exception e) {
         return e.getMessage();
      }
   }

}