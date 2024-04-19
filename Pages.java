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
        pp17 = new TNode<Page>(p17);
        pp18 = new TNode<Page>(p18);
        pp19 = new TNode<Page>(p19);
        pp20 = new TNode<Page>(p20);
        pp21 = new TNode<Page>(p21);
        pp22 = new TNode<Page>(p22);
        
        root = new TNode<Page>(p2);
        root.setLeftChild(pp3);
        root.setRightChild(pp4);
        
        
        
        
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