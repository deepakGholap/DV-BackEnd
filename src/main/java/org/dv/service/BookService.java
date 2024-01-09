package org.dv.service;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dv.data.Book;
import org.dv.data.Data;
import org.dv.repo.BookRepository;
import org.dv.repo.DvRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookService {

  private final DvRepository dvRepository;

  private final BookRepository bookRepository;

  public List<Data> getData() {
    return dvRepository.findAll();
  }

  public List<Book> getBook() {
    return bookRepository.findAll();
  }

  public Book createBook(Book book) {
    return bookRepository.save(book);
  }

  public ResponseEntity<Book> updateBook( Book book) {
      return ResponseEntity.status(CREATED).body(bookRepository.save(book));
  }

  public String deleteBook(Long id) {
     bookRepository.deleteById(id);
     return "book deleted successfully";
  }
}
