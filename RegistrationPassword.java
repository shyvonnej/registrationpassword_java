// SHYVONNE HO YUE LYNN
// Assignment 1
// Question 2

import java.util.Random;
import java.util.Scanner;
public class RegistrationPassword {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your ic number: ");
        String ic = scan.next();
        
        // 3 front alphabet from name
        name = name.toUpperCase();
        String alphabet = name.substring(0,3);
        System.out.print(alphabet);
        
        // state code
        System.out.print(ic.substring(6,8));
        
        // generate random number between 0-999
        Random random = new Random();
        int randomNumber = random.nextInt(1000);
        System.out.print(randomNumber);
        
        //birth month
        String Month = ic.substring(2,4);
        int code = Integer.parseInt(Month);
        switch (code) {
            case 1 -> System.out.print("Jan");
            case 2 -> System.out.print("Feb");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("Apr");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("Aug");
            case 9 -> System.out.print("Sept");
            case 10 -> System.out.print("Oct");
            case 11 -> System.out.print("Nov");
            case 12 -> System.out.print("Dec");
            default -> {
            }
        }
    }
}
