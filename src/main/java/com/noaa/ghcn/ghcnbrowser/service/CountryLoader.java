package com.noaa.ghcn.ghcnbrowser.service;

import com.noaa.ghcn.ghcnbrowser.model.Country;
import org.springframework.stereotype.Service;

@Service
public class CountryLoader {

    private final CountryRepository repository;

    public CountryLoader(CountryRepository repository) {
        this.repository = repository;
    }

    public void load(Country country) {
        repository.save(country);
    }
}
