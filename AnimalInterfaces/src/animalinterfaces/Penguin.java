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
public class Penguin extends Bird implements ISwim, IMakeSound{

    public Penguin(String name, int Wingspan) {
        super(name, Wingspan);
    }

    @Override
    public void swim() {
        System.out.println("The penguin dives into the freezing water.");
    }

    @Override
    public void makeSound() {
        System.out.println("The penguin obnoxiously honks into the distance.");
    }

}
