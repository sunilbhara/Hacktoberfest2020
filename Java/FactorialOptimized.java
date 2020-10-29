import java.math.BigInteger;

public class FactorialOptimized {
    private BigInteger[] factorials;

    public FactorialOptimized(int maxValue) {
        if (maxValue >= 0) {
            factorials = new BigInteger[maxValue + 1];

            factorials[0] = BigInteger.ONE;

            for (int index = 1; index < factorials.length; index++) {
                factorials[index] = BigInteger.valueOf(index).multiply(factorials[index - 1]);
            }

        } else {
            factorials = null;
        }
    }

    public static void main(String[] args) {
        int yourNumber = 50;
        FactorialOptimized optimizedFactorial = new FactorialOptimized(yourNumber);
        for (int i = 0; i <= 30; i++){
            BigInteger result = optimizedFactorial.getFactorial(i);
            System.out.printf("!%d = %d\n", i, result);
        }
    }

    public BigInteger getFactorial(int number) {
        if ((number < 0) || (number >= factorials.length))
            return null;
        return factorials[number];
    }
}