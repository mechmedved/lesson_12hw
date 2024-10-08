import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(3,"Dania",1.7, 500);
        Coin coin2 = new Coin(6,"Albania",1.7, 500);
        Coin coin3 = new Coin(10,"Cyprus",1.7, 500);
        Coin coin4 = new Coin(7,"Belorussian",1.7, 500);



        TreeSet<Coin> coins = new TreeSet<>();

        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);


        for (Coin coin : coins) {
            System.out.println(coin.toString());
        }
    }
}