package Controller;

import Model.Person.Enemy;

import java.util.Random;

public class EnemyController {
    private final static String[] names = {"Orc", "Orc Warrior", "Goblin", "Arka Gdynia"};
    public static Enemy generateEnemy(int lvl)
    {
        Random generator = new Random();
        Enemy enemy = new Enemy(names[generator.nextInt(names.length)], generator.nextInt(lvl)+1);
        setSkills(enemy);
        return enemy;
    }

    private static void setSkills(Enemy enemy)
    {
        enemy.setDMG(enemy.getLvl()*2);
        enemy.setHP(enemy.getLvl()*5);
    }
}
