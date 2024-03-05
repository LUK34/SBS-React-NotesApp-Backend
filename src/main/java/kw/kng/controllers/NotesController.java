package kw.kng.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kw.kng.entity.Note;
import kw.kng.service.NotesService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class NotesController 
{
	@Autowired
	NotesService ns;
	
	@GetMapping("/notes")
	public ResponseEntity<List<Note>> readNotes()
	{
		return new ResponseEntity<List<Note>>(ns.findAllNotes(), HttpStatus.OK);
	}

}
