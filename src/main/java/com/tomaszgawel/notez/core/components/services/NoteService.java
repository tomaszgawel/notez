package com.tomaszgawel.notez.core.components.services;

import com.tomaszgawel.notez.core.components.entities.NoteEntity;
import com.tomaszgawel.notez.core.components.entities.UserEntity;
import com.tomaszgawel.notez.core.components.repositories.NoteRepository;
import com.tomaszgawel.notez.core.components.repositories.UserRepository;
import com.tomaszgawel.notez.models.CreateNoteRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

@Service
public class NoteService {

    private final NoteRepository noteRepository;
    private final UserRepository userRepository;

    @Autowired
    public NoteService(NoteRepository noteRepository, UserRepository userRepository) {

        this.noteRepository = noteRepository;
        this.userRepository = userRepository;

    }

    public NoteEntity createNewNote(@RequestBody CreateNoteRequestModel createNoteRequestModel){

        NoteEntity noteEntity;
        try {
            noteEntity = new NoteEntity();
            noteEntity.setUser(userRepository.getByLogin(createNoteRequestModel.getUserLogin()));
            noteEntity.setTitle(createNoteRequestModel.getNoteTitle());
            noteEntity.setContent(createNoteRequestModel.getNoteContent());

            noteRepository.save(noteEntity);
        } catch (Exception e){
            return null;
        }
        return noteEntity;
    }

    public ArrayList<NoteEntity> getUserNotes(String login){

        UserEntity user = userRepository.getByLogin(login);
        return noteRepository.getAllByUser(user);

    }
}
