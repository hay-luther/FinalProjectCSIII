import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Page {
    
    String question;
    String optionA;
    String optionB;
    boolean isViolent;
    boolean isSingle;
    
    
    
    public Page(String q, String opta, String optb, boolean iv, boolean is) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = iv;
        isSingle = is;
    }
    
    public Page(String q, String opta, String optb, boolean iv) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = iv;
        isSingle = false;
    }
    
    public Page(String q, String opta, String optb) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = false;
        isSingle = false;
    }
    
    public Page(String q) {
        question = q;
        optionA = "";
        optionB = "";
        isViolent = false;
        isSingle = true;
    }
    
    public String tString() {
        return question + "\n\n" + "Would you like to " + optionA + "(a) or " + optionB + "(b)?";
    }
    
    public String tStringSingle() {
        return question + "\n\n" + "Press ENTER to continue";
    }
    
    public boolean askQuestion() {
        
        if (isViolent) {
            return fight(runner.player, new Enemy());
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
    
    public boolean fight(Player p, Enemy e) {
        
        long waitTime = 1000;
        
        while (p.getHealth()>0 && e.getHealth()>0) {
            // player attacks
            double healthChange = Attack(p, e);
            e.changeHealth(0-healthChange);
            System.out.println("e health:" + e.getHealth());
            /*
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException) {
                System.out.println("wait");
            }
            */
        
            // enemy attacks
            p.changeHealth(0-Attack(e, p));
            System.out.println("p health:" + p.getHealth());
        
        }
        
        return p.getHealth() > 0;
    }
    
    private double Attack(Enemy a, Enemy b) {
        double attackPower = a.attack();
        boolean dodge = b.dodge();
        
        if (dodge)
            return 0;
        else
            return attackPower;
    }
}