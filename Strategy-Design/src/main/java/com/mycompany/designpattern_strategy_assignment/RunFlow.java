/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern_strategy_assignment;


import com.mycompany.designpattern_strategy.enums.Color;
import com.mycompany.designpattern_strategy.enums.Fabric;
import com.mycompany.designpattern_strategy.enums.Size;
import com.mycompany.designpattern_strategy.models.Tshirt;
import com.mycompany.designpattern_strategy.strategyPayment.Cash;
import com.mycompany.designpattern_strategy.strategyPayment.Credit_DebitCards;
import com.mycompany.designpattern_strategy.strategyPayment.Money_BankTransfer;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author georg
 */
public class RunFlow {
    
   static Scanner s=new Scanner(System.in);
    
public  void runFlow(){

    
Color  color= chooseColor();
     while (color==null){  System.out.println("choose the correct numbers: ");   color= chooseColor(); }
  Size size =chooseSize();  
          while (size==null){  System.out.println("choose the correct numbers: "); size=chooseSize();}
    Fabric fabric = chooseFabric();
              while (fabric==null){  System.out.println("choose the correct numbers: "); fabric=chooseFabric();}
             
              
              System.out.println("Choose way of payment: ");
              System.out.println("with Cash press 1");
              System.out.println("with Credit/DebitCards press 2");
              System.out.print("with Money/BankTransfer press 3\n");
            
          Tshirt tshirt=choosePayment(color,size,fabric);
             while(tshirt==null){ System.out.println("choose 1 to 3: "); tshirt=choosePayment(color,size,fabric); }
              
              tshirt.priceAndWayOfPayment();

        System.out.println(color);
            
}
   
    

public Color chooseColor(){

System.out.println("Available colors: ");
  List<Color> colors =Arrays.asList(Color.values());
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(  (i+1) +": "+  colors.get(i));
        }


    System.out.println("Choose color:");
  
    
      Color color=(Color)  findFromList(s,colors);
   
     
   
return color;

}

public Size chooseSize(){

System.out.println("----------------------------");
    System.out.println("Available sizes: ");

      List sizes =Arrays.asList(Size.values());
        for (int i = 0; i < sizes.size(); i++) {
            System.out.println(  (i+1) +": "+  sizes.get(i));
        }

        
        System.out.println("Choose size:");
             Size size=(Size)  findFromList(s,sizes);
        
          
             
return size;

}

public Fabric chooseFabric(){

    System.out.println("----------------------------");
    System.out.println("Available fabrics: ");
    
       List fabrics =Arrays.asList(Fabric.values());
        for (int i = 0; i < fabrics.size(); i++) {
            System.out.println(  (i+1) +": "+  fabrics.get(i));
        }
             System.out.println("Choose fabric:");
              Fabric fabric=(Fabric)  findFromList(s,fabrics);

              return fabric;

}

public Tshirt choosePayment(Color color,Size size,Fabric fabric){

    Tshirt tshirt = null;
              if(s.hasNextInt()){
              
    switch (s.nextInt()) {
        case 1:
            tshirt = new Tshirt(new Cash(),color, size,fabric);
            break;
        case 2:
            tshirt = new Tshirt(new Credit_DebitCards(),color, size,fabric);
            break;
        case 3:
            tshirt = new Tshirt(new Money_BankTransfer(),color, size,fabric);
            break;
        default:
            break;
    }
              
              }
              
     

return tshirt;
}


public Object findFromList(Scanner s,List list ){

   
   if (s.hasNextInt()){
       int numberOfColor =s.nextInt();
       if(numberOfColor<=list.size() && numberOfColor>0){
      
                 for (int i = 0; i < list.size(); i++) {
           if((i+1)==numberOfColor){
           return list.get(i);
           }       
        }
               
       }
   } 
  
   if(s.next()!=null){return null;}
   
   return null;

}
    




}
