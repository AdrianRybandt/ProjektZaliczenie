package Controller;

import Model.Person.NPC;

import java.util.Random;

public class NPCController {

    private static String[] names = {
            "Rychu Peja",
            "Robcio Lewandowski",
            "Elfik",
            "Syn przyjaciolki Twojej starej",
            "Kek"
    };
    public static NPC generateNPC(int lvl)
    {
        Random generator = new Random();
        String name = names[generator.nextInt(names.length)];
        return new NPC(name, 1, ItemController.generateItem(lvl));
    }
}
