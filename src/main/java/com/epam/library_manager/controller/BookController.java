package com.epam.library_manager.controller;

import com.epam.library_manager.model.dto.BookRequestDto;
import com.epam.library_manager.model.dto.BookResponseDto;
import com.epam.library_manager.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/book")
public class BookController {
	private final BookService bookService;

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public BookResponseDto addBook(
			@RequestBody BookRequestDto bookRequestDto
			) {
//		System.out.println();
		log.debug(bookRequestDto.toString());
		return bookService.addBook(bookRequestDto);
	}

}
