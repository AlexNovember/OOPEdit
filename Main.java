import animals.Lion;
import animals.Wolf;
import cage.LionCage;
import cage.WolfCage;
import factory.LionsFactory;
import factory.WolfFactory;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Wolf> wolves = WolfFactory.createWolves(5);
        WolfCage cage = new WolfCage();
        cage.setWolves(wolves);
        cage.setGarbageWeight(120);
        cage.setFoodWeight(1200);
        ArrayList<Lion> lionsCollection = LionsFactory.createLions(25);
        LionCage cagel = new LionCage();
        cagel.setLions(lionsCollection);
        System.out.println(cage.getWolves().toString());

        }
    }
    