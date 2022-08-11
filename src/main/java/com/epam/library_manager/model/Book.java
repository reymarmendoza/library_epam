package com.epam.library_manager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idbook;

	private String name;

	private String author;

	private String publication;

	@Column(name = "publication_date")
	private LocalDate publicationDate;

	private Integer price;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "books_readers",
			joinColumns = @JoinColumn(name = "idbook", referencedColumnName = "idbook"),
			inverseJoinColumns = @JoinColumn(name = "idreader", referencedColumnName = "idreader"))
	private Set<Reader> reader = new HashSet<>();

	public Book(Long idbook, String name, String author, String publication, LocalDate publicationDate, Integer price) {
		this.idbook = idbook;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.publicationDate = publicationDate;
		this.price = price;
	}
}
