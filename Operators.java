

//abstract class for operators
public abstract class Operators {
    
    //method for performing evaluations
    abstract public int evaluate(char x , char y);
    
}


//class for addtion
class Addition extends Operators {
    
    public int evaluate(char x, char y) {
        
        return Character.getNumericValue(x) + Character.getNumericValue(y);
        
    }//end evaluate
    
    //to string method for the operator
    
    public String toString() {
        
        return "+";
        
    }// end tostring
    
}//end Addition

class Subtraction extends Operators {
    
    public int evaluate(char x, char y) {
        
        return Character.getNumericValue(x) - Character.getNumericValue(y);
        
    }//end evaluate
    
    //to string method for the operator
    
    public String toString() {
        
        return "+";
        
    }// end tostring
    
}//end Addition

class Multiplication extends Operators {
    
    public int evaluate(char x, char y) {
        
        return Character.getNumericValue(x) * Character.getNumericValue(y);
        
    }//end evaluate
    
    //to string method for the operator
    
    public String toString() {
        
        return "+";
        
    }// end tostring
    
}//end Addition

class Division extends Operators {
    
    public int evaluate(char x, char y) {
        
        return Character.getNumericValue(x) / Character.getNumericValue(y);
        
    }//end evaluate
    
    //to string method for the operator
    
    public String toString() {
        
        return "+";
        
    }// end tostring
    
}//end Addition

