package com.airlineReservation.controller;

import com.airlineReservation.converter.CityConverter;
import com.airlineReservation.domain.City;
import com.airlineReservation.dto.CitiesDto;
import com.airlineReservation.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/city")
public class CityController {

    private static final Logger log = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private CityService cityService;

    @GetMapping
    List<City> getAllCities() {
        log.trace("getAllCities");

        return cityService.getAllCities();
    }

    @PostMapping("/create")
    void addCity(@RequestBody City city) {
        log.trace("add city: city={}", city);

        cityService.addCity(city);
    }

    @DeleteMapping
    void deleteCity(@RequestParam Long id) {
        cityService.deleteCity(id);

        log.trace("deleted city:{}", id);
    }
}
