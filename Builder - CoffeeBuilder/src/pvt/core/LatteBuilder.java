package pvt.core;

public class LatteBuilder implements BuilderCoffee {
    private String nameOfCoffee = "Latte";
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
        coffee.addIngredients("syrup");
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
