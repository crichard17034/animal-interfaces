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
public class Ostrich extends Bird implements IWalk, IMakeSound{

    public Ostrich(String name, int Wingspan) {
        super(name, Wingspan);
    }

    @Override
    public void walk() {
        System.out.println("The ostrich walks away from the others.");
    }

    @Override
    public void makeSound() {
        System.out.println("The ostrich  hoots loudly.");
    }

}
