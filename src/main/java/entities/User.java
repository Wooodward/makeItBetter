package entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class User {
    @Getter
    @Id private String id;

    @Getter @Setter
    private String firstName;
    @Getter @Setter
    private String lastName;
    @Getter @Setter
    private String userName;
}
