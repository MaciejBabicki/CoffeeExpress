package CoffeeExpressProgramm.user;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
@RequiredArgsConstructor
class UserService {

    private final UserRepository repo;
    private Object User;

    public User getAll(int id){
        User user = repo.getAll(id)
                .orElseThrow(EntityNotFoundException::new);
        return user;
    }

    public UserDTO getAll(String name, String password){
        UserDTO dto = repo.getlAll(name, password)
                .orElseThrow(EntityNotFoundException::new);
        return dto;
    }

    public User findById (int id){
        List<String> names = Arrays.asList("Pierwszy", "Drugi");
        Stream<String> stream1 = names.stream();

        Stream<String>stream2 = stream1.filter(s -> s.endsWith("y"));
        stream2.forEach(n -> System.out.println(n));
        return new User();
    }
}
