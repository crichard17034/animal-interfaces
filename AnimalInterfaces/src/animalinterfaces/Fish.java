/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalinterfaces;

/**
 *
 * @author crichard
 */
public abstract class Fish extends Animal{
    
    private boolean isSaltWater;

    public Fish(String name, boolean isSaltWater) {
        super(name);
        this.isSaltWater = isSaltWater;
    }

    public boolean isIsSaltWater() {
        return isSaltWater;
    }
    
}
