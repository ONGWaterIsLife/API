package com.waterislife.api.service;

import com.waterislife.api.domain.Filter;
import com.waterislife.api.repository.FilterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilterService {

    @Autowired
    private FilterRepository filterRepository;

    public List<Filter> findAll() {
        return filterRepository.findAll();
    }
}
