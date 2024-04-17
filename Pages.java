public class Pages extends ListBinaryTree {
    
    
    //Page p1;
    Page p2;
    Page p3;
    Page p4;
    Page p5;
    Page p6;
    Page p7;
    Page p8;
    Page p9;
    Page p10;
    Page p11;
    Page p12;
    Page p13;
    Page p14;
    Page p15;
    Page p16;
    Page p17;
    Page p18;
    Page p19;
    Page p20;
    Page p21;
    Page p22;
    
    public Pages() {
        p2 = new Page("A giant orge tells you to go right or left", "right", "left");
        p3 = new Page("A river appears", "swim across", "build a bridge across");
        p4 = new Page("You come across a broken-down hut", "go inside", "keep on walking");
        p5 = new Page("You are swimming across the river and eventually come across a mermaid. She offers to take you across in exchange for your sword", "keep swimming", "give her your sword");
        p6 = new Page("You come across a diamond sword in the ground", "take it", "leave it");
        p7 = new Page("You walk around the hut until you see a banana to take it you need to leave your sword","take it","leave it");
        p8 = new Page("You walk past the hut and suddenly Donkey Kong appears", "fight him", "run away");
        p9 = new Page("You give up your sword and she takes you across and Bowser appears in front of you with no escape you must fight", "WIN FIGHT", "LOSE FIGHT");
        p10 = new Page("The mermaid is offended that you declined her offer and attacks you..", "WIN FIGHT", "LOSE FIGHT");
        p11 = new Page("You take the sword and suddenly a giant worm comes from underground", "fight it", "run away");
        p12 = new Page("You leave the sword and continue building the bridge until you finish and walk across", "", "");
        p13 = new Page("You take the banana and leave you sword behind walking out of the hut until you come across Donkey Kong", "", "");
        p14 = new Page("You leave the banana and walk out the hut until you come across Donkey Kong", "fight it", "run away");
        p15 = new Page("You defeated the Donkey Kong and continue on your adventure until you come across a temple with no way around you go in and find the princess", "END SCREEN", "");
        p16 = new Page("You run away from Donkey Kong all the way back to the hut and you go in", "", "");
        p17 = new Page("You run away from the worm and it eats your diamond sword. You run all the way back to the river for safety", "", "");
        p18 = new Page("You defeat Bowser and go into his castle to find the princess", "WIN FIGHT", "LOSE FIGHT");
        p19 = new Page("You defeat the worm with your new sword and finish building the bridge once you get to the other side Boswer appears, after seeing your diamond sword Boswer runs away in fear and you walk in the castle and you save the princess", "", "");
        p20 = new Page("Donkey Kong sees the banana you have and wants trades you the princess for the banana", "accept", "decline");
        p21 = new Page("You have won good job!", "Main Menu", "Quit");
        p22 = new Page("You have lost :(", "Main Menu", "Quit");
    }
}
