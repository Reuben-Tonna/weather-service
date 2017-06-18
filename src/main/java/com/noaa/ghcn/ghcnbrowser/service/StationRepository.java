package com.noaa.ghcn.ghcnbrowser.service;

import com.noaa.ghcn.ghcnbrowser.model.Country;
import com.noaa.ghcn.ghcnbrowser.model.Station;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StationRepository extends CrudRepository<Station, String> {
    List<Station> findByCountry(Country country);
}
