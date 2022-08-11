package com.epam.library_manager.service.impl;

import com.epam.library_manager.mappers.BookMapper;
import com.epam.library_manager.model.Book;
import com.epam.library_manager.model.dto.BookRequestDto;
import com.epam.library_manager.model.dto.BookResponseDto;
import com.epam.library_manager.repository.BookRepository;
import com.epam.library_manager.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;
	private final BookMapper bookMapper;

	@Override
	public BookResponseDto addBook(BookRequestDto requestDto) {
		Book book = bookRepository.save(
				bookMapper.requestDtoToBook(requestDto)
		);

		return bookMapper.bookToResponseDto(book);
	}
}
