package com.teste.adansdev.controller;


import com.teste.adansdev.entity.Wrangle;
import com.teste.adansdev.service.WrangleService;
import com.teste.adansdev.service.WrangleServiceImpl;
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
}