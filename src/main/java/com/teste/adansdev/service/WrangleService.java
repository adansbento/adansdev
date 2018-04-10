package com.teste.adansdev.service;

import com.teste.adansdev.entity.Wrangle;
import com.teste.adansdev.vo.RequestTopGamer;
import com.teste.adansdev.vo.TopGamerResponse;
import com.teste.adansdev.vo.TopGunsResponse;

import java.util.List;


public interface WrangleService {

    List<Wrangle> findAll();

    List<TopGamerResponse> topGamer();

    List<TopGunsResponse> topGuns();

    void saveKill(Wrangle wrangle) throws Exception;
}
