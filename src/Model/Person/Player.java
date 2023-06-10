package Model.Person;

import Model.Item;
import Model.Person.BasicPerson;

public class Player extends BasicPerson{
    private int HP;
    private int DMG;

    private int money;

    private int X;
    private int Y;

    private Item item;

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDMG() {
        return DMG;
    }

    public void setDMG(int DMG) {
        this.DMG = DMG;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Player(String name, int HP, int DMG, int money)
    {
       this.setName(name);
       this.setLvl(1);
       this.setDMG(DMG);
       this.setHP(HP);
       this.setMoney(money);
       this.setX(0);
       this.setY(0);
    }

}
