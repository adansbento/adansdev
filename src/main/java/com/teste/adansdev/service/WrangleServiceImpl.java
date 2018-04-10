package com.teste.adansdev.service;

import com.teste.adansdev.entity.Wrangle;
import com.teste.adansdev.repository.WrangleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WrangleServiceImpl implements WrangleService {

    private WrangleRepository wrangleRepository = new WrangleRepository();

    @Override
    public List<Wrangle> findAll() {
        return wrangleRepository.findAll();
    }
}