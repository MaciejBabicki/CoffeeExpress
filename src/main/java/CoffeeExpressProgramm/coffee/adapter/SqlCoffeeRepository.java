package CoffeeExpressProgramm.coffee.adapter;

import CoffeeExpressProgramm.coffee.model.Coffee;
import CoffeeExpressProgramm.coffee.model.CoffeeRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface SqlCoffeeRepository extends CoffeeRepository, JpaRepository<Coffee, Integer> {

    @Override
    @Query(nativeQuery = true, value = "select count(*) > 0 from coffees where id = 1")
    boolean existsById(@Param("id") Integer id);

    @Override
    boolean existsByDoneIsFalseAndGroup_Id(Integer groupId);

}
