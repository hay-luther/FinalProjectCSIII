import java.util.Scanner;

public class runner {
    
    
    public static void main(String[] args) {
        
        startup();
        refreshScreen();
        
        Player player = new Player();
        
        Page pg1 = new Page("You approach a fork in the road", "right", "left");
        System.out.println(pg1.askQuestion());
        
        
        Page pg2 = new Page("Do you want to fight BOSS", "yes", "no");
        boolean a2 = pg2.askQuestion();
        System.out.println(a2);
        if (a2)
            if (pg2.fight(player, new Enemy()))
                System.out.println("player wins");
            else
                System.out.println("enemy wins");
        
    }
    
    public static void startup() {
        String a = "";
        a += " _____                              ___       _                     _                       _____                         ";
        a += "\n/  ___|                            / _ \\     | |                   | |                     |  __ \\                        ";
        a += "\n\\ `--.  _   _  _ __    ___  _ __  / /_\\ \\  __| |__   __ ___  _ __  | |_  _   _  _ __  ___  | |  \\/  __ _  _ __ ___    ___ ";
        a += "\n `--. \\| | | || '_ \\  / _ \\| '__| |  _  | / _` |\\ \\ / // _ \\| '_ \\ | __|| | | || '__|/ _ \\ | | __  / _` || '_ ` _ \\  / _ \\";
        a += "\n/\\__/ /| |_| || |_) ||  __/| |    | | | || (_| | \\ V /|  __/| | | || |_ | |_| || |  |  __/ | |_\\ \\| (_| || | | | | ||  __/";
        a += "\n\\____/  \\__,_|| .__/  \\___||_|    \\_| |_/ \\__,_|  \\_/  \\___||_| |_| \\__| \\__,_||_|   \\___|  \\____/ \\__,_||_| |_| |_| \\___|";
        a += "\n              | |                                                                                                         ";
        a += "\n              |_|                                         ";
        a += "";
        System.out.println(a);
        
        System.out.println("\n\n Welcome to Super Adventure Game!");
        System.out.println("Press ENTER to start!");
        
        Scanner s = new Scanner(System.in);
        s.nextLine();
        
    }
    
    public static void refreshScreen() {
        System.out.print("\u000C");
    }
    
    
    
    
}