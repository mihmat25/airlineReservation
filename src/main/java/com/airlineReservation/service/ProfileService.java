package com.airlineReservation.service;

import com.airlineReservation.domain.City;
import com.airlineReservation.domain.Profile;

import java.util.List;

public interface ProfileService {
    List<Profile> getAllProfiles();

    Profile login(Profile profile);

    Profile updateProfile(Profile profile);

    Profile registerAProfile(Profile profile);

    void deleteProfile(Long id);
}
