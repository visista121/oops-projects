package onlineexceptions;
import java.util.Scanner;
import onlineshopping.onlineShopping;
import exceptions.*;

public class expired extends onlineShopping{
	
	    public void exceptions()
	    {
	    	System.out.println("Did you recieve an \n1.expired good\n2.item with no expiry date");
	    	Scanner sc= new Scanner(System.in);
			int exc = sc.nextInt();
		 	switch(exc)
	    	{
	    	case 1 : 
	    			try {
		    			throw new expiredException("Product delivered is expired");
		    		}
		    		catch(expiredException e) {
		    			String response = e.toString();
		    			System.out.println(e);
		    			if("Product delivered is expired ".equals(response)) {
		    				System.out.println("Sorry for our Negligence, We will send you a new product along with 45% cashback");
		    			}
		    		}	    			    		
	    		break;
	    	case 2 :
	    		try {
	    	    	   throw new expiredException("Product delivered has no expiry date over it");
	    	       }
	    	       catch(expiredException e) {
	    	    	   String response = e.toString();
		    			System.out.println(e);
		    			if("Product delivered has no expiry date over it".equals(response)) 
		    			System.out.println("Sorry for our Negligence, We will send you the expiry date of the product, please send us the item code");	    	       
	    		break;	    	
	    	}}}}