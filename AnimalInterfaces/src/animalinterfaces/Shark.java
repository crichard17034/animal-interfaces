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
public class Shark extends Fish implements ISwim{

    public Shark(String name, boolean isSaltWater) {
        super(name, isSaltWater);
    }

    @Override
    public void swim() {
        System.out.println("The shark swims aggresively towards its prey.");
    }
    
}
