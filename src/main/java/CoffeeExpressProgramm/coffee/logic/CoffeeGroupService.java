package CoffeeExpressProgramm.coffee.logic;

import CoffeeExpressProgramm.CoffeeConfigurationProperties;
import CoffeeExpressProgramm.coffee.model.CoffeeGroup;
import CoffeeExpressProgramm.coffee.model.CoffeeGroupRepository;
import CoffeeExpressProgramm.coffee.model.CoffeeRepository;
import CoffeeExpressProgramm.coffee.model.projection.GroupReadModel;
import CoffeeExpressProgramm.coffee.model.projection.GroupWriteModel;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.stream.Collectors;
@RequestScope
@Service
class CoffeeGroupService {
    private CoffeeGroupRepository repo;
    public CoffeeConfigurationProperties config;

    @Override
    public boolean equals(final Object obj) {
        return super.equals(obj);
    }

    private CoffeeRepository crepo;

    CoffeeGroupService(final CoffeeGroupRepository repo, final CoffeeConfigurationProperties config, final CoffeeRepository crepo) {
        this.repo = repo;
        this.config = config;
        this.crepo = crepo;
    }
    public GroupReadModel createGroup(GroupWriteModel source){
        CoffeeGroup result = repo.save(source.toGroup());
        return new GroupReadModel(result);
    }
    public List<GroupReadModel> readAll() {
        return repo.findAll().stream()
                .map(GroupReadModel::new)
                .collect(Collectors.toList());
    }
    public void toggleGroup(int groupId) throws Throwable {
        if(crepo.existsByDoneIsFalseAndGroup_Id(groupId)){
            throw new IllegalStateException("Group has undone coffees. Do coffees first");
        }
        CoffeeGroup result = (CoffeeGroup) repo.findById(groupId)
                .orElseThrow(() -> new IllegalArgumentException("Coffee with given id not found"));
    }
}
