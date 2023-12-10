package CoffeeExpressProgramm.coffee.model;

import java.util.List;
import java.util.Optional;

public interface CoffeeGroupRepository {
    List<CoffeeGroup> findAll();
    Optional findById(Integer id);
    CoffeeGroup save(CoffeeGroup entity);

    boolean isTrue (boolean ono);

    public boolean isAllowMultibleCoffees();
}
