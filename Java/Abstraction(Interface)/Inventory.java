import java.util.ArrayList;

public class Inventory {
    private ArrayList<ItemStuff> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(ItemStuff item) {
        items.add(item);
    }

    // Overloaded method to add a Fruit
    public void addItem(String name, String type, int quantity) {
        items.add(new Fruit(name, type, quantity));
    }

    // Overloaded method to add a Weapon
    public void addItem(String name, int quantity, String type, int damage) {
        items.add(new Weapon(name, quantity, type, damage));
    }

    public void displayInventory() {
        for (ItemStuff item : items) {
            System.out.println(item.displayInfo());
        }
    }
}
