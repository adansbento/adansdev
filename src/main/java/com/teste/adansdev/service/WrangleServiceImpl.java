package com.teste.adansdev.service;

import com.teste.adansdev.entity.Wrangle;
import com.teste.adansdev.repository.WrangleRepository;
import com.teste.adansdev.vo.RequestTopGamer;
import com.teste.adansdev.vo.TopGamerResponse;
import com.teste.adansdev.vo.TopGunsResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WrangleServiceImpl implements WrangleService {

    private WrangleRepository wrangleRepository = new WrangleRepository();
    private List<Wrangle> wrangles = wrangleRepository.findAll();

    @Override
    public List<Wrangle> findAll() {
        return wrangles ;
    }

    @Override
    public List<TopGamerResponse> topGamer() {
        return wrangleRepository.topGamer();
    }

    @Override
    public List<TopGunsResponse> topGuns() {
        return wrangleRepository.topGuns();
    }

    @Override
    public void saveKill(Wrangle wrangle) throws Exception {
        if(wrangle == null ){
            throw  new Exception("Fallha ao salvar kill");
        }
        wrangles.add(wrangle);
    }
}