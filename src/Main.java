import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome\n would you like to start\n(y/n)");
        String start = scan.nextLine();
        start = start.toLowerCase();
        if(start.equals("no") || start.equals("n"))
        {
            System.out.println("goodbye");
            System.exit(0);//ends the program
        }

        System.out.println("what is your name?");
        String users_name = scan.nextLine();

        System.out.println("what is your age");
        int users_age = scan.nextInt();
        if(users_age<21)
        {
            System.out.println("enter a new age above 21");
            users_age = scan.nextInt();
        }

        scan.nextLine();

        Player user = new Player(users_name, users_age);

        System.out.println("what game do you want to play \nslots\nroulettte\nblack jack \npoker");
        String gamename = scan.nextLine();//program stops here without running this line idk why?
        if(gamename.equals("slots"))
        {
            System.out.println("welcome to slots enter stop when ready to quit");
            String slotsvar = "";
            ArrayList<Integer> slotslist = new ArrayList<>();
            String win_lose = "";
            while ( slotsvar != "stop") 
            {
                
                for(int i = 0;i<4;i++)
                {
                    Random random = new Random();
                    slotslist.add(i,random.nextInt(3) + 1);//random number between 0 and 2 inclusive
                }
                if(slotslist.get(0) == slotslist.get(1) && slotslist.get(1) == slotslist.get(2))
                {
                    win_lose = "you WON";
                }
                else
                {
                    win_lose = "you LOST";
                }
                System.out.println( win_lose + "play again?");
                slotsvar = scan.nextLine();//slots can win and lose but saying stop does not work need to fix it
            }
        }


       
        
        scan.close();
    }
}
