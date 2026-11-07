import java.util.Scanner;


public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner scanner = new Scanner(System.in);
    
    SpecialGrass[] inventory = new SpecialGrass[2];

    inventory[0] = new ArtificialGrass("Ahnaf's Pro Turf Roll", 15.00, 300, 50.0, true);
    inventory[1] = new DecorativeGrass("Golden Japanese Forest Grass", 8.50, 150, "Golden Yellow", false);

    boolean keepRunning = true;

    System.out.println("Welcome to Ahnaf's Special Grass Store Management System");

    while (keepRunning) {
      System.out.println("\nSelect an option:");
      System.out.println("1. View All Inventory");
      System.out.println("2. Update Product Stock Level");
      System.out.println("3. Exit System");
      System.out.print("Enter your choice (1-3): ");

      int choice = scanner.nextInt();

      if (choice == 1) {
        System.out.println("\nCurrent Store Inventory");
        for (int i =0; i < inventory.length; i++) {
          System.out.println((i + 1) + ". " + inventory[i].toString());
        }
      } else if (choice == 2) {
        System.out.println("\nUpdate Stock Level");
        for (int i = 0; i < inventory.length; i++) {
          System.out.println((i + 1) + ". " + inventory[i].getName() + " (Current Stock: " + inventory[i].getStockQuantity() + ")");
        }
        System.out.print("Select item number to update: ");
        int itemIndex = scanner.nextInt() - 1;

        if (itemIndex >= 0 && itemIndex < inventory.length) {
          System.out.print("Enter new stock quantity: ");
          int newStock = scanner.nextInt();
          inventory[itemIndex].setStockQuantity(newStock);
        } else {
          System.out.println("Invalid item selection.");
        }
      } else if (choice == 3) {
        keepRunning = false;
        System.out.println("Exiting Ahnaf's Special Grass Management System. Goodbye!");
      } else {
        System.out.println("Invalid choice. Please enter a number between 1 and 3.");
      }
    }
    scanner.close();
  }
}
