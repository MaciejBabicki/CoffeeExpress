package CoffeeExpressProgramm.coffee.model.projection;

import CoffeeExpressProgramm.coffee.model.Coffee;

public class GroupCoffeeWriteModel {
    private String name;
    private String milk;

   public String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }

    public String getMilk() {
        return milk;
    }

    void setMilk(final String milk) {
        this.milk = milk;
    }
    public Coffee toCoffee(){
       return new Coffee(name, milk);

    }
}
