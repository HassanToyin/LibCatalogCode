package com.Library.LibraryCatalog.controller;

import com.Library.LibraryCatalog.dto.LibraryDto;
import com.Library.LibraryCatalog.model.Library;
import com.Library.LibraryCatalog.service.LibraryService;
import com.Library.LibraryCatalog.repository.LibraryRepository;
import org.springframework.web.bind.annotation.*;


import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping(value = "/api")




public class LibraryController {

    private final LibraryService libraryService;

    public LibraryController(LibraryService libraryService){

        this.libraryService = libraryService;
    }


    @PostMapping(value = "/book/add")
    public Object createLib(@RequestBody LibraryDto libraryDto) {
        return libraryService.createBook(libraryDto);
    }

    @GetMapping("/book")
    public Object  getLib() {

        return libraryService.getLibrary();
    }
    @PutMapping("/{id}")
    public Object updateBook(@RequestBody LibraryDto libraryDto, @PathVariable Long id) {

      return libraryService.updateBook(libraryDto, id);
   }

    @DeleteMapping("/{id}")
    public Object deleteBook(@PathVariable long id) {

        return libraryService.deleteBook(id);
    }


    }
