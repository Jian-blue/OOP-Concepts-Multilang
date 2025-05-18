public class Weapon implements ItemStuff {
    private String name;
    private int quantity;
    private String type;
    private int damage;

    public Weapon(String name, int quantity, String type, int damage) {
        this.name = name;
        this.quantity = quantity;
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String displayInfo() {
        return "Item: " + name + ", Type: " + type + ", Quantity: " + quantity + ", Damage: " + damage;
    }
}
