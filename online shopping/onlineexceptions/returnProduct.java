package onlineexceptions;
import onlineshopping.*;
import exceptions.*;
public class returnProduct extends onlineShopping{
    public void exceptions()
	    {
            try {
                throw new outOfStockException("I want to return my Product received");
            }
            catch(outOfStockException e) {
                System.out.println(e);
                    System.out.println("Sorry for your Inconvinience,Send us an email of problem faced by you ,we will resolve it and then you may return");
                }
            }	    			    		
        }