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

//    public GroupReadModel createGroup(LocalDateTime deadline, int projectId){
//        if(!config.isAllowMultipleCoffees() || !coffeeRepo.findAll().isEmpty())
//        throw new IllegalStateException("Only one group from project is allowed");
//        repo.findById(projectId)
//                .map(project -> {
//                    var result.setDescription(project.getName());
//                    result.setCoffees(project.getClass().stream()
//                            .map(step -> new Coffee(step.getDescription(), deadline.plusDays(step.getDaysToDeadline())
//                                    .collect(Collectors.toSet())
//                })
//
//    }

    private void setDescription(final String name) {
    }

    void createGroup(LocalDateTime now, final int projectId) {
    }
}
