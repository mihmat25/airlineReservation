package com.airlineReservation.converter;

import com.airlineReservation.domain.City;
import com.airlineReservation.dto.CityCreateDto;
import com.airlineReservation.dto.CityDto;
import org.springframework.stereotype.Component;

@Component
public class CityConverter {
    public static City cityToEntity(CityCreateDto cityCreateDto) {
        City city = new City();
        city.setName(cityCreateDto.getName());

        return city;
    }

    public static CityDto cityToFullDto(City city) {
        CityDto cityDto = new CityDto();
        cityDto.setId(city.getId());
        cityDto.setName(city.getName());

        return cityDto;
    }
}
