package com.airlineReservation.service;

import com.airlineReservation.domain.City;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CityService {
    List<City> getAllCities();

    City updateCity(Long id);

    City addCity(City city);

    void deleteCity(Long id);
}
