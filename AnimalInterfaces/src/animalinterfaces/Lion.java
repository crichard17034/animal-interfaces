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
public class Lion extends Mammal implements IWalk, IMakeSound{

    public Lion(String name, int bodyTemp) {
        super(name, bodyTemp);
    }

    @Override
    public void walk() {
        System.out.println("The lion walks at a brisk pace.");
    }

    @Override
    public void makeSound() {
        System.out.println("The lion lets out a mighty roar.");
    }
    
}
