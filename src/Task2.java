public class Task2
{
    public static void main(String[] args)
    {
        //Write a program that will calculate your weight on Mars.
        float earthWeightSirisa;
        float marsWeightSirisa;
        earthWeightSirisa=58f;
        marsWeightSirisa=earthWeightSirisa*3.71f;
        System.out.println("Earth weight = "+earthWeightSirisa);
        System.out.println("Mars weight = "+marsWeightSirisa);

        double marsWeightIndouble;
        marsWeightIndouble=marsWeightSirisa;
        System.out.println("Kilograms on Mars after converting to double = "+marsWeightIndouble);

        System.out.printf("Kilograms on Mars displayed to four decimal places = %.4f %n", marsWeightIndouble);

        int marsWeightInInt;
        marsWeightInInt=(int)marsWeightIndouble;
        System.out.println("Kilograms on Mars when casted to integer ="+ marsWeightInInt);

        char marsWeightInChar = (char)marsWeightInInt;
        System.out.println("The ASCII table equivalent of marsWeightInInt is = "+ marsWeightInChar);

        int Example0fMathOnChar;
        Example0fMathOnChar= marsWeightInChar+marsWeightInChar;
        System.out.println("An example of a mathematical operation on the char type = "+ Example0fMathOnChar);

    }
}
