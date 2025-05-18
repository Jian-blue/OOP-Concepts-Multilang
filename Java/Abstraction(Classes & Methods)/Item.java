// This class(Item) is created With private attribute and public methods which is Encapsulation

public abstract class Item {                // Abstract for a class
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

    public abstract String displayInfo();       // Abstraction for a method                   <<< new
}

/*
 * There is not going to be any Item object, but the descendants from Item like Weapon & Fruit
 * will have object and we need to display or print them by using this method Abstraction
 * 
 * i.e. We are not using the Item class but need to create descendants from Item class, which
 * are gonna we use - this is called Abstraction method
 */
