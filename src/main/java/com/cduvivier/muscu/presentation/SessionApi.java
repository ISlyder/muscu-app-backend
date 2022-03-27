package com.cduvivier.muscu.presentation;

import com.cduvivier.muscu.model.Session;
import com.cduvivier.muscu.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionApi {

	private final SessionService sessionService;

	@Autowired
	public SessionApi(SessionService sessionService) {
		this.sessionService = sessionService;
	}

	@GetMapping
	public List<Session> getAll() {
		return sessionService.findAll();
	}

	@GetMapping("/{sessionId}")
	public Session getById(@PathVariable int sessionId) {
		return sessionService.getSessionById(sessionId);
	}

	@PostMapping
	public Session create(@RequestBody Session session) {
		return sessionService.create(session);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		sessionService.deleteById(id);
	}
}
