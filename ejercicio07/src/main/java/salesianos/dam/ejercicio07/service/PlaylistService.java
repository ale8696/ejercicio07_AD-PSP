package salesianos.dam.ejercicio07.service;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.stereotype.Service;
import salesianos.dam.ejercicio07.model.Playlist;
import salesianos.dam.ejercicio07.repository.PlaylistRepository;
import salesianos.dam.ejercicio07.service.base.BaseService;

@Service
public class PlaylistService extends BaseService<Playlist, Long, PlaylistRepository> {
}
