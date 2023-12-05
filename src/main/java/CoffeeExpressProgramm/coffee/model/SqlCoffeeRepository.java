package CoffeeExpressProgramm.coffee.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SqlCoffeeRepository extends CoffeeRepository, JpaRepository<Coffee, Integer> {




}
