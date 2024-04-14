package app.mapper;

import app.dto.AirportDto;
import app.model.Airport;

public class AirportMapper {
    public static AirportDto mapToAirportDto(Airport airport) {
        return new AirportDto(
                airport.getId(),
                airport.getName(),
                CityMapper.mapToCityDto(airport.getCity()),
                airport.getIataCode(),
                airport.getIcaoCode(),
                airport.getLatitude(),
                airport.getLongitude()
        );
    }
}
