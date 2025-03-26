package backend.proj.spring_6_webapp.repositories;

import backend.proj.spring_6_webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
