package salesianos.dam.ejercicio07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianos.dam.ejercicio07.model.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
