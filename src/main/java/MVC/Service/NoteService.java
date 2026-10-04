package MVC.Service;

import MVC.Model.Note;
import MVC.Repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public Note getNote(Long id) { return noteRepository.getById(Long.valueOf(id)); }

    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
    }
}
