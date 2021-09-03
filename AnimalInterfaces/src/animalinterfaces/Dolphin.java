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
public class Dolphin extends Mammal implements ISwim, IMakeSound{

    public Dolphin(String name, int bodyTemp) {
        super(name, bodyTemp);
    }
    
    @Override
    public void swim() {
        System.out.println("The dolphin swims through the waters below.");
    }

    @Override
    public void makeSound() {
        System.out.println("The dolphin squeaks loudly to its friends.");
    }
    
}
