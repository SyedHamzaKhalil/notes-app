package MVC.Controllers;

import MVC.Model.Note;
import MVC.Service.NoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

import static MVC.URL.*;

@Slf4j
@RestController
@RequestMapping(value = BASE)
public class NoteController {

    @Autowired
    private NoteService noteService;


    @PostMapping(value =  CREATE_NOTE)
    public Note createNote(@RequestBody Note note, @RequestParam(defaultValue = "false") boolean edit) {        String noteTrimmed = note.getContent().trim();

        if (note.getId() != null) {
            Note lastNote = noteService.getNote(note.getId());
            if (edit) {
                lastNote.setContent(lastNote.getContent() + "\n EDITED: " + noteTrimmed);
                lastNote.setUpdated(LocalDateTime.now());
            } else {
                lastNote.setContent(noteTrimmed);
            }
            log.info("Note edited sucessfully!");
            return noteService.saveNote(lastNote);
        } else {
            note.setContent(noteTrimmed);
            note.setCreated(LocalDateTime.now());
            log.info("Note saved succesfully!");
            return noteService.saveNote(note);
        }
    }

    @GetMapping(value = GET_ALL_NOTES)
    public List<Note> getNotes() {
        return noteService.getAllNotes();
    }

    @DeleteMapping(DELETE_NOTE)
    public void deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
    }
}
