package CoffeeExpressProgramm.coffee.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface CoffeeRepository {
    List<Coffee> findAll();
    Page<Coffee> findAll(Pageable page);
    Optional<Coffee> findById(Integer id);
    boolean existsById(Integer id);
    Coffee save(Coffee entity);

    List<Coffee>findByDone(boolean done);



}
