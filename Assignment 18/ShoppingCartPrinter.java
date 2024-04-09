import java.util.Scanner;

public class ShoppingCartPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ItemToPurchase item1 = new ItemToPurchase();
        ItemToPurchase item2 = new ItemToPurchase();

        System.out.println("Item 1");
        System.out.println("Enter the item name:");
        item1.setName(scanner.nextLine());
        System.out.println("Enter the item price:");
        item1.setPrice(scanner.nextInt());
        System.out.println("Enter the item quantity:");
        item1.setQuantity(scanner.nextInt());
        scanner.nextLine(); // consume newline

        System.out.println("\nItem 2");
        System.out.println("Enter the item name:");
        item2.setName(scanner.nextLine());
        System.out.println("Enter the item price:");
        item2.setPrice(scanner.nextInt());
        System.out.println("Enter the item quantity:");
        item2.setQuantity(scanner.nextInt());

        int totalCost = item1.getTotalCost() + item2.getTotalCost();

        System.out.println("\nTOTAL COST");
        System.out.println(item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getPrice() + " = $" + item1.getTotalCost());
        System.out.println(item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getPrice() + " = $" + item2.getTotalCost());
        System.out.println("\nTotal: $" + totalCost);

        scanner.close();
    }
}