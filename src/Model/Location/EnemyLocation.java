package Model.Location;

import Model.Person.Enemy;

public class EnemyLocation extends Location implements IToucheble{
    private Enemy enemy;

    public EnemyLocation(String name, String description, Enemy enemy)
    {
        this.setName(name);
        this.setDescription(description);
        this.setEnemy(enemy);
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }


}
