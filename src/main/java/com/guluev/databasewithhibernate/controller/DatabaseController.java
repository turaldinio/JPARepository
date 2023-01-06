package com.guluev.databasewithhibernate.controller;

import com.guluev.databasewithhibernate.model.Persons;
import com.guluev.databasewithhibernate.service.DatabaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class DatabaseController {

    private final DatabaseService databaseService;

    public DatabaseController(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    @GetMapping("/by-city")
    public List<Persons> getPersonsByCity(String city) {
        return databaseService.getPersonsByCity(city);
    }

    @GetMapping("/by-age")
    public List<Persons> getPersonsByAge(int age) {
        return databaseService.getPersonsByAge(age);
    }


}
