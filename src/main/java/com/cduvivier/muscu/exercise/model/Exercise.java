package com.cduvivier.muscu.exercise.model;

import com.cduvivier.muscu.session.model.Session;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "exercise")
public class Exercise {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String description;
	private String image;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "session_id", referencedColumnName = "id")
	private Set<Session> sessions = new HashSet<>();

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Exercise exercise = (Exercise) o;
		return id == exercise.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "Exercise{" +
				"id=" + id +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", image='" + image + '\'' +
				", sessions=" + sessions +
				'}';
	}
}
