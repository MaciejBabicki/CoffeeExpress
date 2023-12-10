package CoffeeExpressProgramm.coffee.adapter;

import CoffeeExpressProgramm.coffee.model.CoffeeGroup;
import CoffeeExpressProgramm.coffee.model.CoffeeGroupRepository;
import CoffeeExpressProgramm.coffee.model.Project;
import CoffeeExpressProgramm.coffee.model.ProjectRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface SQLProjectRepository extends ProjectRepository, JpaRepository<Project, Integer> {
    @Override
    @Query("from CoffeeGroup g join fetch p.steps")
    List<Project> findAll();


}
