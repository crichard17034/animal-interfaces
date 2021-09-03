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
public class Bass extends Fish implements ISwim{

    public Bass(String name, boolean isSaltWater) {
        super(name, isSaltWater);
    }

    @Override
    public void swim() {
        System.out.println("The bass swims lazily in the sea.");
    }
    
}
