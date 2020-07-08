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
public enum Fabric {
    WOOL(10), COTTON(15), POLYESTER(20.5), RAYON(30.2), LINEN(35.8), CASHMERE(40.2), SILK(50);
    
    private final double d;

    private Fabric(double d) {
        this.d = d;
    }

    public double getD() {
        return d;
    }
    
    
}
