package CoffeeExpressProgramm.user;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

interface UserRepository extends JpaRepository<User, Integer>{
    Optional <User> getAll (int id);

    Optional <UserDTO> getlAll (String name, String password);

    Page<User> findById (int id);

}
