package com.tomaszgawel.notez.core.components.entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "notes")
@Data
@NoArgsConstructor
public class NoteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "modification_date")
    private Date modificationDate;

    @ManyToOne
    UserEntity user;

}
