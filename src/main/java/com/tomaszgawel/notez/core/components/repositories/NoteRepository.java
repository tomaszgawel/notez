package com.tomaszgawel.notez.core.components.repositories;

import com.tomaszgawel.notez.core.components.entities.NoteEntity;
import com.tomaszgawel.notez.core.components.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface NoteRepository extends CrudRepository<NoteEntity, Integer> {
    ArrayList<NoteEntity> getAllByUser(UserEntity user);
    NoteEntity getById(Long id);
}
