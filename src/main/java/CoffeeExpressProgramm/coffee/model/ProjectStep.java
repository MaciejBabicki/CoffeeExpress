package CoffeeExpressProgramm.coffee.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotBlank;

@Entity
@Table(name="projects")
public class ProjectStep {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "Must not be empty")
    private String name;
    private int daysToDeadline;
    public int getId() {
        return id;
    }
    void setId(final int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    void setName(final String name) {
        this.name = name;
    }
    public int getDaysToDeadline() {
        return daysToDeadline;
    }
    void setDaysToDeadline(final int daysToDeadline) {
        this.daysToDeadline = daysToDeadline;
    }
}
