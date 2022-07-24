package onlineexceptions;
import onlineshopping.*;
import exceptions.*;
public class cancelorder extends onlineShopping{
    public void exceptions()
	    {
            try {
                throw new outOfStockException("I want to cancel my order");
            }
            catch(outOfStockException e) {
                System.out.println(e);
                    System.out.println("Send order code to our mail. thank you. visit again");
                }
            }	    			    		
        }