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
public class Bat extends Mammal implements IFly, IMakeSound{

    public Bat(String name, int bodyTemp) {
        super(name, bodyTemp);
    }

    @Override
    public void fly() {
        System.out.println("The bat flies within the cave.");
    }

    @Override
    public void makeSound() {
        System.out.println("The bat squeaks softly.");
    }
    
}
