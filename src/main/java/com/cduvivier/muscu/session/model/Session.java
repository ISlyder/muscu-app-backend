package com.cduvivier.muscu.session.model;

import com.cduvivier.muscu.exercise.model.Exercise;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "session")
public class Session {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private List<Exercise> exercises;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Session session = (Session) o;
		return id == session.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public String toString() {
		return "Session{" +
				"id=" + id +
				", name='" + name + '\'' +
				", exercises=" + exercises +
				'}';
	}
}
