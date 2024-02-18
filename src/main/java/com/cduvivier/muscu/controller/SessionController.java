package com.cduvivier.muscu.controller;

import com.cduvivier.muscu.dto.SessionDto;
import com.cduvivier.muscu.model.Session;
import com.cduvivier.muscu.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {

	private final SessionService sessionService;

	@Autowired
	public SessionController(SessionService sessionService) {
		this.sessionService = sessionService;
	}

	@GetMapping
	public List<SessionDto> getAll() {
		return sessionService.findAll();
	}

	@GetMapping("/{sessionId}")
	public SessionDto getById(@PathVariable int sessionId) {
		return sessionService.getSessionById(sessionId);
	}

	@PostMapping
	public SessionDto create(@RequestBody Session session) {
		return sessionService.create(session);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		sessionService.deleteById(id);
	}
}
