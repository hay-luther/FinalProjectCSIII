import java.util.Scanner;
import java.lang.Math;

public class Page {
    
    String question;
    String optionA;
    String optionB;
    boolean isViolent;
    boolean isSingle;
    boolean changesWeapon;
    Weapons.Weapon newWeapon;
    
    
    
    public Page(String q, String opta, String optb, boolean iv, boolean is) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = iv;
        isSingle = is;
        changesWeapon = false;
    }
    
    public Page(String q, String opta, String optb, boolean iv) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = iv;
        isSingle = false;
        changesWeapon = false;
    }
    
    public Page(String q, String opta, String optb, String r) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = false;
        isSingle = false;
        changesWeapon = false;
        
        runner.player.resetHealth();
        runner.player.resetWeapon();
    }
    
    public Page(String q, String opta, String optb, Weapons.Weapon w) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = false;
        isSingle = false;
        changesWeapon = true;
        newWeapon = w;
    }
    
    public Page(String q, String opta, String optb) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = false;
        isSingle = false;
        changesWeapon = false;
    }
    
    public Page(String q) {
        question = q;
        optionA = "";
        optionB = "";
        isViolent = false;
        isSingle = true;
        changesWeapon = false;
    }
    
    public Page(String q, Weapons.Weapon w) {
        question = q;
        optionA = "";
        optionB = "";
        isViolent = false;
        isSingle = false;
        changesWeapon = true;
        newWeapon = w;
    }
    
    public String tString() {
        return question + "\n\n" + "Would you like to " + optionA + "(a) or " + optionB + "(b)?";
    }
    
    public String tStringSingle() {
        return question + "\n\n" + "Press ENTER to continue";
    }
    
    public boolean askQuestion() {
        
        if (isViolent) {
            return fight(runner.player, new Enemy(), runner.player.getWeapon());
        }
        
        
        
        if (isSingle) {
            return singleQuestion();
        }
            
        
        Scanner UserIn = new Scanner(System.in);
        
        System.out.println(this.tString());
        String answer = UserIn.nextLine();
        
        boolean valid = answer.startsWith("a") || answer.startsWith("b");
        
        if (!valid) {
            if (answer.startsWith("help"))
                System.out.println(helpFunction());
            return askQuestion();
        }
        
        boolean ret = answer.startsWith("a");
        
        if (ret && changesWeapon)
            runner.player.setWeapon(newWeapon);
        
        return ret;
    }
    
    public boolean singleQuestion() {
        Scanner UserIn = new Scanner(System.in);
        
        System.out.println(this.tStringSingle());
        String answer = UserIn.nextLine();
        
        return true;
    }
    
    private String helpFunction() {
        String a = "\n\n";
        a += "I hear you need help with your journey, here are some tips that should help:\n";
        a += "\n";
        a += "Enter \"a\" to choose option a\n";
        a += "Enter \"b\" to choose option b\n";
        a += "Enter \"help\" to get options\n";
        a += "When prompted, you can enter a number to choose how you want to attack the enemy\n";
        
        return a;
    }
    
    public boolean fight(Player p, Enemy e, Weapons.Weapon w) {
        
        long waitTime = 1000;
        
        //Timer timer = new Timer();
        //imerTask task = null;
        
        while (p.getHealth()>0 && e.getHealth()>0) {
            // player attacks
            double healthChange = Attack(p, e);
            e.changeHealth(0-healthChange);
            if (healthChange == 0)
                System.out.println("The enemy dodged your attack!");
            else
                System.out.println("You attack the enemy with your " + Weapons.getString(w) + ", dealing " + Math.round(healthChange) + " damage, the enemy is now at " + Math.round(e.getHealth()) + "% health");
            // System.out.println("e health:" + e.getHealth());
            
            //timer.schedule(task, 10000, 10000);
            /*
            try {
                wait(10000);
            } catch (InterruptedException d) {
                d.printStackTrace();
            }
            */
            // enemy attacks
            healthChange = Attack(e, p);
            p.changeHealth(0-healthChange);
            if (healthChange == 0)
                System.out.println("You dodged the enemy's attack!");
            else 
                System.out.println("The enemy attacks you with " + Math.round(healthChange) + " damage, you are now at " + Math.round(p.getHealth()) + "% health");
            //System.out.println("p health:" + p.getHealth());
        
            Scanner UserIn = new Scanner(System.in);
            UserIn.nextLine();
        }
        
        boolean ret = p.getHealth() > 0;
        p.resetHealth();
        return ret;
    }
    
    private double Attack(Enemy a, Enemy b) {
        double attackPower = a.attack();
        boolean dodge = b.dodge();
        
        if (dodge)
            return 0;
        else
            return attackPower;
    }
    
    public enum Weapon {
        SWORD, 
        DIAMOND_SWORD, 
        BANNANA, 
        NO_WEAPON;
    }
}