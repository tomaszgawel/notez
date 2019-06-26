package com.tomaszgawel.notez.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SigninRequestModel {

    private String login;
    private String password;

}
