package salesianos.dam.ejercicio07.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Playlist {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @Lob
    private String description;

    @OneToMany
    private List<AddedTo> addedTo;

}
