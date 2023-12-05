package CoffeeExpressProgramm.coffee.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Setter;


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
}
