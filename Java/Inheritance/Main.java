public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Rock melon", 5);
        Item item2 = new Item("Sword", 2);
        
        // inherited subclass Fruit to Item
        Fruit fruit1 = new Fruit("Apple", "Fuji", 3);                   // <<< new

        // inherited subclass Fruit to Item
        Weapon weapon1 = new Weapon("Pan", 1, "Melee", 120);     // <<< new

        inventory.addItem(item1);
        inventory.addItem(item2);

        // adding the inherited subclass Fruit into the inventory
        inventory.addItem(fruit1);                                                          // <<< new

        // adding the inherited subclass Fruit into the inventory
        inventory.addItem(weapon1);                                                          // <<< new

        inventory.displayInventory();

    }
}