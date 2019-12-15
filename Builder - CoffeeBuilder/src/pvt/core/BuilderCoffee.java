package pvt.core;

public abstract interface BuilderCoffee {
    public abstract void appendHotWater();

    public abstract void appendEspresso();

    public abstract void appendFrothedMilk();

    public abstract void appendHotMilk();

    public abstract void appendSyrup();

    public abstract void appendChocolate();

    public abstract Coffee getCoffee();
}
