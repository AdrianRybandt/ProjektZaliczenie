package Model.Person;

import Model.Person.BasicPerson;

public class Enemy extends BasicPerson{
    private int HP;
    private int DMG;

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

    public Enemy(String name, int lvl)
    {
        this.setName(name);
        this.setLvl(lvl);
    }
}
