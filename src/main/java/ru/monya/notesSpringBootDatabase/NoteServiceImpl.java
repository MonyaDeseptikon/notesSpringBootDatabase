package ru.monya.notesSpringBootDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class NoteServiceImpl implements NoteService{

    @Autowired
    private NoteRepository repository;

//Капец, я затупил,- методы ничего не возвращают, а понять не могу почему из базы данные не считываются
    @Override
    public List<Note> getAllNotes() {
        return repository.findAll();
    }

    @Override
    public Note getNoteById(Long id) {
        return repository.findById(id).orElseThrow(()->new RuntimeException("Not found"));
    }

    @Override
    public Note createNote(Note note) {
        return repository.save(note);
    }

    @Override
    public Note updateNote(Long id, Note note) {
        Note temp = getNoteById(id);
        temp.setAuthor(note.getAuthor());
        temp.setTitle(note.getTitle());
        temp.setContent(note.getContent());
        return repository.save(temp);
    }

    @Override
    public void deleteNote(Long id) {
repository.deleteById(id);
    }

    @Override
    public List<Note> findByAuthor(String author) {
        return repository.findByAuthor(author);
    }


}
