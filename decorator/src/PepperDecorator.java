public class PepperDecorator extends PizzaDecorator{
    public PepperDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String doPizza() {
        return mPizza.doPizza() + addPepper();
    }

    // This is our additional functionality
    // It add pepper to existing pizza at runtime
    private String addPepper() {
        return "+ Pepper";
    }
}
