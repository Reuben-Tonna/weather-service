package com.noaa.ghcn.ghcnbrowser.facade;

import com.noaa.ghcn.ghcnbrowser.model.Station;
import com.noaa.ghcn.ghcnbrowser.service.CountryRepository;
import com.noaa.ghcn.ghcnbrowser.service.StationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StationController {

    private final StationRepository stationRepository;
    private final CountryRepository countryRepository;

    public StationController(StationRepository stationRepository, CountryRepository countryRepository) {
        this.stationRepository = stationRepository;
        this.countryRepository = countryRepository;
    }

    @GetMapping("/stations")
    public List<Station> stationsbyCountry(@RequestParam(value="countryCode") String countryCode) {
        return stationRepository.findByCountry(countryRepository.findOne(countryCode));
    }

    @GetMapping("/stations/{id}")
    public Station stations(@PathVariable(value="id") String id) {
        return stationRepository.findOne(id);
    }
}
