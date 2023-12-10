package CoffeeExpressProgramm.coffee.adapter;

import CoffeeExpressProgramm.coffee.model.CoffeeGroup;
import CoffeeExpressProgramm.coffee.model.CoffeeGroupRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SQLCoffeeGroupRepository extends CoffeeGroupRepository, JpaRepository<CoffeeGroup, Integer> {
    @Override
    @Query("from CoffeeGroup g join fetch g.tasks")
    List<CoffeeGroup> findAll();


    boolean existsByDoneIsFalseAndProject_Id (Integer projectID);
}
