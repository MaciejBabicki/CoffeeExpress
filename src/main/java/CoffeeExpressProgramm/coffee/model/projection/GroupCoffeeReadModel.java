package CoffeeExpressProgramm.coffee.model.projection;

import CoffeeExpressProgramm.coffee.model.Coffee;

public class GroupCoffeeReadModel {
    private String name;
    private boolean done;

    GroupCoffeeReadModel(Coffee source) {
        name = source.getName();
        done = source.isDone();
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(final boolean done) {
        this.done = done;
    }
}
