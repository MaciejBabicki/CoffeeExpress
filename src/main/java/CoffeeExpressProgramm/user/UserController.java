package CoffeeExpressProgramm.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
class UserController {

    private final UserRepository repo;

    UserController(final UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/users")
    public ResponseEntity getUsers(){
        List<User> users = repo.findAll();
        return ResponseEntity.ok(users);
    }







}
