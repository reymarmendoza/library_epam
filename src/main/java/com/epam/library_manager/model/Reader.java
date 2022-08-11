package com.epam.library_manager.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "reader")
public class Reader {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idreader;

	private String name;

	private String lastname;

	private String email;

	@ManyToMany(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinTable(name = "books_readers",
			joinColumns = @JoinColumn(name = "idreader", referencedColumnName = "idreader"),
			inverseJoinColumns = @JoinColumn(name = "idbook", referencedColumnName = "idbook"))
	private Set<Book> book = new HashSet<>();
}
