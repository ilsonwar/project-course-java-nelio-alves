package basic.CircunferenceAndCurrency._exercises.util;

public class CurrencyConverter {

    public static final double IOF= 0.06;

    public static double dollarToReal(double dollarPrice, double amoutDollar ){
        return (amoutDollar * dollarPrice) * (1.0 +IOF);

    }

}
