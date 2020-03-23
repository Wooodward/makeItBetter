package model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "places")
public class Place {

    public Place() {
    }

    public Place(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Getter
    @Id private String id;

    @Getter @Setter
    private String name;

    @Getter @Setter
    private String description;
}
