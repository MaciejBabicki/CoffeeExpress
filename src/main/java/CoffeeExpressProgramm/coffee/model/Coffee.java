package CoffeeExpressProgramm.coffee.model;

import CoffeeExpressProgramm.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;


@NoArgsConstructor

@Entity
@Table(name = "coffees")
 public class Coffee{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    public boolean done;
    private String milk;
    private String sirup;
    @Embedded
    private User user = new User();
    @Getter
    @ManyToOne
    @JoinColumn(name = "coffee_group_id")
    private CoffeeGroup group;
    public Coffee(String name, String milk){

        this.name = name;
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

    public String getMilk() {
        return milk;
    }

    String getSirup() {
        return sirup;
    }

    public void setId(final int id) {
        this.id = id;
    }

    void setName(final String name) {
        this.name = name;
    }

    void setDone(final boolean done) {
        this.done = done;
    }

    void setMilk(final String milk) {
        this.milk = milk;
    }

    void setSirup(final String sirup) {
        this.sirup = sirup;
    }

    void setGroup(final CoffeeGroup group) {
        this.group = group;
    }
}
