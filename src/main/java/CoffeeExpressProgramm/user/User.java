package CoffeeExpressProgramm.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "users of coffee express")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_numer")
    private static int id;

    @NotNull
    @Column(name = "unical_name")
    private String name;

    @NotNull
    @Column(name = "password")
    private String password;

    @NotNull
    private List<String> preferences;


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

    public String getPassword() {
        return password;
    }

    void setPassword(final String password) {
        this.password = password;
    }
}
