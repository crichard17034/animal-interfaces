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
public class Eagle extends Bird implements IFly, IMakeSound{

    public Eagle(String name, int Wingspan) {
        super(name, Wingspan);
    }
    
    @Override
    public void fly() {
        System.out.println("The eagle flies away from its nest.");
    }

    @Override
    public void makeSound() {
        System.out.println("The eagle caws in the distance.");
    }
    
}
