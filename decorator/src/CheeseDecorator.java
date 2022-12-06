public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String doPizza() {
        return mPizza.doPizza() + addCheese();
    }

    // This is additional functionality
    // It adds cheese to an existing pizza
    private String addCheese() {
        return "+ Cheese";
    }
}
