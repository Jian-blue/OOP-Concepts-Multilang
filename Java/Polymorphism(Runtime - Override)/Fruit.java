// This class(Fruit) is inherited from Item, for inheritance we use [Subclass extends Superclass]

public class Fruit extends Item {       // Item is the superclass, fruit is the subclass to item, and it inherits
    private String Type;                // the attributes and any other methods that are in class Item as its own
    
    public Fruit(String name, String type, int quantity) {
        super(name, quantity);
        this.Type = type;
    }

    public String getType() {
        return Type;
    }

    @Override                       // Override Polymorphism happens on Runtime
    public String toString() {                                                                         // <<< new
        return "Item: " + getName() + ", Type: " + Type + ", Quantity: " + getQuantity();
    }
}
