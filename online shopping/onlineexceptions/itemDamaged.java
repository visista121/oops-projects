package onlineexceptions;
import java.util.*;
import onlineshopping.*;
import exceptions.*;
public class itemDamaged extends onlineShopping{
    public void exceptions()
	    {
    System.out.println("Did you recieve an \n1.Product delivered is damaged\n2.Product delivered is not what I have ordered");
    Scanner sc= new Scanner(System.in);
    int exc = sc.nextInt();
     switch(exc)
    {
    case 1 : 
            try {
                throw new itemDamagedException("Product delivered is damaged");
            }
            catch(itemDamagedException e) {
                String response = e.toString();
                System.out.println(e);
                if("Product delivered is damaged".equals(response)) {
                    System.out.println("Sorry for our Negligence, We will send you a new product along with 30% cashback");
                }
            }	    			    		
        break;
    case 2 :
        try {
               throw new itemDamagedException("Product delivered is not what I have ordered");
           }
           catch(itemDamagedException e) {
               System.out.println(e);
               String response = e.toString();
                System.out.println(e);
                if("Product delivered is not what I have ordered".equals(response)) 
            System.out.println("Sorry for our Negligence, We will send your desired product within 5-6 business days, return the product you received");	    	       
        break;	
           }}}
}
