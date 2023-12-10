package CoffeeExpressProgramm.coffee.model.projection;

import CoffeeExpressProgramm.coffee.model.CoffeeGroup;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Set;

import static java.util.Arrays.stream;

@Getter
public class GroupReadModel {
    private String description;
    /**
     * *Deadline form the laest offe in group
     */
    private LocalDateTime deadline;
    private Set<GroupCoffeeWriteModel> coffees;

    public GroupReadModel(final CoffeeGroup result){

    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setDeadline(final LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void setCoffees(final Set<GroupCoffeeWriteModel> coffees) {
        this.coffees = coffees;
    }
}
