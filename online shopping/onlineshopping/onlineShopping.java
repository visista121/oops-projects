package onlineshopping;
import java.util.*;
import java.io.FileInputStream;
import cartoperations.*;
import onlineexceptions.cancelorder;
import onlineexceptions.expired;
import onlineexceptions.itemDamaged;
import onlineexceptions.returnProduct;
public class onlineShopping extends customer{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to \n1.sign in \n2.login");
            int s =sc.nextInt();
        switch(s){
            case 1:
        cart c = new cart();
       Thread t1;
        customer c1 = new customer();
        t1 = new Thread(new Runnable(){
            public void run(){                
                c.addToCart(c1.items());
                c.display();                
                System.out.println("Do you want to add or remove any items??\n1.yes\n2.no");
                int s = sc.nextInt();
                if(s==1){
                    System.out.println("press\n1.add\n2.remove");
                    int x = sc.nextInt();
                    switch(x){
                        case 1:
                        c.addToCart(c1.items());
                        break;
                        case 2:
                    c.removeFromCart();                    
                    break;                     
                }
            }else{
                System.out.println("VISIT AGAIN");
            }
            c.coupons(c.bill);
            int b=c.billPayment();
            c1.userCredentials(c.items(),b);
            c.specialGifts();
            }});
         t1.start();
         try{
             t1.join();
         }catch(Exception e){}
         break;
         case 2:System.out.println("enter your username and password");
         String username,password;
                 username =sc.next();
                 password = sc.next();
                try{
                 FileInputStream fin = new FileInputStream("client.txt");
                 String s1 = null;
                 int z=0;
                 while((z=fin.read())!=-1){
                     s1+=(char)z;
                 }
                 fin.close();
                     if(s1.contains(username) && s1.contains(password)){
                         System.out.println("logged in successfully");
                         cart cart1 = new cart();
       Thread t2;
        customer c2 = new customer();
        t2 = new Thread(new Runnable(){
            public void run(){   
                System.out.println("Do you have any 1.queries or 2.order an item");   
                int x = sc.nextInt();
                switch(x){
                    case 1:System.out.println("What is your query??\n1.Product expired\n2.Product damaged\n3.Cancel order\n4.Return product");
                    x = sc.nextInt();
                    switch(x){
                        case 1:expired e1 = new expired();
                        e1.exceptions();
                        break;
                        case 2:itemDamaged i1 = new itemDamaged();
                        i1.exceptions();
                        break;
                        case 4:returnProduct r1 = new returnProduct();
                        r1.exceptions();
                        break;
                        case 3:cancelorder ca1 = new cancelorder();
                        ca1.exceptions();
                        break;
                    }
                    break;
                    case 2:          
                cart1.addToCart(c2.items());
                cart1.display();                
                System.out.println("Do you want to add or remove any items??\n1.yes\n2.no");
                int s = sc.nextInt();
                if(s==1){
                    System.out.println("press\n1.add\n2.remove");
                    int x1 = sc.nextInt();
                    switch(x1){
                        case 1:
                        cart1.addToCart(c2.items());
                        break;
                        case 2:
                    cart1.removeFromCart();                    
                    break;                     
                }
            }else{
                System.out.println("VISIT AGAIN");
            }
            cart1.coupons(cart1.bill);
            int b=cart1.billPayment();
            c2.userCredentials(cart1.items(),b);
            cart1.specialGifts();
            break;
         } }});
         t2.start();
         try{
             t2.join();
         }catch(Exception e){}
                     }else{
                         System.out.println("\naccount not found!!! create a new one or try again");
                     }  }
                     catch(Exception e){System.out.println(e);}
}}}
