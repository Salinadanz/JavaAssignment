// Furniture interface representing the family of related products
interface Furniture {
    String getType();
}

class Chair implements Furniture {
    private String type;

    public Chair(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
class CoffeeTable implements Furniture {
    private String type;

    public CoffeeTable(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
class Sofa implements Furniture {
    private String type;

    public Sofa(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new Chair("Modern");
    }

    public Sofa createSofa() {
        return new Sofa("Modern");
    }

    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable("Modern");
    }
}
class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new Chair("Victorian");
    }

    public Sofa createSofa() {
        return new Sofa("Victorian");
    }

    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable("Victorian");
    }
}
class ArtDecoFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new Chair("Art Deco");
    }

    public Sofa createSofa() {
        return new Sofa("Art Deco");
    }

    public CoffeeTable createCoffeeTable() {
        return new CoffeeTable("Art Deco");
    }
}
class FurnitureShop {
    private FurnitureFactory factory;

    FurnitureShop(FurnitureFactory factory) {
        this.factory = factory;
    }

    void orderFurniture() {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();
        System.out.println("Ordered furniture:");
        System.out.println("Chair: " + chair.getType());
        System.out.println("Sofa: " + sofa.getType());
        System.out.println("Coffee Table: " + coffeeTable.getType());
    }
}
public class Main {
    public static void main(String[] args) {

        FurnitureShop shop = new FurnitureShop(new ModernFurnitureFactory());
        shop.orderFurniture();


        shop = new FurnitureShop(new VictorianFurnitureFactory());
        shop.orderFurniture();
        shop = new FurnitureShop(new ArtDecoFurnitureFactory());
        shop.orderFurniture();

    }
}
