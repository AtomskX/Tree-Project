
public abstract class Node {
    
    //create left and righ child nodes
    private Node leftChild, rightChild, parent;
    
    //create a variable for the data in the node
    private char data;
    
    //constructor method for the node
    public Node(char value){
        
        this.data = value;
        
    }// end Node constructor
    
    //method to get node value
    public char getValue(){
        
        return this.data;
        
    }//end getValue method
    
    //method for setting left child   
    public void setLeft(Node node){
                
        this.leftChild = node;
        
    }//end setLeft
    
    //method for setting right child
    public void setRight(Node node){
        
        this.rightChild = node;
        
    }//end setRight
  
    //method to get right node
    public Node getRight(){

      return this.rightChild;

    }//end getRight

    //method to get left node
    public Node getLeft(){

      return this.leftChild;

    }//end getRight
        
}//end Node class
