package kw.kng.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kw.kng.entity.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long> {

}
