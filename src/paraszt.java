import java.sql.SQLOutput;
import java.util.Scanner;

public class paraszt {
    int sugar;
    int magassag;
    double pi = 3.14159;
    public void task01(){
        System.out.print("Adj meg egy felszínt: ");
        Scanner beker = new Scanner(System.in);
        int sugar = beker.nextInt();
        System.out.print("Adj meg egy magasságot: ");
        int magassag = beker.nextInt();
        System.out.println("A henger felszíne: " + 2 * sugar * magassag + ".");
    }
}
