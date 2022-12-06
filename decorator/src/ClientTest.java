public class ClientTest {
    public static void main(String[] args) {
        Pizza tomato = new TomatoPizza();
        Pizza chicken = new ChickenPizza();

        System.out.println(tomato.doPizza());
        System.out.println(chicken.doPizza());

        // Use Decorator pattern to extend existing pizza dynamically

        // Add pepper to tomato-pizza
        PepperDecorator pepperDecorator = new PepperDecorator(tomato);
        System.out.println(pepperDecorator.doPizza());

        // Add cheese to tomato-pizza
        CheeseDecorator cheeseDecorator = new CheeseDecorator(tomato);
        System.out.println(cheeseDecorator.doPizza());

        // Add cheese and pepper to tomato-pizza
        // We combine functionalities together easily.
        CheeseDecorator cheeseDecorator2 = new CheeseDecorator(pepperDecorator);
        System.out.println(cheeseDecorator2.doPizza());
    }
}
