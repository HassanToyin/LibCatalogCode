package com.Library.LibraryCatalog.service;
import com.Library.LibraryCatalog.dto.LibraryDto;
import com.Library.LibraryCatalog.model.Library;
import com.Library.LibraryCatalog.repository.LibraryRepository;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
    private final LibraryRepository libraryRepository;
    public LibraryService (LibraryRepository libraryRepository){
        this.libraryRepository = libraryRepository;
    }
    public Object createBook(LibraryDto libraryDto){
        Library library = new Library();
        library.setTitle(libraryDto.getTitle());
        library.setAuthor(libraryDto.getAuthor());

        return libraryRepository.save(library);
    }

    public Object getLibrary() {
        return libraryRepository.findAll();
    }
    public Object updateBook(LibraryDto libraryDto, long id) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        library.setTitle(libraryDto.getTitle());
        library.setAuthor(libraryDto.getAuthor());
        library.setIsbn(libraryDto.getIsbn());

        return libraryRepository.save(library);

    }

    public Object deleteBook(Long id) {
        Library library = libraryRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Deleted"));
        libraryRepository.delete(library);

        return "Book Deleted";
    }

    public Object getLib() {

        return libraryRepository.findAll();
    }

}

