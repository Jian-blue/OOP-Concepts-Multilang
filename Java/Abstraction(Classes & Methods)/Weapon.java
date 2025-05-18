// This class(Weapon) is inherited from Item, for inheritance we use [Subclass extends Superclass]

public class Weapon extends Item {
    private String Type;
    private long Damage;

    public Weapon(String name, int quantity, String type, long damage) {
        super(name, quantity);
        this.Type = type;
        this.Damage = damage;
    }

    public long getDamage() {
        return Damage;
    }

    public String getType() {
        return Type;
    }

    @Override                       // Overriding the absttract method in Item class                <<< new
    public String displayInfo() {
        return "Item: " + getName() + ", Type: " + Type + ", Damage: " + Damage +
                                                               ", Quantity: " + getQuantity();
    }
}
