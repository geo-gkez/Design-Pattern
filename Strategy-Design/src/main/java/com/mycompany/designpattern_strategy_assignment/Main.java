
package com.mycompany.designpattern_strategy_assignment;



public class Main {


    public static void main(String[] args) {
        

        //     Tshirt    tshirt1 = new Tshirt(new Cash(),Color.BLUE, Size.L,Fabric.SILK);

   //   Tshirt      tshirt2 = new Tshirt(new Credit_DebitCards(),Color.INDIGO, Size.M,Fabric.COTTON);

     //    Tshirt   tshirt3 = new Tshirt(new Money_BankTransfer(),Color.GREEN, Size.L,Fabric.LINEN);

    //     tshirt1.wayOfPayment();  //executeStrategy
     //   System.out.println(tshirt1.priceOfTshirt()); //price from enums
      //   tshirt2.wayOfPayment();
      //           System.out.println(tshirt2.priceOfTshirt());
      //   tshirt3.wayOfPayment();
       //          System.out.println(tshirt3.priceOfTshirt());
    
    RunFlow run = new RunFlow();
    run.runFlow();
    
    }
    
}
