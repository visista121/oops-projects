package exceptions;

public class cancelException extends Exception{
    public String exceptionDescription;
    public cancelException(String description){
        super(description);
        exceptionDescription = description;
    }
    public String toString(){
        return exceptionDescription;
    }
}
