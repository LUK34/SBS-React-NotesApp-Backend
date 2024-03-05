package kw.kng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kw.kng.entity.Note;
import kw.kng.repo.NotesRepository;

@Service
public class NotesServiceImpl implements NotesService
{
	@Autowired
	NotesRepository nrepo;
	
	@Override
	public List<Note> findAllNotes()
	{
		return nrepo.findAll();
		
	}

}
