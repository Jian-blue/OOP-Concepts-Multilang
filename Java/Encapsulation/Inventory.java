// With private attribute and public methods, this is Encapsulation

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Item> items;      // We are declaring ArrayList of items

    // Constractor for Inventory
    public Inventory() {
        items = new ArrayList<>();      // We are assigning new value of an empty ArrayList into that ArrayList of items 
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInventory() {
        for(Item item : items)
            System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity());
    }
}
