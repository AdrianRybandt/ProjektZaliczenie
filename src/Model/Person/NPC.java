package Model.Person;

import Model.Item;
import Model.Person.BasicPerson;

public class NPC extends BasicPerson {

    private Item item;
    public NPC(String name, int lvl, Item item)
    {
        this.setName(name);
        this.setLvl(lvl);
        this.setItem(item);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
