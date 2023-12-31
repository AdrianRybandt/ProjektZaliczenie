package Model;

public class Item {
    private String name;
    private int dmg;

    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDmg() {
        return dmg;
    }

    public void setDmg(int dmg) {
        this.dmg = dmg;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Item(String name, int dmg, int price) {
        this.name = name;
        this.dmg = dmg;
        this.price = price;
    }
}
