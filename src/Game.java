import Controller.LocationController;
import Controller.MapController;
import Model.Location.*;
import Model.Person.Player;
import Util.Util;

import java.util.Scanner;

public class Game {
    private Location[][] map;
    private final int mapX = 10;
    private final int mapY = 10;
    private boolean isGameOn;
    private Player player;

    Game()
    {
        isGameOn = false;
    }

    public void newGame()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Witaj na WSB!");
        System.out.println("Podaj imie swojego bohatera: ");
        String playerName = scan.nextLine();
        player = new Player(playerName, 100, 15, 0);
        isGameOn = true;
        map = MapController.generate(mapX, mapY);
        Gameplay();
    }

    private void Gameplay()
    {
        System.out.println("Witaj na WYSPIE SZALONEGO BOGA");
        while(isGameOn)
        {
            Location currentLocation =map[player.getX()][player.getY()];
            LocationController.DisplayLocation(currentLocation);
            chooseLocation(currentLocation);
            if(isGameOver()) break;


            int choose = chooseOption();
            switch(choose)
            {
                case 1:
                    MapController.moveWest(player);
                    break;

                case 2:
                    MapController.moveEast(player, mapX);
                    break;

                case 3:
                    MapController.moveNorth(player);
                    break;

                case 4:
                    MapController.moveSouth(player, mapY);
                    break;
            }
        }
    }

    private int chooseOption()

    {
        int choose;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Co chcesz zrobic?");
            System.out.println("[1] Idz na zachod");
            System.out.println("[2] Idz na wschod");
            System.out.println("[3] Idz na polnoc");
            System.out.println("[4] Idz na poludnie");
            choose = scan.nextInt();
        }while(choose<1 || choose>4);
        return choose;
    }

    private void chooseLocation(Location location)
    {
        if(Util.implementsInterface(location, IToucheble.class))
        {
                EnemyLocation enemyLocation = (EnemyLocation)location;
                LocationController.doAction(enemyLocation, player);
        }else if(Util.implementsInterface(location, ITrade.class))
        {
            CityLocation cityLocation = (CityLocation)location;
            LocationController.doAction(cityLocation, player);
        }
    }

    private boolean isGameOver()
    {
        return player.getHP() < 0;
    }

}
