import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> groceryList = new ArrayList<>();
        String item;
        String choice;

        System.out.println("Welcome to the Grocery List Program!");

        
        do {
            System.out.print("Enter an item for your grocery list: ");
            item = scanner.nextLine();
            groceryList.add(item);

            System.out.print("Do you want to add another item? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
        } while (choice.equals("yes"));

     
        displayGroceryList(groceryList);

        
        boolean continueUpdating = true;
        while (continueUpdating) {
            System.out.print("Do you want to exit or update your list? (exit/update): ");
            choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("exit")) {
                continueUpdating = false;
            } else if (choice.equals("update")) {
                updateGroceryList(groceryList, scanner);
                displayGroceryList(groceryList);
            } else {
                System.out.println("Invalid choice. Please enter 'exit' or 'update'.");
            }
        }

        System.out.println("Good luck shopping!");
        scanner.close();
    }

   
    private static void displayGroceryList(ArrayList<String> groceryList) {
        System.out.println("\nYour grocery list:");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
        System.out.println();
    }

   
    private static void updateGroceryList(ArrayList<String> groceryList, Scanner scanner) {
        System.out.print("Enter the number of the item you want to update: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine(); 

        if (itemNumber < 1 || itemNumber > groceryList.size()) {
            System.out.println("Invalid item number.");
            return;
        }

        System.out.print("Do you want to remove or replace this item? (remove/replace): ");
        String action = scanner.nextLine().trim().toLowerCase();

        if (action.equals("remove")) {
            groceryList.remove(itemNumber - 1);
        } else if (action.equals("replace")) {
            System.out.print("Enter the new item: ");
            String newItem = scanner.nextLine();
            groceryList.set(itemNumber - 1, newItem);
        } else {
            System.out.println("Invalid action. Please enter 'remove' or 'replace'.");
        }
    }
}