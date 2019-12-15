package pvt.core;

public class Director {
    BuilderCoffee builderCoffee;
    public Director(BuilderCoffee builderCoffee){
        this.builderCoffee = builderCoffee;
    }
    public void makeCoffee(){
        builderCoffee.appendChocolate();
        builderCoffee.appendEspresso();
        builderCoffee.appendFrothedMilk();
        builderCoffee.appendHotMilk();
        builderCoffee.appendHotWater();
        builderCoffee.appendSyrup();
    }
}
