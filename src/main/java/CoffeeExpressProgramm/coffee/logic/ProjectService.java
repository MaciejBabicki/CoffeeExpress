package CoffeeExpressProgramm.coffee.logic;

import CoffeeExpressProgramm.CoffeeConfigurationProperties;
import CoffeeExpressProgramm.coffee.model.*;
import CoffeeExpressProgramm.coffee.model.projection.GroupReadModel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

class ProjectService {
    private ProjectRepository repo;
    private CoffeeGroupRepository coffeeRepo;
    private CoffeeConfigurationProperties config;

    ProjectService(final ProjectRepository repo, final CoffeeGroupRepository coffeeRepo, final CoffeeConfigurationProperties config) {
        this.repo = repo;
        this.coffeeRepo = coffeeRepo;
        this.config = config;
    }

    List<Project> readAllprojects(){
        return repo.findAll();
    }
    public Project save(final Project toSave){
        return repo.save(toSave);
    }


    private void setDescription(final String name) {
    }

    void createGroup(LocalDateTime now, final int projectId) {
    }
}
