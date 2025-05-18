public class Fruit implements ItemStuff {
    private String type;
    private String name;
    private int quantity;

    public Fruit(String name, String type, int quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
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
        return "Item: " + name + ", Type: " + type + ", Quantity: " + quantity;
    }
}
