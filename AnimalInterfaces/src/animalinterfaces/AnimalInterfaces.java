/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalinterfaces;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author crichard
 */
public class AnimalInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ostrich ostrich = new Ostrich("Rick", 23);
        Penguin penguin = new Penguin("Perry", 12);
        Eagle eagle = new Eagle("Evan", 10);
        Dolphin dolphin = new Dolphin("Dylan", 96);
        Lion lion = new Lion("Leo", 100);
        Bat bat = new Bat("Beatrice", 103);
        Shark shark = new Shark("Samson", true);
        Bass bass = new Bass("Bart", true);
        FlyingFish flyingFish = new FlyingFish("Francis", true);
        
        
        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(ostrich);
        myAnimals.add(penguin);
        myAnimals.add(eagle);
        myAnimals.add(dolphin);
        myAnimals.add(lion);
        myAnimals.add(bat);
        myAnimals.add(shark);
        myAnimals.add(bass);
        myAnimals.add(flyingFish);
        
        ArrayList<Bird> myBirds = new ArrayList<>();
        myBirds.add(ostrich);
        myBirds.add(penguin);
        myBirds.add(eagle);
        
        ArrayList<Mammal> myMammals = new ArrayList<>();
        myMammals.add(dolphin);
        myMammals.add(lion);
        myMammals.add(bat);
        
        ArrayList<Fish> myFishes = new ArrayList<>();
        myFishes.add(shark);
        myFishes.add(bass);
        myFishes.add(flyingFish);
        
        ArrayList<IFly> myFlyers = new ArrayList<>();
        myFlyers.add(eagle);
        myFlyers.add(bat);
        myFlyers.add(flyingFish);
        
        ArrayList<IWalk> myWalkers = new ArrayList<>();
        myWalkers.add(ostrich);
        myWalkers.add(lion);
        
        ArrayList<ISwim> mySwimmers = new ArrayList<>();
        mySwimmers.add(penguin);
        mySwimmers.add(dolphin);
        mySwimmers.add(shark);
        mySwimmers.add(bass);
        mySwimmers.add(flyingFish);
        
        ArrayList<IMakeSound> mySoundMakers = new ArrayList<>();
        mySoundMakers.add(ostrich);
        mySoundMakers.add(penguin);
        mySoundMakers.add(eagle);
        mySoundMakers.add(dolphin);
        mySoundMakers.add(lion);
        mySoundMakers.add(bat);
        
        
        for(Animal animal: myAnimals)
        {
            System.out.println(animal.getName());
        }
        
        for(Bird bird: myBirds)
        {
            System.out.println(bird.getName());
            System.out.println(bird.getWingspan());
        }
        
        for(Mammal mammal: myMammals)
        {
            System.out.println(mammal.getName());
            System.out.println(mammal.getBodyTemp() + " degrees");
        }
        
        for(Fish fish: myFishes)
        {
            System.out.println(fish.getName());
            System.out.println(fish.isIsSaltWater());
        }
        
        for(IFly flyer: myFlyers)
        {
            flyer.fly();
        }
        
        for(IWalk walker: myWalkers)
        {
            walker.walk();
        }
        
        for(ISwim swimmer: mySwimmers)
        {
            swimmer.swim();
        }
        
        for(IMakeSound soundMaker: mySoundMakers)
        {
            soundMaker.makeSound();
        }
        
    }
}
