package CoffeeExpressProgramm.coffee.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


@NoArgsConstructor

@Entity
@Table(name = "coffees_groups")
 public class CoffeeGroup {

    public Arrays getCoffee;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    public boolean done;
    private String milk;

    @JoinColumn(name="project_id")
    public Project project;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "group")
    private Set<Coffee> coffees;

    CoffeeGroup(final Arrays getCoffee, final int id, final String name, final boolean done, final String milk) {
        this.getCoffee = getCoffee;
        this.id = id;
        this.name = name;
        this.done = done;
        this.milk = milk;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return done;
    }

    String getMilk() {
        return milk;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setName(final String name) {
        this.name = name;
    }

    void setDone(final boolean done) {
        this.done = done;
    }

    void setMilk(final String milk) {
        this.milk = milk;
    }

    public Arrays getCoffee() {
        return null;
    }
}
