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

    // Overloading Polymorphism happens on Compile Time, and it works accourding to their value passes           <<< new
    // Overloading for addItem
    public void addItem(String name, String type, int quantity) {
        items.add(new Fruit(name, type, quantity));
    }

    // Overloading for addItem                                                                                // <<< new
    public void addItem(String name, int quantity, String type, long damage) {
        items.add(new Weapon(name, quantity, type, damage));
    }

    public void displayInventory() {
        for(Item item : items)
            System.out.println(item.toString());    // Polymorphic call
    }

    // Overloading for displayInventory
    public void displayInventory(String type) {     // display by type ***important                           // <<< new
        for (Item item : items) {
            if(item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            } else if(item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                System.out.println(item.toString());
            }
        }
        /*

         * item instanceof Fruit: Checks if the current item is of type Fruit.
         * ((Fruit) item).getType(): Casts item to a Fruit so we can call the getType() method, which presumably returns a string describing the fruit type.
         * .equalsIgnoreCase(type): Compares the item's type (case-insensitively) to a given type string.
        
         */
    }
}
