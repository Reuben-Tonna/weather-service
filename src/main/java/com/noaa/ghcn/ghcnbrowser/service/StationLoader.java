package com.noaa.ghcn.ghcnbrowser.service;

import com.noaa.ghcn.ghcnbrowser.model.Country;
import com.noaa.ghcn.ghcnbrowser.model.Station;
import org.springframework.stereotype.Service;

@Service
public class StationLoader {

    private final StationRepository stationRepository;
    private final CountryRepository countryRepository;

    public StationLoader(
            StationRepository stationRepository,
            CountryRepository countryRepository) {

        this.stationRepository = stationRepository;
        this.countryRepository = countryRepository;
    }

    public void load(Station station) {

        String countryCode = station.getId().substring(0, 2);

        Country country = countryRepository.findOne(countryCode);
        station.setCountry(country);

        stationRepository.save(station);
    }
}
