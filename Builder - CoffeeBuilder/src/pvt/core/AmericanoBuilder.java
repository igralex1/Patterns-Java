package pvt.core;

public class AmericanoBuilder implements BuilderCoffee {
    private String nameOfCoffee = "Americano";
    Coffee coffee = new Coffee();

    @Override
    public void appendHotWater() {
        coffee.addIngredients("hot water");
    }

    @Override
    public void appendEspresso() {
        coffee.addIngredients("espresso");
    }

    @Override
    public void appendFrothedMilk() {

    }

    @Override
    public void appendHotMilk() {

    }

    @Override
    public void appendSyrup() {

    }

    @Override
    public void appendChocolate() {

    }

    @Override
    public Coffee getCoffee() {
        coffee.setNameOfCoffee(nameOfCoffee);
        return coffee;
    }
}
