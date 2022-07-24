package onlineshopping;                         
import java.util.*;
import onlineexceptions.outOfStock;

import java.io.FileOutputStream;
public class customer {
    public String name,loginID,password;
    public long phonenumber;
    public void userCredentials(List itemList,int bill){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter your name, phone number, loginID and password");
        name = sc1.nextLine();
        phonenumber = sc1.nextLong();
        loginID = sc1.next();
        password = sc1.next();
        saveData(itemList,bill);
    }
    public void saveData(List itemList,int bill){
        try{
        FileOutputStream f1 = new FileOutputStream("client.txt");
        String entry = "name: "+name +" \nuserID: "+ loginID+" \npassword: " + password+" \nphone number: "+ phonenumber + " \ncart items: "+itemList+" \nBill amount: "+bill;
        f1.write(entry.getBytes());
        f1.close();
        System.out.println("Your info is stored successfully");
    }catch(Exception e){}
    }
        public ArrayList items(){
            outOfStock o1 = new outOfStock();
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> list1 = new ArrayList<Integer>();
            int category,x,n=0;
            while(n != -1){
            System.out.println("Choose the category\n1.fashion\n2.medical\n3.pantry\n4.footwear\n5.beauty and skin\n6.electrical appliances\n");
            category = sc.nextInt();
            switch(category){
            case 1:System.out.println("choose \n1.women\n2.men\n3.children");
            x = sc.nextInt();
            switch(x){
                case 1:System.out.println("Today's deal: We have 20% off on denims");
                    System.out.println("choose your items\n1.kurthi  -  750/-\n2.western tops - 800/-\n3.denims - 2000/-\n4.ethnic wear - 5000/-\n5.nightwear - 600/-\n");
                    x = sc.nextInt();                        
                    list1.add(x);
                    break;
                    case 2:System.out.println("Today's deal: We have 20% off on denims");
                    System.out.println("choose your items\n6.denims - 1500/-\n7.formals - 1000/-\n8.casuals - 800/-\n9.nightwear - 500/-");
                    x = sc.nextInt();
                    list1.add(x);
                    break;
                    case 3:System.out.println("choose your items\n10.regular wear - 600/-\n11.traditional - 1000/-\n12.nightwear - 400/-");
                    x = sc.nextInt();
                    list1.add(x);
                    break;
                    }                    
                    break;
            case 2:System.out.println("Today's deal: We have 20% off on tablets from Apollo Pharmacy");
            System.out.println("choose items\n13.sanitizer and disinfectant spray- 250/-\n14.masks and gloves - 300/-\n15.tablets - 100/-\n16.dettol and bandages -100/-\n17.insulin - 350/-\n");
            x = sc.nextInt();
            if(x==16)
            o1.exceptions();
            else
            list1.add(x);
            break;
            case 3:System.out.println("Today's deal: We have 20% off on Edible oil and surf excel");
            System.out.println("choose your items\n18.vegetables - 200/-\n19.cereals - 150/-\n20.edible oil - 150/-\n21.lyzol - 140/-\n22.surf excel - 300/-\n23.tresemme shampoo - 325/-\n24.deodrant - 325/-");
            x = sc.nextInt();
            if(x==18 || x==23)
            o1.exceptions();
            else
            list1.add(x);           
            break;
            case 4:System.out.println("choose \n1.women\n2.men\n");
            x = sc.nextInt();
            switch(x){
                case 1:System.out.println("Today's deal: We have 20% off on Wedges");
                System.out.println("choose your items\n25.sandals  - 2500/-\n26.wedges - 2800/-\n27.sneakers - 2000/-\n28.heels - 2000/-\n29.slippers - 600/-\n");
                x = sc.nextInt();
                if(x==25)
                o1.exceptions();
                else
                list1.add(x);
                break;
                case 2:System.out.println("Today's deal: We have 20% off on Espadrilles. New in stock, try them!!!");
                System.out.println("choose your items\n30.Boat shoes - 1500/-\n31.slippers - 600/-\n32.loafers - 1800/-\n33.Espadrilles - 1000/-");
                x = sc.nextInt();
                if(x==31)
                o1.exceptions();
                else
                list1.add(x);
                break;}                        
            break;
            case 5:System.out.println("Today's deal: We have 20% off on Matte products and sunscreen");
            System.out.println("choose your fashion\n34.serum - 300/-\n35.matte products - 850/-\n36.face wash - 250/-\n37.sunscreen - 200/-\n38.face mask - 120/-\n");
            x = sc.nextInt();
            if(x==36 || x==38)
                o1.exceptions();
                else
            list1.add(x);
            break;
            case 6:System.out.println("Today's deal: We have 20% off on Refrigerators and Air conditioners. Happy Summers  :)");
            System.out.println("choose items\n39.laptop - 60000/-\n40.refrigerator - 80000/-\n41.1+ phone - 42000/-\n42.AC - 40000/-\n");
            x = sc.nextInt();
            if(x==41)
            o1.exceptions();
            else
            list1.add(x);
            break;               
        }        
        System.out.println("To continue shopping press 0 else press -1");
        n = sc.nextInt();
    }return list1;
}}
