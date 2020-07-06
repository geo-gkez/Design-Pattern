/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern_strategy.models;

import com.mycompany.designpattern_strategy.enums.Color;
import com.mycompany.designpattern_strategy.enums.Fabric;
import com.mycompany.designpattern_strategy.enums.Size;
import com.mycompany.designpattern_strategy.strategyPayment.paymentTshirt;



/**
 *
 * @author georg
 */
public class Tshirt {
    private paymentTshirt paymentTshirt;
    
    private Color color;   
    private Size size;
     private Fabric fabric;

    public Tshirt(paymentTshirt createTshirt,Color color, Size size, Fabric fabric) {
        this.paymentTshirt = createTshirt;
      this.color=  color;
      this.size= size;
      this.fabric= fabric;
    }

    
    public double priceOfTshirt(){
    
        
        
        double sum= color.d+size.d+fabric.d;
        
        return sum;
    
    }
    
    
    public void wayOfPayment(){
    paymentTshirt.methodOfPayment();
    
    }

    public void priceAndWayOfPayment(){
    
        System.out.println(this.toString());    
        System.out.print("Payment method is: ");
        wayOfPayment();
        System.out.println("The price is: "+ priceOfTshirt());
    }
    
    
    public paymentTshirt getPaymentTshirt() {
        return paymentTshirt;
    }

    public void setPaymentTshirt(paymentTshirt paymentTshirt) {
        this.paymentTshirt = paymentTshirt;
    }
    
   
    
   
    public Color getColorPrice() {
        return color;
    }

    public void setColorPrice(Color colorPrice) {
        this.color = colorPrice;
    }

    public Size getSizePrice() {
        return size;
    }

    public void setSizePrice(Size sizePrice) {
        this.size = sizePrice;
    }

    public Fabric getFabricPrice() {
        return fabric;
    }

    public void setFabricPrice(Fabric fabricPrice) {
        this.fabric = fabricPrice;
    }

    @Override
    public String toString() {
        return "Tshirt:  color=" + color + ", size=" + size + ", fabric=" + fabric ;
    }
    
    
    
}
