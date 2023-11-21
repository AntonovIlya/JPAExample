package com.example.jpaexample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final Repository repository;

    @GetMapping("/persons/by-city")
    private String getPersonsByCity(@RequestParam String city) {
        return repository.getPersons(city);
    }

}
