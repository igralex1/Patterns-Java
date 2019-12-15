package pvt.core;

public class Main {
    public static void main(String[] args) {
        BuilderCoffee builderAmericano = new AmericanoBuilder();
        Director director = new Director(builderAmericano);
        director.makeCoffee();
        Coffee coffee = builderAmericano.getCoffee();
        coffee.showOrder();

        BuilderCoffee builderLatte = new LatteBuilder();
        Director director1 = new Director(builderLatte);
        director1.makeCoffee();
        Coffee latte = builderLatte.getCoffee();
        latte.showOrder();

        BuilderCoffee builderMokachino = new MokachinoBuilder();
        Director director2 = new Director(builderMokachino);
        director2.makeCoffee();
        Coffee mokachino = builderMokachino.getCoffee();
        mokachino.showOrder();
    }
}
