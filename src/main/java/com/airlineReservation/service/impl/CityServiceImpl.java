package com.airlineReservation.service.impl;

import com.airlineReservation.domain.City;
import com.airlineReservation.repository.CityRepo;
import com.airlineReservation.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private static final Logger log = LoggerFactory.getLogger(CityServiceImpl.class);

    @Autowired
    private CityRepo cityRepo;

    @Override
    public List<City> getAllCities() {
        log.trace("getAllCities --- method entered");

        List<City> cities = cityRepo.findAll();

        log.trace("getAllCities = cities={}", cities);

        return cities;
    }

    @Override
    public City updateCity(Long id) {
        return null;
    }

    @Override
    public City addCity(City city) {
        log.trace("addCity --- method entered");

        cityRepo.save(city);

        log.trace("added city: city={}", city);

        return city;
    }

    @Override
    public void deleteCity(Long id) {

    }
}
