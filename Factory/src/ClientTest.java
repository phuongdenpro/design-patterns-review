import java.util.Scanner;

public class ClientTest {
    public static void main(String[] args) {
        System.out.println("Enter candy: ");
        Scanner sc = new Scanner(System.in);
        String candyType = sc.nextLine();
        Candy candy = CandyFactory.getCandy(candyType);
        System.out.println(candy.getCandyName());

    }
}