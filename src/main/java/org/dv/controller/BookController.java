package org.dv.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dv.data.Book;
import org.dv.service.BookService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
    value = "/",
    produces = {MediaType.APPLICATION_JSON_VALUE})
@RequiredArgsConstructor
@Slf4j
public class BookController {

  private final BookService bookService;

  @GetMapping("book")
  public List<Book> getBooks(){
    return bookService.getBook();
  }

  @PostMapping("book")
  public Book createBook(@RequestBody Book book){
    return bookService.createBook(book);
  }

  @PutMapping("book")
  public ResponseEntity<Book> updateBook(@RequestBody Book book){
    return bookService.updateBook(book);
  }

  @DeleteMapping("book")
  public String deleteBook(@RequestParam Long id){
    return bookService.deleteBook(id);
  }
}
