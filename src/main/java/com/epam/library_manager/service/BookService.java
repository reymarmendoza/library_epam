package com.epam.library_manager.service;

import com.epam.library_manager.model.dto.BookRequestDto;
import com.epam.library_manager.model.dto.BookResponseDto;

public interface BookService {
	public BookResponseDto addBook(BookRequestDto bookRequestDto);
}
