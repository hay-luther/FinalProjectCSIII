import java.util.List;
import java.util.ArrayList;

public class ListBinaryTree <E>
{
    protected List<E> list;
    
    public ListBinaryTree() 
    {
        list = new ArrayList<E>();
    }
    
    //add data to this Complete Binary Tree
    public void add(E data)
    {
        list.add(data);
    }
    
    //Add all the elements from the provided list to this Complete Binary Tree
    public void addAll(List<E> data)
    {
        for (E i : data)
            add(i);
    }
    
    //Return the size of this tree
    public int size()
    {
        return list.size();
    }
    
    public String preorder()
    {
        return "[" + preorderHelper(0, "") + "]";
    }
    
    private String preorderHelper(int index, String ret)
    {
        if (index >= this.size())
            return ret;
            
        ret += (ret.length()==0) ? this.getValueAt(index) : ", " + this.getValueAt(index);
            
        ret = preorderHelper(getLeftIndex(index), ret);
        ret = preorderHelper(getRightIndex(index), ret);
        
        return ret;
    }
    
    public String inorder()
    {
        return "[" + inorderHelper(0, "") + "]";
    }
    
    private String inorderHelper(int index, String ret)
    {
        if (index >= this.size())
            return ret;
   
        ret = inorderHelper(getLeftIndex(index), ret);
        
        ret += (ret.length()==0) ? this.getValueAt(index) : ", " + this.getValueAt(index);
        
        ret = inorderHelper(getRightIndex(index), ret);
        
        return ret;
    }
    
    public String postorder()
    {
        return "[" + postorderHelper(0, "") + "]";
    }
    
    private String postorderHelper(int index, String ret)
    {
        if (index >= this.size())
            return ret;
   
        ret = postorderHelper(getLeftIndex(index), ret);
        
        ret = postorderHelper(getRightIndex(index), ret);
        
        ret += (ret.length()==0) ? this.getValueAt(index) : ", " + this.getValueAt(index);
        
        return ret;
    }
    
    //return the value stored at the specified index
    //or null if the index is out of bounds
    public E getValueAt(int index)
    {
        if (index < 0 || index > list.size()-1)
            return null;
        return list.get(index);
    }
    
    //return the index of the parent of the node located at the specified index
    //if index is out of bounds, return -1
    //if the node at the specified index does not have a parent, return -1
    public int getParentIndex(int index)
    {
        if (index <= 0 || index > list.size()-1)
            return -1;
        return ((index - 1) / 2);
    }
    
    //return the index of the left child of the node at the specified index
    //if there is no left child, return -1
    public int getLeftIndex(int parentIndex)
    {
        if (parentIndex < 0 || parentIndex > list.size()-1)
            return -1;
        return (parentIndex * 2) + 1;
    }
    
    //return the index of the right child of the node at the specified index
    //if there is no right child, return -1
    public int getRightIndex(int parentIndex)
    {
        if (parentIndex < 0 || parentIndex > list.size()-1)
            return -1;
        return (parentIndex * 2) + 2;
    }
    
    //a useful utility function to swap two nodes in the tree
    //swap the values located at indexA and indexB
    public void swap(int indexA, int indexB)
    {
        E temp = this.getValueAt(indexA);
        
        list.set(indexA, this.getValueAt(indexB));
        
        list.set(indexB, temp);
    }
}