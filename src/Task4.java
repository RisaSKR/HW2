import java.util.*;

public class Task4
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        //Choose an odd number between 50 and 100 and save it as an int variable
        //telling us how many Lego bricks we have (e.g. amountOfBricks)
        System.out.print("Choose an odd number between 50 and 100 = ");
        int amountOfBricks = sc.nextInt();
        // Check the range of the select number5
        System.out.println("The Odd Numbers are:");
        // number % 2 != 0 means its odd number
        if (amountOfBricks % 2 != 0) {
            System.out.println(amountOfBricks + " ");
        }else {
            System.out.println( "error" );
        }


        //select an even number between 5 and 10
        // stating how many Lego blocks fit in one container
        System.out.println("Choose an Even number between 5 and 10 = ");
        int containerCapacity = sc.nextInt();
        System.out.println("The Even Numbers are:");
        // number % 2 == 0 menas its even number
        if (containerCapacity % 2 == 0) {
            System.out.println(containerCapacity + " ");
        }else{
            System.out.println( "error" );
        }


        //Show how many full container we have
        int  fullContainers,NotFullContainers,NotCompletelyFullContainers;

        int fullContainer = amountOfBricks / containerCapacity;
        System.out.println("The Number of full containers are : " + fullContainer);
        // To Calculate the General Number of  container the amount of bricks / by the Container Capacity
        int NotcompletelyFullContainers = amountOfBricks / containerCapacity;
        System.out.println("The General Number of Containers are : " + NotcompletelyFullContainers);
        // Calculate the rest of bricks
        int NonFullContainers=containerCapacity % amountOfBricks;
        System.out.println("The Rest Number of Containers are : " + NonFullContainers);










    }
}
