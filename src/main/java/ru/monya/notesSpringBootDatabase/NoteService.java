package ru.monya.notesSpringBootDatabase;

import java.util.List;

public interface NoteService {
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note createNote(Note note);
    Note updateNote(Long id, Note note);
    void deleteNote(Long id);
    List<Note> findByAuthor(String author);
}
