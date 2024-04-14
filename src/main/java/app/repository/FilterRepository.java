package app.repository;

import app.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FilterRepository extends JpaRepository<Airport, Long> {

}
