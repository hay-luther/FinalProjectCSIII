public class Weapons {

    public enum Weapon {
        SWORD, 
        DIAMOND_SWORD, 
        BANANA, 
        NO_WEAPON;
    }
    
    public static int getValue(Weapon w) {
        switch (w) {
            case SWORD:
                return 10;
            case DIAMOND_SWORD:
                return 25;
            case BANANA:
                return 10000;
            case NO_WEAPON:
                return 5;
        }
        
        return 10;
    }
    
    public static String getString(Weapon w) {
        switch (w) {
            case SWORD:
                return "sword";
            case DIAMOND_SWORD:
                return "diamond sword";
            case BANANA:
                return "banana";
            case NO_WEAPON:
                return "bare fists";
        }
        return "*UNKNOWN ITEM*";
    }
}

