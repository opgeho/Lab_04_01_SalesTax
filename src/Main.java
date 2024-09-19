public class Main
{
    public static void main(String[] args)
    {
        final double TAX_RATE = .05;
        double purchasePrice = 59.99;
        double salesTax = 0;
        salesTax = purchasePrice * TAX_RATE;
        System.out.println("The sales tax on a purchase of " + purchasePrice + " is " + salesTax);
    }
}