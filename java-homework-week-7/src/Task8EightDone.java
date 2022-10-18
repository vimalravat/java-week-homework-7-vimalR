import java.util.Scanner;

public class Task8EightDone {
    public static void main(String[] args) {

        Scanner scannerOne = new Scanner(System.in);
        System.out.println(" Enter any character from A to F ");
        char ch = scannerOne.next().charAt(0);


        if (ch == 'A') {
            System.out.println("Ahmedabad is my city");
        } else if (ch == 'B') {
            System.out.println("Baroda is my city");
        } else if (ch == 'C') {
            System.out.println("Chandigarh is my city");
        } else if (ch == 'D') {
            System.out.println("Dari is my city");
        } else if (ch == 'E') {
            System.out.println("Edinburgh is my city");
        } else if (ch == 'F') {
            System.out.println("Florence is my city");
        } else {
            System.out.println("Invalid entry");
            scannerOne.close();
        }
    }
}

