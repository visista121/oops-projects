package cartoperations;
import java.util.ArrayList;
import java.util.*;

interface offersAndDeals{
    abstract void specialGifts();
}
public class cart implements offersAndDeals{
List<String> items = Arrays.asList("kurthi","westernwear","denims","ethnic wear","nightwear","denims","formals","casuals","nightwear","regulars","ethnic","nightwear","cleansers","masks","tablets","dettol","insulin","veggies","cereals","edible oil","lyzol","surf","shampoo","deodrant","sandals","wedges","sneakers","heels","slippers","boat shoes","slippers","loafers","espadrilles","serum","matte","face wash","sunscreen","face mask","laptop","refrigerator","phone","ac");
List<Integer> rates = Arrays.asList(750,800,2000,5000,600,1500,1000,800,500,600,1000,400,250,300,100,100,350,200,150,150,140,300,325,325,2500,2800,200,200,600,1500,600,1000,1000,300,850,250,200,120,60000,80000,42000,40000);
ArrayList<String> itemList = new ArrayList<String>();
List<Integer> offers = Arrays.asList(2,5,15,19,21,25,32,34,36,39,41);
    public int bill = 0;
    Scanner sc = new Scanner(System.in);

    public void addToCart(ArrayList orderID){
       for(int i=0;i < orderID.size();i++){
        int x= (int)orderID.get(i) - 1;
        if(offers.contains(x)){
            this.bill += rates.get(x)*0.8;
        }else{
            this.bill +=rates.get(x);
        }
        itemList.add(items.get(x));        
    }}
    public void coupons(int b){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("do you have a coupon??\n1.yes\n2.no");
        int x=sc1.nextInt();
        switch(x){
            case 1:System.out.println("Enter your coupon value");
            int discount = sc1.nextInt();
            this.bill -=discount;
            break;
            case 2:System.out.println("Pay Rs.1500/- to get one. Monthly 20/- will credited to your coupon. Happy Shopping!!");
            break;             
        }
    }
    public List items(){
        return itemList;
    }
    public void removeFromCart(){
        System.out.println("Enter id of item to be removed from cart");
        int x= sc.nextInt()-1;
        itemList.remove(items.get(x));
        this.bill -= rates.get(x);
        System.out.println("\nYour current bill amount is: "+bill);
    }
    public void display(){
        System.out.println("\n\nItems in the cart are:");
        for(String i:itemList){
            System.out.println((i));
        }
        System.out.println("Your bill is "+bill+"\n\n");
    }
    public int billPayment(){
        System.out.println("\nYour total bill amount is: "+bill);
        System.out.println("Choose your mode of payment\n1.pay on delivery\n2.debit card\n3.Google Pay");
        int x= sc.nextInt();
        switch(x){
            case 1: System.out.println("You chose Cash On Delivery(COD). VISIT AGAIN :)");
            break;
            case 2:System.out.println("Input your card credentials here");
            break;
            case 3:System.out.println("Google Pay your amount to 9347687154. VISIT AGAIN :)");
            break;
        }return bill;
    }
    public void specialGifts(){
        if(bill > 15000){
        System.out.println("Since your bill crossed 15,000/-, your special gift is ---'ASUS LAPTOP i3 8th gen'");
        System.out.println("collect it during delivery. WITHOUT FAIL. VISIT AGAIN!!!");}
        else if(bill>6500){
        System.out.println("Since your bill crossed 6,500/-, your special gift is ---'WASHING MACHINE'");
        System.out.println("collect it during delivery. WITHOUT FAIL. VISIT AGAIN!!!");}
        else if(bill > 5000){
        System.out.println("Since your bill crossed 5000/-, your special gift is ---'MICROWAVE OVEN'");
        System.out.println("collect it during delivery. WITHOUT FAIL. VISIT AGAIN!!!");}        
        else if(bill > 4000){
        System.out.println("Since your bill crossed 4000/-, your special gift is ---'PRESSURE COOKER'");
        System.out.println("collect it during delivery. WITHOUT FAIL. VISIT AGAIN!!!");}
    }
    public int bill(){
        return bill;
    }
}
