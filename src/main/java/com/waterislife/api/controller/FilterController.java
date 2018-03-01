package com.waterislife.api.controller;

import com.waterislife.api.domain.Filter;
import com.waterislife.api.service.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/filters")
public class FilterController {

    @Autowired
    private FilterService filterService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Filter>> findAll() {
        return ResponseEntity.ok(filterService.findAll());
    }

}
