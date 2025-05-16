// Same from Encapsulation ..............
// This class(Item) is created With private attribute and public methods which is Encapsulation

public class Item {
    private String Name;
    private int Quantity;

    // Constractor for Item
    public Item(String name, int quantity) {
        this.Name = name;
        this.Quantity = quantity;
    }

    // getter and setter method
    public String getName() {
        return Name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override                       // Override Polymorphism happens on Runtime
    public String toString() {
        return "Item: " + Name + ", Quantity: " + Quantity;                         // <<< new
    }
}
