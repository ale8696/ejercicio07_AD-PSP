package salesianos.dam.ejercicio07.service;

import org.springframework.stereotype.Service;
import salesianos.dam.ejercicio07.model.Song;
import salesianos.dam.ejercicio07.repository.SongRepository;
import salesianos.dam.ejercicio07.service.base.BaseService;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}
