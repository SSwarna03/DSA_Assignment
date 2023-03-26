import java.util.*;
import java.text.*;

public class Solution {
    public static String formatCurrency(Locale locale, double value) {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    return currencyFormatter.format(value);
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        Locale usLocale = Locale.US;
    String us = formatCurrency(usLocale, payment);

    Locale indiaLocale = new Locale("en", "IN");
    String india = formatCurrency(indiaLocale, payment);

    Locale chinaLocale = Locale.CHINA;
    String china = formatCurrency(chinaLocale, payment);

    Locale franceLocale = Locale.FRANCE;
    String france = formatCurrency(franceLocale, payment);

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}