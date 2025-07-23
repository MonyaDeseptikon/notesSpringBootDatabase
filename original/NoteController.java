package ru.monya.notesSpringBootDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
    private final NoteService service;
    @Autowired
    public NoteController(NoteService service) {
        this.service = service;
    }
    @GetMapping
    public List<Note> getAllNotes() {
        return service.getAllNotes();
    }
    @GetMapping("/{id}")
    public Note getNoteById(@PathVariable Long id) {
        return service.getNoteById(id);
    }
    @GetMapping("/{author}")
    public Note findByAuthor(@PathVariable String author) {
        return service.findByAuthor(author);
    }
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return service.createNote(note);
    }
    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {
        return service.updateNote(id, note);
    }
    @DeleteMapping("/{id}")
    public void deleteNote(@PathVariable Long id) {
        service.deleteNote(id);
    }

}
