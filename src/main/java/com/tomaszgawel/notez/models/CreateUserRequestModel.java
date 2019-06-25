package com.tomaszgawel.notez.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateUserRequestModel {

    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

}
