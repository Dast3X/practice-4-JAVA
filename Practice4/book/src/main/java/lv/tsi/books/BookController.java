package lv.tsi.books;

import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.Optional;


@RestController
public class BookController {
    BookRepository bookRepository;

    @Autowired
    BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @GetMapping("/getBooks")
    ResponseEntity<Iterable<Book>> findBooks(){
        return ResponseEntity.ok(bookRepository.findAll());
    }


    @GetMapping("/getBook")
    ResponseEntity<Optional<Book>> findBook(@RequestParam(value = "id") Long id){
        return ResponseEntity.ok(bookRepository.findById(id));
    }
}
