package salesianos.dam.ejercicio07;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import salesianos.dam.ejercicio07.model.AddedTo;
import salesianos.dam.ejercicio07.model.Artist;
import salesianos.dam.ejercicio07.model.Playlist;
import salesianos.dam.ejercicio07.model.Song;
import salesianos.dam.ejercicio07.service.AddedToService;
import salesianos.dam.ejercicio07.service.ArtistService;
import salesianos.dam.ejercicio07.service.PlaylistService;
import salesianos.dam.ejercicio07.service.SongService;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainDePrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;
    private final AddedToService addedToService;

    @PostConstruct
    public void test() {

        Artist artist = Artist.builder()
                .name("The Rolling Stones")
                .build();

        artistService.save(artist);

        Song song = Song.builder()
                .title("Symphathy for the devil")
                .artist(artist)
                .album("Grandes exitos de los Rollig Stones")
                .year("1968")
                .build();

        songService.save(song);

        Playlist playlist = Playlist.builder()
                .name("mis canciones")
                .description("Pues eso, una lista de mis canciones favoritas, que hay que ecxplicarlo todo...")
                .build();

        playlistService.save(playlist);

        AddedTo addedTo = AddedTo.builder()
                .order(1)
                .datetime("25/10/2021")
                .build();

        addedTo.addToPlaylist(playlist);
        addedTo.addToSong(song);

        addedToService.save(addedTo);

    }

}
