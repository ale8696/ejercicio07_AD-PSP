package salesianos.dam.ejercicio07.model;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK adededToPK = new AddedToPK();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name = "song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    private String datetime;
    private int order;

    //HELPERS

    public void addSong(Song s) {
        song = s;
        s.getAddedTo().add(this);
    }

}
