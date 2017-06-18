# weather-service

This application is a simple browser for NOAA GHCND data created mainly as a means to test out some technologies most importantly:
- spring integration
- spring data repositories
- spring ioc
- spring mvc

When the application is started it will fetch static data for weather stations and countries published on the NOAA FTP, normalise the data and load it into an in-memory database.

Data can be queried via a simplistic restful API.  Currently the API allows querying for stations by ID, and for a listing of stations for a given FIPS country code.

E.g. shown below

http://<host>:8080/stations?countryCode=MT
http://<host>:8080/stations/MT000016597

There is much more that can be done, the next step would be to start getting daily weather data from NOAA reported per country and/or weather station.
