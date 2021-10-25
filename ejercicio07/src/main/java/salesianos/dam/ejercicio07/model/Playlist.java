package salesianos.dam.ejercicio07.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class Playlist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @Lob
    private String description;

    @Builder.Default
    @OneToMany(mappedBy = "playlist")
    private List<AddedTo> addedTo = new ArrayList<>();

}
