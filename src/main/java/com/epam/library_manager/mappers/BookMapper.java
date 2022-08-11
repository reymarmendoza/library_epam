package com.epam.library_manager.mappers;

import com.epam.library_manager.model.Book;
import com.epam.library_manager.model.dto.BookRequestDto;
import com.epam.library_manager.model.dto.BookResponseDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
	Book requestDtoToBook(BookRequestDto requestDto);

	BookResponseDto bookToResponseDto(Book book);
}
