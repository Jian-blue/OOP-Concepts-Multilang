// Same from Encapsulation ..............
// This class(Item) is created With private attribute and public methods which is Encapsulation

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

    // Overloading Polymorphism happens on Compile Time, and it works accourding to their value passes
    // Overloading for addItem
    public void addItem(String name, String type, int quantity) {
        items.add(new Fruit(name, type, quantity));
    }

    // Overloading for addItem
    public void addItem(String name, int quantity, String type, long damage) {
        items.add(new Weapon(name, quantity, type, damage));
    }

    public void displayInventory() {
        for(Item item : items)
            System.out.println(item.displayInfo());    // since we changed the toString to displayInfo()                  <<< new
    }                                                                                  // so need to edit here

}
