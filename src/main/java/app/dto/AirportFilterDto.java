package app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AirportFilterDto {
    private String countryName;
    private String countryIso2Code;
    private String countryIso3Code;
    private Long cityId;
    private String cityName;
    private Long airportId;
    private String airportName;
    private String airportIataCode;
    private String airportIcaoCode;
    private Double airportLatitude;
    private Double airportLongitude;
}
