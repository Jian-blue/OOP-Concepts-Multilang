public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Fruit fruit1 = new Fruit("Apple", "Fuji", 3);
        Weapon weapon1 = new Weapon("Pan", 1, "Melee", 120);

        inventory.addItem(fruit1);
        inventory.addItem(weapon1);

        inventory.displayInventory();
        System.out.println();

        inventory.addItem("Banana", "Cavendish", 5);
        inventory.addItem("Katana", 2, "Blade", 90);

        inventory.displayInventory();
    }
}
