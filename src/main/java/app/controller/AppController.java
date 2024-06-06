package app.controller;

import app.dto.AirportDto;
import app.model.AirportFilter;
import app.services.Services;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v0/airports")
public class AppController {
    private Services services;

    @GetMapping
    public ResponseEntity<List<AirportDto>> getAllAirports() {
        List<AirportDto> airportDtos = services.getAllAirports();
        return ResponseEntity.ok(airportDtos);
    }

    @PostMapping("/filter")
    public ResponseEntity<List<Object>> filterAirports(@RequestBody boolean countryAsRoot, @RequestBody AirportFilter airportFilter) {
        List<Object> result;
        if(countryAsRoot) {
            result = services.filterAirportsWithCountryAsRoot(airportFilter);
        } else {
            result = services.filterAirportsWithFilter(airportFilter);
        }

        return ResponseEntity.ok(result);
    }
}
