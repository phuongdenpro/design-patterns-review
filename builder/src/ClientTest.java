public class ClientTest {
    public static void main(String[] args) {
        House house = new HouseBuilder()
                .buildWalls(4)
                .buildDoors(5)
                .withColor("red")
                .buildPool(true)
                .buildRoof(true)
                .build();
        System.out.println(house);
    }
}
