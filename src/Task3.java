import java.lang.Math;

public class Task3
{
    // random 100
    public static void main (String[] args){
        double a = Math.random() * 100;
        System.out.println(a);

        // to find odd or even number
        if (a % 2 == 0)
            System.out.println( a + " is even");
        else
            System.out.println( a + " is odd");



    }
}
