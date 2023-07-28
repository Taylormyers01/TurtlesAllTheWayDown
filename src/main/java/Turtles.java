//package PACKAGE_NAME;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public static int factorial(int n){
        if(n == 1)
            return 1;
        return n * factorial(n-1);
    }
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

        public static void main(String[] args) {
        Instant start = Instant.now();
        gcd(100000023, 1098);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();

        Instant start2 = Instant.now();
        gcd2(100000023, 1098);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2, finish2).toMillis();

        System.out.println("First gcd: " + timeElapsed + " Second gcd: " + timeElapsed2);
    }
}
