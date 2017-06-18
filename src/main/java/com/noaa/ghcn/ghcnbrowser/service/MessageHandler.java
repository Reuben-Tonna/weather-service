package com.noaa.ghcn.ghcnbrowser.service;

public class MessageHandler {

    public void consumeCountries(Object payload) {
        System.out.println(payload);
    }

    public void consumeStations(Object payload) {
        System.out.println(payload);
    }
}
