package com.noaa.ghcn.ghcnbrowser.service;

import com.noaa.ghcn.ghcnbrowser.model.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryTransformer {

    /*
        GHCN flat file structure documented
        ftp://ftp.ncdc.noaa.gov/pub/data/ghcn/daily/readme.txt
        defines column ranges.
    */
    public Country transform(String line) {

        Country country = new Country();
        country.setCode(line.substring(0, 2).trim());
        country.setName(line.substring(3, line.length()).trim());

        return country;
    }
}
