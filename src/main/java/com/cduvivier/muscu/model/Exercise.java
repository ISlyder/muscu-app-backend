package com.cduvivier.muscu.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "exercises")
@EqualsAndHashCode(of = "id")
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
