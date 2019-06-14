
public class ArrayStack{

    int numberOfElements = 0;

    Node[] nodeArray;

    int defaultSize = 20;

          
    @SuppressWarnings({"unchecked", "deprecated"})
    public ArrayStack(int size) {

      nodeArray = new Node[size];   

    }

    //method to get length of array
    public int getLength(){

       return this.nodeArray.length;


    }//end getLength

    //method to put node on stack
    public void push(Node node){

      this.nodeArray[numberOfElements] = node;

      numberOfElements += 1;

    }//end push

    //method to pop node off of array
    public Node pop(){

      Node node = this.nodeArray[numberOfElements - 1];

      this.numberOfElements -= 1;

      return node;


    }//end pop

    //method to check if array is empty
    public boolean isEmpty(){

      //checks the numberOfElementsField
      if (this.numberOfElements <= 0){

        return true;

      }//end if

      //return false if 
      else {

        return false;

      }//end else


    }//end isEmpty


    //method to peek at top node
    public char peek(){

      Node node = this.nodeArray[numberOfElements - 1];
      
      return node.getValue();

    }//end peek
  


}// end ArrayStack
