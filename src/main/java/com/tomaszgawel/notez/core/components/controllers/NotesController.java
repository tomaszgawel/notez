package com.tomaszgawel.notez.core.components.controllers;

import com.tomaszgawel.notez.core.components.entities.NoteEntity;
import com.tomaszgawel.notez.core.components.services.NoteService;
import com.tomaszgawel.notez.models.CodeResponse;
import com.tomaszgawel.notez.models.CreateNoteRequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("notes")
public class NotesController {

    private NoteService noteService;

    @Autowired
    public NotesController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping("addnote")
    public ResponseEntity addNewNote(@RequestBody CreateNoteRequestModel createNoteRequestModel){
        NoteEntity noteEntity = noteService.createNewNote(createNoteRequestModel);
        if (noteEntity != null)
            return new ResponseEntity<>(new CodeResponse("CREATED"), HttpStatus.ACCEPTED);
        return new ResponseEntity<>(new CodeResponse("REJECT"), HttpStatus.FORBIDDEN);
    }

    @GetMapping("getnotes/{login}")
    public ResponseEntity<ArrayList<NoteEntity>> getNotes(@PathVariable String login){
        return new ResponseEntity<>(noteService.getUserNotes(login), HttpStatus.OK);
    }

}
