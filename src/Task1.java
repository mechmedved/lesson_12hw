import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10,"Russia",1.7, 250);
        Coin coin2 = new Coin(5,"Belorussian",1.5, 500);


        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);

        System.out.println(coin1.equals(coin2));
    }
}