package com.airlineReservation.service.impl;

import com.airlineReservation.domain.Profile;
import com.airlineReservation.repository.ProfileRepo;
import com.airlineReservation.service.ProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    private static final Logger log = LoggerFactory.getLogger(ProfileServiceImpl.class);

    @Autowired
    private ProfileRepo profileRepo;

    @Override
    public List<Profile> getAllProfiles() {
        log.trace("getAllProfiles --- method entered");

        List<Profile> profiles = profileRepo.findAll();

        log.trace("getAllProfiles:{}", profiles);

        return profiles;
    }

    @Override
    public Profile login(Profile profile) {
        return null;
    }

    @Override
    @Transactional
    public Profile updateProfile(Profile profile) {
        log.trace("updateProfile --- method entered");

        Profile updateProfile = profileRepo.findById(profile.getId()).orElse(new Profile());
        updateProfile.setFirstName(profile.getFirstName());
        updateProfile.setLastName(profile.getLastName());
        updateProfile.setEmail(profile.getEmail());

        log.trace("updated profile:{}", updateProfile);

        return updateProfile;
    }

    @Override
    public Profile registerAProfile(Profile profile) {
        log.trace("registerAProfile --- method entered");

        profileRepo.save(profile);

        log.trace("registered profile:{}", profile);

        return profile;
    }

    @Override
    public void deleteProfile(Long id) {
        profileRepo.deleteById(id);

        log.trace("deleted profile:{}", id);
    }
}
