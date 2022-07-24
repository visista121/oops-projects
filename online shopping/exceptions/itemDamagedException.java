package exceptions;

public class itemDamagedException extends Exception{
    public String exceptionDescription;
    public itemDamagedException(String description){
        super(description);
        exceptionDescription = description;
    }
    public String toString(){
        return exceptionDescription;
    }
    
}
