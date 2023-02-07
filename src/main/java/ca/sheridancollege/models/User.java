package ca.sheridancollege.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class User {
    private String firstName;
    private String lastName;
    private String address;
    private boolean remember;
}
