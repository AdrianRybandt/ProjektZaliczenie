package Controller;

import Model.Location.CityLocation;
import Model.Location.EnemyLocation;
import Model.Location.Location;
import Model.Person.Player;

import java.util.Random;

public class MapController {

    private final static String[] names = {
    "Pole", "Laka", "Bagno", "Plaza", "Las"
    };

    private final static String[] descs = {
            "Piekne, pelne zycia miejsce",
            "Smierdzi tu",
            "Lepiej uciekac stad jak najszybciej",
            "Ale paskudna okolica"
    };

    private final static String cantMove = "Nie mozesz isc do Morza, nie potrafisz plywac";


    public static Location[][] generate(int x, int y)
    {
       Random generator = new Random();
       Location[][] locations = new Location[x][y];

       for(int i = 0; i < x; i++) {
           for (int j = 0; j < y; j++) {
               if(i == 0 && j == 0)
               {
                   locations[i][j] = new CityLocation("Rodziny dom", "To twoja rodzina wioska", NPCController.generateNPC(x + y + 1));
               }else {
                   int option = generator.nextInt(10);
                   String name = names[generator.nextInt(names.length)];
                   String desc = descs[generator.nextInt(descs.length)];
                   if (option > 2)
                       locations[i][j] = new EnemyLocation(name, desc, EnemyController.generateEnemy(x + y));
                   else
                       locations[i][j] = new CityLocation(name, desc, NPCController.generateNPC(x + y + 1));
               }
           }
       }
        return locations;
    }

    public static void moveWest(Player player)
    {
        if(player.getX()-1 > 0)
        {
            System.out.println("Poszedles na zachod");
            player.setX(player.getX()-1);
        }else{
            System.out.println(cantMove);
        }
    }

    public static void moveEast(Player player, int mapX)
    {
        if(player.getX()+1 < mapX)
        {
            System.out.println("Poszedles na wschod");
            player.setX(player.getX()+1);
        }else{
            System.out.println(cantMove);
        }
    }

    public static void moveNorth(Player player)
    {
        if(player.getY()-1 > 0)
        {
            System.out.println("Poszedles na polnoc");
            player.setY(player.getY()-1);
        }else{
            System.out.println(cantMove);
        }
    }

    public static void moveSouth(Player player, int mapY)
    {
        if(player.getY()+1 < mapY)
        {
            System.out.println("Poszedles na poludnie");
            player.setY(player.getY()+1);
        }else{
            System.out.println(cantMove);
        }
    }
}
