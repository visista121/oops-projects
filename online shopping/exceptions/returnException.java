package exceptions;

public class returnException extends Exception {
    public String exceptionDescription;
    public returnException(String description){
        super(description);
        exceptionDescription = description;
    }
    public String toString(){
        return exceptionDescription;
    }
}
   
