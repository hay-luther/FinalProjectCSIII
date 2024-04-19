import java.util.Scanner;

public class Page {
    
    String question;
    String optionA;
    String optionB;
    boolean isViolent;
    
    
    
    public Page(String q, String opta, String optb, boolean iv) {
        question = q;
        optionA = opta;
        optionB = optb;
        isViolent = iv;
    }
    
    public String tString() {
        return question + "\n\n" + "Would you like to " + optionA + "(a) or " + optionB + "(b)?";
    }
    
    public boolean askQuestion() {
        
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
        
        while (p.getHealth()>0 && e.getHealth()>0) {
            // player attacks
            e.changeHealth(0-Attack(p, e));
            System.out.println("e health:" + e.getHealth());
        
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