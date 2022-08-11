package com.epam.library_manager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookRequestDto implements Serializable {
	private Long idbook;
	private String name;
	private String author;
	private String publication;
	private LocalDate publicationDate;
	private Integer price;
}
