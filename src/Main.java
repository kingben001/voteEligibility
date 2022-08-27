import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        boolean anotherPerson;
        do {
            System.out.println("How old are you?");
            int age = keyboard.nextInt();

            System.out.println("Are you a citizen?");
            boolean citizen = keyboard.nextBoolean();

            System.out.println("Are you a resident?");
            boolean resident = keyboard.nextBoolean();

            System.out.println("Are you registered to vote?");
            boolean registered = keyboard.nextBoolean();

            if (age < 18) {
                System.out.println("You are too young");

                if (!citizen) {
                    System.out.println("You are not a citizen");
                }
                if (!resident) {
                    System.out.println("You are not a resident");
                }
                if (!registered) {
                    System.out.println("You are not registered to vote");
                }

            }
            else {
                System.out.println("You are ready to vote!");
            }

            System.out.println("Is there another person?");
            anotherPerson = keyboard.nextBoolean();

        }

        while (anotherPerson);
    }
}