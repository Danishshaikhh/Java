package basicjava;

import java.util.Scanner;

public class Statecapital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store states and capitals
        String[] states = new String[10];
        String[] capitals = new String[10];

        // Input states and capitals
        System.out.println("Enter 10 states and their capitals:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter state: ");
            states[i] = scanner.nextLine();
            System.out.print("Enter capital: ");
            capitals[i] = scanner.nextLine();
        }

        // Input state to find its capital
        System.out.print("Enter a state to find its capital: ");
        String stateToFind = scanner.nextLine();

        // Search for the state and display its capital if found
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (states[i].equalsIgnoreCase(stateToFind)) {
                System.out.println("Capital of " + states[i] + " is " + capitals[i]);
                found = true;
                break;
            }
        }

        // If state not found, display a relevant message
        if (!found) {
            System.out.println("Capital for " + stateToFind + " not found.");
        }

        scanner.close();
    }
}
