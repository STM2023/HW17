package com.goit.HW17.service;

import com.goit.HW17.data.Note;
import com.goit.HW17.data.NoteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@RequiredArgsConstructor
@Service
public class NoteService {
    // private List<Note> notes=new ArrayList<>();
    private final NoteRepository noteRepository;

    public List<Note> findAll(){
        //        log.info("---listAll");
        return noteRepository.findAll();
    }

    public void deleteById(long id)   {

        Note entity= noteRepository.getById(id);
        noteRepository.delete(entity);

    }
    public Note save( Note note) {

        return noteRepository.save(note);
    }
    public    Note getById(long id) throws Exception {

        return noteRepository.getById(id);
    }


}

