import java.util.*;
import java.io.*;

public class Drinkery {


   public static void part5(){
      Scanner sc = new Scanner(System.in);
      while(true)
      {
         System.out.print("\nwhat word? (-1 to exit) ");
         String s = sc.next();
         if (s.equals("-1"))
            System.exit(0);
      }
   }

   public static void main (String [] args) {
      int kind = 0;
      int sizee = 0;
      int foam = 0;
      int shots = 0;
      String milkk = " ";
      String syrupp = " ";
      String adds = " ";
      String drinkks = " ";
   
   
      Drink drinkyy = new Drink();
   
      Scanner sizy = new Scanner(System.in);
      while(true)
      {
         System.out.println("\nWould you like a 'Frape' or 'Iced drink', or 'Hot drink'");
         String sy = sizy.next();
         if(sy.equals("Frape"))
            kind = 1;
         if(sy.equals("Iced drink"))
            kind = 2;
         if(sy.equals("Hot drink"))
            kind = 3;
      
      
         Scanner siz = new Scanner(System.in);
         while(true) {
            System.out.println("\nWould you like a 'Tall' or 'Grande', or 'Venti'");
            String sizz = siz.next();
            if(sizz.equals("Tall"))
               sizee = 1;
            if(sizz.equals("Grande"))
               sizee = 2;
            if(sizz.equals("Venti"))
               sizee = 3;
         
         
            Scanner f = new Scanner(System.in);
            while(true) {
               System.out.print("\nWould you like, 'No ice/foam', 'Normal ice/foam', or 'Extra ice/foam;");
               String ff = f.next();
               if(ff.equals("light ice/foam"))
                  foam = 1;
               if(ff.equals("Normal ice/foam"))
                  foam = 2;
               if(ff.equals("Extra ice/foam"))
                  foam = 3;
            
            
               Scanner shot = new Scanner(System.in);
               while(true){
                  System.out.println("\n How many would should you like? A max of 6");
                  String st = shot.next();
                  if(st.equals("1"))
                     shots = 1;
                  if(st.equals("2"))
                     shots = 2;
                  if(st.equals("3"))
                     shots = 3;
                  if(st.equals("4"))
                     shots = 4;
                  if(st.equals("5"))
                     shots = 5;
                  if(st.equals("6"))
                     shots = 6;
               
               
               
               
                  Scanner milly = new Scanner(System.in);
                  while(true){
                  
                     System.out.println("\nWhat kind of milk would you like 'NonFat', '2%', 'Whole', 'Almond', 'Soy', 'Coconut', 'Oat', 'Half and half', 'Heavy cream'");
                     String m = milly.next();
                     if(m.equals("NonFat"))
                        milkk = "nonfat";
                     if(m.equals("2%"))
                        milkk = "two_pert";
                     if(m.equals("Whole"))
                        milkk = "whole";
                     if(m.equals("Almond"))
                        milkk = "almond";
                     if(m.equals("Soy"))
                        milkk = "soy";
                     if(m.equals("Coconut"))
                        milkk = "coco";
                     if(m.equals("Oat"))
                        milkk = "oat";
                     if(m.equals("Half and half"))
                        milkk = "hnh";
                     if(m.equals("Heavy cream"))
                        milkk = "hc";
                  
                     Scanner sypp = new Scanner(System.in);
                     while(true) {
                        System.out.println("nWhat syrup would you like? 'frape base' 'caramel' 'cin dol' 'hazelnut' 'mint' 'rasberry' 'toffee' 'vanilla' 'dark car' 'classic' 'b sugar' 'l cane' 'hon blend' 'sf van' 'mocha' 'w mocha'");
                        String ss = sypp.next();
                        if(ss.equals("frape base"))
                           syrupp = "sap_base";
                        if(ss.equals("caramen"))
                           syrupp = "caramel";
                        if(ss.equals("cin dol"))
                           syrupp = "cin_dol";
                        if(ss.equals("hazelnut"))
                           syrupp = "hazelnut";
                        if(ss.equals("mint"))
                           syrupp = "mint";
                        if(ss.equals("rasberry"))
                           syrupp = "rasberry";
                        if(ss.equals("toffee"))
                           syrupp = "toffee";
                        if(ss.equals("vanilla"))
                           syrupp = "vanilla";
                        if(ss.equals("dark car"))
                           syrupp = "dark_car";
                        if(ss.equals("classic"))
                           syrupp = "classic";
                        if(ss.equals("b sugar"))
                           syrupp = "b_sugar";
                        if(ss.equals("l cane"))
                           syrupp = "l_cane";
                        if(ss.equals("hon blend"))
                           syrupp = "hon_blend";
                        if(ss.equals("sf van"))
                           syrupp = "sf_van";
                        if(ss.equals("mocha"))
                           syrupp = "mocha";
                        if(ss.equals("w mocha"))
                           syrupp = "w_mocha";
                     
                        Scanner ad = new Scanner(System.in);
                        while(true) {
                           String ads = ad.next();
                           System.out.println("\nWhat add ons would you like? 'cin dol' 'caramel drizz' 'mocha drizz' 'cin powder'");
                           if(ads.equals("cin dol"))
                              adds = "cin_dol_spr";
                           if(ads.equals("caramel drizz"))
                              adds = "c_dizzel";
                           if(ads.equals("mocha drizz"))
                              adds = "m_dizzel";
                           if(ads.equals("cin powder"))
                              adds = "cin_pow";
                              
                              Scanner sizes = new Scanner(System.in);
                              while(true){
                              
                              String drin = sizes.next();
                              System.out.println("\nwhat drink would you would like, 'kids' or 'tall' or 'grande' or 'venti' or 'trenta'");
                              if(drin.equals("kids"))
                              drinkks = "kids";
                              if(drin.equals("tall"))
                              drinkks = "tall";
                              if(drin.equals("grande"))
                              drinkks = "grande";
                              if(drin.equals("venti"))
                              drinkks = "venti";
                              if(drin.equals("trenta"))
                              drinkks = "trenta";
                              
                        }
                        }
                     }
                  }       
               }
            }
         }
   //      x.add(syrupp).add(adds)
         
      }
   }
}
         
                              
      
      
      
  /*    if(s.equal("Hot")) {
               Scanner ht = new Scanner(System.in);
      while(true)
      {
         System.out.print("\nWhat size would you like, 'Short', 'Tall', 'Grande', or 'Venti' (-1 to exit) ");
         String s = ht.next();
         if (s.equals("-1"))
            System.exit(0);
      }
      }
*/

      
    /*  Drink coffee = new Drink("Drunk", 0.0, 0.0 , 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
      Drink milk = new Drink("Drunker", 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0);
      
      Drink syrup = new Drink("milk", 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0);  // this shit right here is how you declare what something is, the numbers are in order that they are in the other doc
      
      coffee.add(milk);  // this is how you add the macros together.
      System.out.println(coffee);  // this was just to check if I worked, it does
      coffee.add(syrup);   // this adds the macros of syrup to coffee which already have the macros of milk added to it
      System.out.println(coffee);  // again just checking if it works
      
      coffee.subtract(syrup); // this is how you subtract something from something else
      System.out.println(coffee);
      
      coffee.multiply(syrup);   // this is how you multiply something
      System.out.println(coffee);
   
      
      Drink drinky = new Drink();
      
            */
      
      
      
   

