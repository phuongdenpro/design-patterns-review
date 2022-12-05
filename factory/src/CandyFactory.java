public class CandyFactory {
    public static Candy getCandy(String candyType){
        switch (candyType){
            case "Minty":
                return new MintyCandy();
            case "Hard":
                return  new HardCandy();
            default:
                throw  new IllegalArgumentException("This candy type is unsupported");
        }
    }
}
