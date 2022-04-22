import java.util.Scanner;

public class MyMadLibs {
    public static void main(String[] args) {
        //
        // My Mad Libs
        //
        System.out.println("Welcome to My Mad Libs!");
        System.out.println("You wil required to enter 3 words below");
        System.out.println("=======================================");
        // Your code below
        Scanner sc = new Scanner(System.in);
        // prompt to enter a place, a food, and an animal
        System.out.println("Enter your favorite place: ");
        String place = sc.nextLine();
        System.out.println("Enter your preferred food: ");
        String food = sc.nextLine();
        System.out.println("Lastly, enter your favorite animal: ");
        String animal = sc.nextLine();
        System.out.println("=======================================");
        System.out.println("Thanks, the result will be:");
        System.out.println("You probably shouldn't get married to that " + animal + ". You'll spend the rest of your life eating " + food + " in the middle of " + place);
    }
}
