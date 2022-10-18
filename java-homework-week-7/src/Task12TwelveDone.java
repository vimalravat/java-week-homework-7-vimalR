import java.util.Scanner;

public class Task12TwelveDone {
//Write a program that tells us input value is number or an alphabet or symbol.

    public static void main(String[] args) {

        Scanner scannerOne = new Scanner(System.in);
        System.out.println(" Enter any character:  ");
        char ch = scannerOne.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Alphabet");
        } else if ((ch >= '0' && ch <= '9')) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is a special character");
        }

    }
}