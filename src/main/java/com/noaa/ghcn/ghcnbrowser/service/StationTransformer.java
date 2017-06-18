package com.noaa.ghcn.ghcnbrowser.service;

import com.noaa.ghcn.ghcnbrowser.model.Station;
import org.springframework.stereotype.Component;

@Component
public class StationTransformer {

    /*
        GHCN flat file structure documented
        ftp://ftp.ncdc.noaa.gov/pub/data/ghcn/daily/readme.txt
        defines column ranges.
    */

    public Station transform(String line) {

        Station station = new Station();
        station.setId(line.substring(0, 11).trim());
        station.setLatitude(Float.parseFloat(line.substring(12, 20)));
        station.setLongitude(Float.parseFloat(line.substring(21, 30)));
        station.setElevation(Float.parseFloat(line.substring(31, 37)));
        station.setState(line.substring(38, 40).trim());
        station.setName(line.substring(41, 71).trim());

        return station;
    }

}
