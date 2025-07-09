/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_practical;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Edited using github editing option
 * @author Nisarg
 */
public class InventorySystem {

    private final List<Item> itemList = new ArrayList<>();
    private int itemIdCounter = 0;

    public void addItem(String description, double price) {
        itemIdCounter++;
        Item item = new Item(itemIdCounter, description, price);
        itemList.add(item);
    }

    public void printInventory() {
        for (Item item : itemList) {
            System.out.println("ID: " + item.getId() +
                    "\t Description: " + item.getDescription() +
                    "\t Price: $" + item.getPrice());
        }
    }

    public double getItemPriceById(int id) {
        for (Item item : itemList) {
            if (item.getId() == id) {
                return item.getPrice();
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        InventorySystem system = new InventorySystem();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter description of the item to add:");
        String description = input.nextLine();

        System.out.println("Enter the price:");
        double price = input.nextDouble();

        system.addItem(description, price);

        system.addItem("Sony Headphones", 199.99);
        system.addItem("JBL Speaker", 99.99);

        system.printInventory();

        System.out.println("Enter ID of the item to get price:");
        int searchId = input.nextInt();
        double itemPrice = system.getItemPriceById(searchId);
        System.out.println("Item's price is: $" + itemPrice);

        Item tempItem = new Item(0, "", 0);
        System.out.println(tempItem.nisargambade(itemPrice));
    }
}
