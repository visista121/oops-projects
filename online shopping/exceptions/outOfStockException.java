package exceptions;

public class outOfStockException extends Exception{
    public String exceptionDescription;
    public outOfStockException(String description){
        super(description);
        exceptionDescription = description;
    }
    public String toString(){
        return exceptionDescription;
    }
}