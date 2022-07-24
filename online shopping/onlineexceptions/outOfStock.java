package onlineexceptions;
import onlineshopping.*;
import exceptions.*;
public class outOfStock extends onlineShopping{
    public void exceptions()
	    {
            try {
                throw new outOfStockException("Your desired product is out of stock at present");
            }
            catch(outOfStockException e) {
                System.out.println(e);
                    System.out.println("Sorry for your Inconvinience, We will update the stock within 2-3 weeks. Stay tuned");
                }
            }	    			    		
        }