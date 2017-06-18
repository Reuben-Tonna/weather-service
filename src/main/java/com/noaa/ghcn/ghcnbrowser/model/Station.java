package com.noaa.ghcn.ghcnbrowser.model;

import javax.persistence.*;

@Entity
@Table(name = "STATION")
public class Station {

    @Id
    @Column(length = 11, nullable = false)
    private String id;

    @ManyToOne(optional = false)
    private Country country;

    @Column
    private float latitude;

    @Column
    private float longitude;

    @Column
    private float elevation;

    @Column
    private String state;

    @Column
    private String name;

    public String getId() {
        return id;
    }

    public Country getCountryCode() {
        return country;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getElevation() {
        return elevation;
    }

    public String getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setElevation(float elevation) {
        this.elevation = elevation;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Station{" +
                "id='" + id + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", elevation=" + elevation +
                ", state='" + state + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
