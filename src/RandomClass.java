
import java.util.Arrays;
import java.util.Random;


public class RandomClass {

    static public int multiple2(int a) {
        return a * 2;
    }

    public static void losuj() {
        Random r = new Random();
        int tab[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            tab[i] = r.nextInt(10000);
        }
    }
}
