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
public enum Size {
    XS(0.4), S(0.5), M(0.6), L(0.7), XL(1.0), XXL(1.05), XXXL(1.2);
    
    public double d;

    private Size(double d) {
        this.d = d;
    }
    
    
}
