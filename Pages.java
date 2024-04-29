
public class Pages {
    
    
    Page p1;
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
    
    TNode<Page> root;
    TNode<Page> pp1;
    TNode<Page> pp3;
    TNode<Page> pp4;
    TNode<Page> pp5;
    TNode<Page> pp6;
    TNode<Page> pp7;
    TNode<Page> pp8;
    TNode<Page> pp9;
    TNode<Page> pp10;
    TNode<Page> pp11;
    TNode<Page> pp12;
    TNode<Page> pp13;
    TNode<Page> pp14;
    TNode<Page> pp15;
    TNode<Page> pp16;
    TNode<Page> pp17;
    TNode<Page> pp18;
    TNode<Page> pp19;
    TNode<Page> pp20;
    TNode<Page> pp21;
    TNode<Page> pp22;
    
    
    
    public Pages() {
        p1 = new Page("You chose to play again!");
        p2 = new Page("A giant orge tells you to go right or left", "right", "left");
        p3 = new Page("A river appears", "swim across", "build a bridge across");
        p4 = new Page("You come across a broken-down hut", "go inside", "keep on walking");
        p5 = new Page("You are swimming across the river and eventually come across a mermaid. She offers to take you across in exchange for your sword", "give her your sword", "keep swimming", Weapons.Weapon.NO_WEAPON);
        p6 = new Page("You come across a diamond sword in the ground while looking for materials to build your bridge", "take it", "leave it", Weapons.Weapon.DIAMOND_SWORD);
        p7 = new Page("You walk around the hut until you see a banana to take it you need to leave your sword","take it","leave it", Weapons.Weapon.BANANA);
        p8 = new Page("You walk past the hut and suddenly Donkey Kong appears", "fight him", "run away", true);
        p9 = new Page("You give up your sword and she takes you across and Bowser appears in front of you with no escape you must fight", "WIN FIGHT", "LOSE FIGHT", true);
        p10 = new Page("The mermaid is offended that you declined her offer and attacks you..", "WIN FIGHT", "LOSE FIGHT", true);
        p11 = new Page("You take the sword and suddenly a giant worm comes from underground, you have choice but to fight it", "WIN FIGHT", "LOSE FIGHT", true);
        p12 = new Page("You leave the sword and continue building the bridge until you finish and walk across");
        p13 = new Page("You take the banana and leave you sword behind walking out of the hut until you come across Donkey Kong");
        p14 = new Page("You leave the banana and walk out the hut until you come across Donkey Kong", "fight it", "run away");
        p15 = new Page("You defeated the Donkey Kong and continue on your adventure until you come across a temple with no way around you go in and find the princess");
        p16 = new Page("You run away from Donkey Kong all the way back to the hut and you go in");
        //p17 = new Page("You lose the battle and run away from the worm and it eats your diamond sword. You run all the way back to the river for safety", Weapons.Weapon.NO_WEAPON);
        p18 = new Page("You defeat Bowser and go into his castle to find the princess", "WIN FIGHT", "LOSE FIGHT", true);
        p19 = new Page("You defeat the worm with your new sword and finish building the bridge once you get to the other side Boswer appears, after seeing your diamond sword Boswer runs away in fear and you walk in the castle and you save the princess");
        p20 = new Page("Donkey Kong sees the banana you have and wants trades you the princess for the banana", "accept", "decline");
        //new p17
        p17 = new Page("Donkey Kong is offended that you don't give him the banana, and attacks you", "WIN FIGHT", "LOSE FIGHT", true);
        
        p21 = new Page("You have won good job!", "Main Menu", "Quit");
        p22 = new Page("You have lost :(", "Main Menu", "Quit");
        
        //after all pages are defined
        pp1 = new TNode<Page>(p1);
        pp3 = new TNode<Page>(p3);
        pp4 = new TNode<Page>(p4);
        pp5 = new TNode<Page>(p5);
        pp6 = new TNode<Page>(p6);
        pp7 = new TNode<Page>(p7);
        pp8 = new TNode<Page>(p8);
        pp9 = new TNode<Page>(p9);
        pp10 = new TNode<Page>(p10);
        pp11 = new TNode<Page>(p11);
        pp12 = new TNode<Page>(p12);
        pp13 = new TNode<Page>(p13);
        pp14 = new TNode<Page>(p14);
        pp15 = new TNode<Page>(p15);
        pp16 = new TNode<Page>(p16);
        //pp17 = new TNode<Page>(p17);
        pp18 = new TNode<Page>(p18);
        pp19 = new TNode<Page>(p19);
        pp20 = new TNode<Page>(p20);
        pp21 = new TNode<Page>(p21);
        pp22 = new TNode<Page>(p22);
        
        root = new TNode<Page>(p2);
        root.setLeftChild(pp3);
        root.setRightChild(pp4);
        
        pp3.setLeftChild(pp5);
        pp3.setRightChild(pp6);
        
        pp4.setLeftChild(pp7);
        pp4.setRightChild(pp8);
        
        //swapped so that enums work
        pp5.setRightChild(pp9);
        pp5.setLeftChild(pp10);
        
        pp6.setLeftChild(pp11);
        pp6.setRightChild(pp12);
        
        //
        pp7.setLeftChild(pp13);
        pp7.setRightChild(pp14);
        
        pp8.setLeftChild(pp15);
        pp8.setRightChild(pp16);
        
        // single choice
        pp9.setLeftChild(pp18);
        pp9.setRightChild(pp22);
        
        // single choice
        pp10.setLeftChild(pp18);
        pp10.setRightChild(pp22);
        
        pp11.setLeftChild(pp19);
        pp11.setRightChild(pp22);
        
        // single choice
        pp12.setLeftChild(pp18);
        
        // single choice
        pp13.setLeftChild(pp20);
        
        pp14.setLeftChild(pp15);
        pp14.setRightChild(pp16);
        
        // single choice
        pp15.setLeftChild(pp21);
        
        // single choice
        pp16.setLeftChild(pp7);

        // single choice
        //pp17.setLeftChild(pp6);
        
        // single choice
        pp18.setLeftChild(pp21);
        pp18.setRightChild(pp22);
        
        // single choice
        pp19.setLeftChild(pp21);
        
        pp20.setLeftChild(pp21);
        pp20.setRightChild(pp15);
        
        // win screen
        pp21.setLeftChild(pp1);
        
        // lose screen
        pp22.setLeftChild(pp1);
        
        pp1.setLeftChild(root);
        
        
        
        
        System.out.println(pp3.getData().tString());

    }
    
    public TNode<Page> getRoot() {
        return root;
    }
    
    public void runPages(TNode<Page> r) {
        runner.clearScreen();
        if (r.getData().askQuestion()) {
            if (r.getRightChild() != null)
                runPages(r.getRightChild());
            else
                return;
        } else {
            if (r.getLeftChild() != null)
                runPages(r.getLeftChild());
            else 
                return;
        }
    }
    
    
    
}
