package CoffeeExpressProgramm.coffee.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


@RestController
public class CoffeeController {
    public static final Logger logger = LoggerFactory.getLogger(CoffeeController.class);

    private final CoffeeRepository repository;

    CoffeeController(final CoffeeRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/coffees")
    ResponseEntity<Coffee>createCoffee(@RequestBody @Valid Coffee toCreate){
        Coffee readyCoffee = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/" + readyCoffee.getId())).body(readyCoffee);
    }



    @GetMapping(value = "/coffees", params = {"!sort", "!page", "!size"})
    ResponseEntity<List<Coffee>>readAllCoffees(){
        logger.warn("Exposing all coffees");
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/coffees")
    ResponseEntity<List<Coffee>>readAllCoffes(Pageable page){
        logger.info("Custom coffee");
        return ResponseEntity.ok(repository.findAll(page).getContent());
    }

    @GetMapping("/coffees/{id}")
    ResponseEntity<Coffee>readCoffee(@PathVariable int id){
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PutMapping("/coffees/{id}")
        ResponseEntity<?> updateCoffee(@PathVariable int id, @RequestBody Coffee toUpdate){
        if(!repository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        toUpdate.setId(id);
         repository.save(toUpdate);
         return ResponseEntity.noContent().build();
    }

}





