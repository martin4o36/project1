package app.mapper;

import app.dto.CityDto;
import app.model.City;

public class CityMapper {
    public static CityDto mapToCityDto(City city) {
        return new CityDto(
                city.getId(),
                city.getName(),
                CountryMapper.mapToCountryDto(city.getCountry()),
                city.getTimezone()
        );
    }
}
