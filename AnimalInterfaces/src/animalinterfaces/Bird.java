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
public abstract class Bird extends Animal{
    
    private int Wingspan;

    public Bird(String name, int Wingspan) {
        super(name);
        this.Wingspan = Wingspan;
    }

    public int getWingspan() {
        return Wingspan;
    }
    
}
