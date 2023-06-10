package Controller;

import Model.Item;

import java.util.Random;

public class ItemController {

    private static String[] names = {
            "Miecz",
            "Duzy miecz",
            "Mega duzy miecz",
            "Taki miecz jakiego jeszcze nie widziales synek",
            "Luk"
    };

    public static Item generateItem(int dmg)
    {
        Random generator = new Random();
        String name = names[generator.nextInt(names.length)];
        return new Item(name, dmg, dmg*2);
    }
}
