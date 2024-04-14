package app.mapper;

import app.dto.CountryDto;
import app.model.Country;

public class CountryMapper {
    public static CountryDto mapToCountryDto(Country country) {
        return new CountryDto(
                country.getName(),
                country.getIso2CountryCode(),
                country.getIso3CountryCode()
        );
    }
}
