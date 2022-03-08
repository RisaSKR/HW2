import java.math.BigDecimal;

public class Task5
{
    public static void main (String[] args) {

        double product =  9.99;
        System.out.println("Product = "+product);
        //Price of product

        double vat = 23;
        System.out.println("VAT = "+vat);
        // vat 23%

        double originalPrice = (1+vat/100)/product;
        System.out.println("This Original Price = "+originalPrice);
        //Original price

        double sell = 10000;
        System.out.println("Product sold 10,000 pcs = "+sell);
        //sold 10,000 pieces

        double thing = product*sell;
        System.out.println ("Product sold 10,000 pcs exclude VAT = "+thing);
        //product 9.99 multiple 10,000

        double result = thing-sell;
        System.out.println("This is new value= "+result);
        // calculate product excluding vat



        //Using Big Decimal class
        BigDecimal bdproduct = new BigDecimal("9.99");
        System.out.println("(BigDecimal)Product = "+product);

        BigDecimal bdvat = new BigDecimal("1.23");
        System.out.println("(BigDecimal)VAT = "+bdvat);

        BigDecimal bdoriginalPrice = bdproduct.divideToIntegralValue(bdvat);
        System.out.println("(BigDecimal)Original Price = "+bdoriginalPrice);

        BigDecimal bdNumberSoldProduct = new BigDecimal("10000");

        BigDecimal bdsold = bdproduct.multiply(bdNumberSoldProduct);
        System.out.println("(BigDecimal)Product sold 10,000 pcs = "+bdsold);

        BigDecimal bdsoldExcludeVat = bdoriginalPrice.multiply(bdNumberSoldProduct);
        System.out.println("(BigDecimal)Product with out VAT sold 10,000 pcs = "+bdsoldExcludeVat);

        BigDecimal bdDifference = bdsold.subtract(bdsoldExcludeVat);
        System.out.println("(BigDecimal)Difference between price with VAT and without VAT = "+bdDifference);









    }
}
