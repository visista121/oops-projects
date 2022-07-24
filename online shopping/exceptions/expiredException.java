package exceptions;

public class expiredException extends Exception{
    public String exceptionDescription;
    public expiredException(String description){
        super(description);
        exceptionDescription = description;
    }
    public String toString(){
        return exceptionDescription;
    }
}
