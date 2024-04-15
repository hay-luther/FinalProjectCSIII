public class Pages {
    
    
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
    
    TNode<Page> root;
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
        p2 = new Page("A giant orge tells you to go right or left", "right", "left");
        p3 = new Page("A river appears", "swim across", "build a bridge across");
        p4 = new Page("You come across a broken-down hut", "go inside", "keep on walking");
        p5 = new Page("You are swimming across the river and eventually come across a mermaid. She offers to take you across in exchange for your sword", "keep swimming", "give her your sword");
        
        
        
        p10 = new Page("The mermaid is offended that you declined her offer and attacks you..", "", "");
        
        //after all pages are defined
        
        
        
        TNode root = new TNode(p2);
        root.setRightChild(new TNode(p3));
        root.setLeftChild(new TNode(p4));
        
        
        
        
    }
    
    
    
    
    
    
}