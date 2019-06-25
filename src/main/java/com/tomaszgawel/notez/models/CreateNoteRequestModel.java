package com.tomaszgawel.notez.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateNoteRequestModel {

    private String userLogin;
    private String noteTitle;
    private String noteContent;

}
