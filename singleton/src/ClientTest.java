public class ClientTest {
    public static void main(String[] args) {
        EagerInitialization eagerInitialization = EagerInitialization.getInstance();
        eagerInitialization.setName("John");
        System.out.println(eagerInitialization.getName());
        EagerInitialization eagerInitialization2 = EagerInitialization.getInstance();
        System.out.println(eagerInitialization2.getName());
    }
}
