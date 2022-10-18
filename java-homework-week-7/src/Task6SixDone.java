import java.util.Scanner;

public class Task6SixDone {


    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter any number");

        int number= Sc.nextInt();

        //checking whether the number is even or odd

        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is odd");


    }
}


