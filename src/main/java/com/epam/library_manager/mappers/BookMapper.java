package com.epam.library_manager.mappers;

import com.epam.library_manager.model.Book;
import com.epam.library_manager.model.dto.BookRequestDto;
import com.epam.library_manager.model.dto.BookResponseDto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
//@Mapper
public interface BookMapper {
//	BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

//	@Mapping(source = "idbook", target = "idbook")
//	@Mapping(source = "name", target = "name")
//	@Mapping(source = "author", target = "author")
//	@Mapping(source = "publication", target = "publication")
//	@Mapping(source = "publicationDate", target = "publicationDate")
//	@Mapping(source = "price", target = "price")
	Book requestDtoToBook(BookRequestDto requestDto);

//	@Mapping(source = "idbook", target = "idbook")
//	@InheritInverseConfiguration(name = "requestDtoToBook")
	BookResponseDto bookToResponseDto(Book book);
}
