
public class Evaluation {
    
    //create the new stack for the nodes
    private static ArrayStack operators;
    
    private static ArrayStack operands;
    
    //counter variable
    static int counter = 0;
    
    
    //main method
    public static void Evaluation(char values[]){
        
        operators  = new ArrayStack(values.length);
        
        operands = new ArrayStack(values.length);        
        
        while (counter < values.length){
            
            if (Character.isDigit(values[counter])){
                
                OperandNode node = new OperandNode(values[counter]);
                
                //push values onto stack
                operands.push(node);

                //System.out.println(node.getValue());                
               
            }// end if
            
            else if ((String.valueOf(values[counter]).equals("+")) || (String.valueOf(values[counter]).equals("-")) || (String.valueOf(values[counter]).equals("*")) || (String.valueOf(values[counter]).equals("/"))){
                
                //create a new operator node
                OperatorNode currentOperator = new OperatorNode(values[counter]);
                
                currentOperator.setRight(operands.pop());

                currentOperator.setLeft(operands.pop());

                //push operator onto operator stack
                operators.push(currentOperator);
                
                Node operatorTest = operators.pop().getLeft();

                System.out.println(operatorTest.getValue());
                
            }//end else if
            
            counter++;            
            
        }//end while loop 
        
        
    }//end evaluation method
    
    
    
    
}//end Evaluation class
