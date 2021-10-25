package salesianos.dam.ejercicio07.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import salesianos.dam.ejercicio07.model.Playlist;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
