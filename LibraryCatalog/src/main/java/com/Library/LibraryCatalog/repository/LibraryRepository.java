package com.Library.LibraryCatalog.repository;
import com.Library.LibraryCatalog.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LibraryRepository extends JpaRepository<Library, Long>{
}
