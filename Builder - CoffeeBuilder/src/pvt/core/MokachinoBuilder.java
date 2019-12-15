package pvt.core;

public class MokachinoBuilder implements BuilderCoffee {
    private String nameOfCoffee = "Mokachino";
    Coffee coffee = new Coffee();
    @Override
    public void appendHotWater() {

    }

    @Override
    public void appendEspresso() {
        coffee.addIngredients("espresso");
    }

    @Override
    public void appendFrothedMilk() {
        coffee.addIngredients("frothed milk");
    }

    @Override
    public void appendHotMilk() {
        coffee.addIngredients("hot milk");
    }

    @Override
    public void appendSyrup() {

    }

    @Override
    public void appendChocolate() {
        coffee.addIngredients("chocolate");
    }

    @Override
    public Coffee getCoffee() {
        coffee.setNameOfCoffee(nameOfCoffee);
        return coffee;
    }
}
