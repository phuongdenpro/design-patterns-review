public abstract class PizzaDecorator implements Pizza{
    // Reference to component object
    protected Pizza mPizza;

    // We initialize a Decorator with existing pizza we need decorate
    public PizzaDecorator(Pizza pizza) {
        mPizza = pizza;
    }

    public Pizza getPizza() {
        return mPizza;
    }

    public void setPizza(Pizza mPizza) {
        this.mPizza = mPizza;
    }
    public String doPizza() {
        return mPizza.doPizza();
    }
}
