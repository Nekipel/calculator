import java.math.BigInteger;
public class Example {
    public static void main(String[] args) {
        factorial(5);
    }
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            BigInteger j = BigInteger.valueOf(i);
            result = result.multiply(j);
        } return result;
    }
}
