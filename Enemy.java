import java.lang.Math;

public class Enemy {
    
    double health;
    double power;
    double reaction;

    public Enemy () {
        health = 100;
        power = 20;
        reaction = 10;
    }
    
    public Enemy(double h, double p, double r) {
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
    
    public double getHealth() {
        return health;
    }
    
    public void changeHealth(double num) {
        health += num;
    }
}