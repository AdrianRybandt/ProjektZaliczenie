package Controller;

import Model.Location.IToucheble;
import Model.Location.ITrade;
import Model.Location.Location;
import Model.Person.Enemy;
import Model.Person.Player;

import java.util.Scanner;

public class LocationController {
    public static void doAction(IToucheble iToucheble, Player player)
    {
        Enemy enemy = iToucheble.getEnemy();
        Scanner scan = new Scanner(System.in);
        int choose;
        while(enemy.getHP()>0 && player.getHP()>0)
        {
            do{
                System.out.println("Spotkales: "+enemy.getName());
                System.out.println("[1]Atakuj");
                System.out.println("[2]Uciekaj");
                choose = scan.nextInt();
            }while(choose < 1 || choose > 2);

            switch(choose)
            {
                case 1:
                    enemy.setHP(enemy.getHP()-player.getDMG());
                    System.out.println("Zadales "+player.getDMG()+" obrazen");
                    if(enemy.getHP()>0)
                    {
                        player.setHP(player.getHP()- enemy.getDMG());
                        System.out.println("Dostales "+enemy.getDMG()+" obrazen");
                    }else
                    {
                        player.setMoney(enemy.getLvl()*20);
                        System.out.println("Gratuluje zwyciezyles!");
                        System.out.println("Dostajesz: "+enemy.getLvl()*20+" zlota");
                    }
                    break;
                case 2:
                    break;
            }

        }
    }

    public static void doAction(ITrade iTrade, Player player)
    {
        Scanner scan = new Scanner(System.in);
        int choose;
        System.out.println("Czesc, nazywam sie: "+iTrade.getNPC().getName());
        do {
            System.out.println("Mam na sprzedaz: [" + iTrade.getNPC().getItem().getName() +
                    "][DMG:" + iTrade.getNPC().getItem().getDmg() + "]");
            System.out.println("Chcialbys moze dokonac zakupu za " + iTrade.getNPC().getItem().getPrice() + " zlota?");
            System.out.println("[1]Tak \n[2]Nie");
            choose = scan.nextInt();
        }while(choose<1 || choose>2);
        switch(choose)
        {
            case 1:
                if(player.getMoney() >= iTrade.getNPC().getItem().getPrice())
                {
                    player.setItem(iTrade.getNPC().getItem());
                    player.setMoney(player.getMoney()-iTrade.getNPC().getItem().getPrice());
                    System.out.println("Kupiles: "+ iTrade.getNPC().getItem().getName() +
                            "][DMG:" + iTrade.getNPC().getItem().getDmg() + "]");
                }else {
                    System.out.println("Nie masz wystarczajaco zlota");
                }
                break;
            case 2:
                break;
        }
    }

    public static void DisplayLocation(Location location)
    {
        System.out.println("Znajdujesz sie w: "+location.getName());
        System.out.println(location.getDescription());
    }


}
