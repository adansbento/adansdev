package com.teste.adansdev.repository;

import com.teste.adansdev.entity.Wrangle;

import java.util.List;

public class WrangleRepository {


   public List<Wrangle> findAll() {
      return LoadJson.getInstance().load(EntityEnun.WRANGLE);
   }
}