public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

//      Item item1 = new Item("Rock melon", 5);      we can't use directly                    <<< new
//      Item item2 = new Item("Sword", 2);           because of Abstraction
        
        // inherited subclass Fruit to Item
        Fruit fruit1 = new Fruit("Apple", "Fuji", 3);

        // inherited subclass Fruit to Item
        Weapon weapon1 = new Weapon("Pan", 1, "Melee", 120);

//      inventory.addItem(item1);                                                             <<< new
//      inventory.addItem(item2);

        // adding the inherited subclass Fruit into the inventory
        inventory.addItem(fruit1);

        // adding the inherited subclass Fruit into the inventory
        inventory.addItem(weapon1);

        // now this is polymorphic call as we override funciton(toString) at the class phase
        inventory.displayInventory();
        System.out.println();

        // this is overloaded polymorphic method to assign value in Item class
        inventory.addItem("Banana", "Fuji", 2);
        inventory.addItem("Katana", 2, "Melee", 85);
        inventory.displayInventory();                                                      // <<< new

    }
}