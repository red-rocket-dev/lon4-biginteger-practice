package pl.sda;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        long l = 10;
        BigInteger bigInteger = new BigInteger("100");
        BigInteger sumOfBigIntegers = bigInteger.add(BigInteger.valueOf(5));
        BigInteger multiplyResult = sumOfBigIntegers.multiply(BigInteger.TEN);
        BigDecimal divide = BigDecimal.valueOf(20).divide(BigDecimal.valueOf(3), 10, RoundingMode.UP);
        System.out.println("Dzielenie "+divide);

        System.out.println(bigInteger);
        System.out.println(sumOfBigIntegers);
        System.out.println(multiplyResult);
        System.out.println(multiplyResult.max(BigInteger.TEN));

        if(multiplyResult.compareTo(BigInteger.TEN) == 0) {
            System.out.println("Są równe");
        }

        if(multiplyResult.compareTo(BigInteger.TEN) > 0) {
            System.out.println("Jest wieksze");
        }

        if(multiplyResult.compareTo(BigInteger.TEN) < 0) {
            System.out.println("Jest mniejsze");
        }


        Long maxLongNumber = Long.MAX_VALUE;
        System.out.println(maxLongNumber);
        System.out.println(maxLongNumber + 1);

    }
}
