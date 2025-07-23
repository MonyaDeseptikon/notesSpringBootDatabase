package ru.monya.notesSpringBootDatabase;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note,Long> {

    List<Note> findByAuthor(String author);
}
