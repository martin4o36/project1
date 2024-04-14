package app.services;

import app.dto.AirportDto;
import app.model.Airport;
import app.mapper.AirportMapper;
import app.repository.AirportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import app.model.AirportFilter;

@AllArgsConstructor
@Service
public class Services {
    private AirportRepository airportRepository;

    public List<AirportDto> getAllAirports() {
        List<Airport> airports = airportRepository.findAll();
        return airports.stream().map(AirportMapper::mapToAirportDto).collect(Collectors.toList());
    }

    public List<?> filterAirportsWithCountryAsRoot(AirportFilter airportFilter) {

    }

    public List<?> filterAirportsWithFilter(AirportFilter airportFilter) {

    }
}
