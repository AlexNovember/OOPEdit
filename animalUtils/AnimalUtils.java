package animalUtils;

import animalUtils.comparator.AnimalAgeComparator;
import animals.Animal;

import java.util.ArrayList;
import java.util.Collections;

public class AnimalUtils {
    /**
     *
     * @param animalList
     * @param <T> 
     */
    static <T extends Animal> void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList,new AnimalAgeComparator());
    }

}
