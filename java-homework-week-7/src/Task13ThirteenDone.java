import java.util.Scanner;
//Write a Java program which input any number between 1- 7, it printt The Days

public class Task13ThirteenDone {
    public static void main(String[] args) {
        int day;
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter number here:   ");
        day = myScan.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }
    }

}
