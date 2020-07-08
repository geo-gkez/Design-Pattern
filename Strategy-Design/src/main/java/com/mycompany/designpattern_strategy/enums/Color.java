/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpattern_strategy.enums;

/**
 *
 * @author georg
 */
public enum Color {
    RED(0.15),ORANGE(0.10), YELLOW(0.05), GREEN(0.11), BLUE(0.09), INDIGO(0.21), VIOLET(0.3);
    
     private final double d;

    private Color(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }
    
    
}
