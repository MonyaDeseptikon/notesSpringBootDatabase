package ru.monya.notesSpringBootDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/notes")
public class NoteController {
    @Autowired
    private NoteService service;

    @GetMapping
    public List<Note> findAll() {
        return service.getAllNotes();
    }

    @GetMapping("/{id}")
    public Optional<Note> findById(@PathVariable Long id) {
        return Optional.ofNullable(service.getNoteById(id));
    }

    @GetMapping("/{author}")
    public List<Note> findByAuthor(@PathVariable String author) {
        return service.findByAuthor(author);
    }

    @PostMapping
    public Note save(@RequestBody Note note) {
        return service.createNote(note);
    }

    @PutMapping("/{id}")
    public Note updateNote(@PathVariable Long id, @RequestBody Note note) {

        return service.updateNote(id, note);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteNote(id);
    }

}
