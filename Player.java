import java.lang.Math;

public class Player extends Enemy{
    
    double health;
    double power;
    double reaction;

    public Player () {
        health = 100;
        power = 20;
        reaction = 10;
    }
    
    public Player(double h, double p, double r) {
        health = h;
        power = p; 
        reaction = r;
    }
    
    public double attack() {
        double attackPower = 0;
        
        attackPower = Math.random()*power;
        
        return attackPower;
    }
    
    public boolean dodge() { 
        return Math.random() < (1/reaction);
    }
    
    public void setPower(int num) {
        power = num;
    }
    
    public void setReaction(int num) {
        reaction = num;
    }
}