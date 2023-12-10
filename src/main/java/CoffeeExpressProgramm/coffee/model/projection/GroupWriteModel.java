package CoffeeExpressProgramm.coffee.model.projection;

import CoffeeExpressProgramm.coffee.model.CoffeeGroup;
import lombok.Getter;

import java.util.Set;

@Getter
public class GroupWriteModel {
    private String description;
    private Set<GroupCoffeeReadModel> coffees;

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setCoffees(final Set<GroupCoffeeReadModel> coffees) {
        this.coffees = coffees;
    }

    public CoffeeGroup toGroup(){
        var result = new CoffeeGroup();
    result.setName(description);
    result.getCoffee.toString();
    return result;
    }
}
