package com.the_noble_priest;

import java.util.Arrays;
import java.util.HashSet;

public class SetsProperties {

    /**
     * Union of the Two array.
     * Integer[] secondArray, Integer[] firstArray
     */
    void uniorSetsProperties(Integer[] firstArray, Integer[] secondArray) {
        HashSet<Integer> union = new HashSet<>();
        union.addAll(Arrays.asList(firstArray));
        union.addAll(Arrays.asList(secondArray));
        System.out.println(union);
    }

    /**
     * Intersection of two Array
     * Integer[] firstArray, Integer[] secondArray
     */
    void intersectionSetProperties(Integer[] firstArray, Integer[] secondArray) {
        HashSet<Integer> intesection = new HashSet<>();
        intesection.addAll(Arrays.asList(firstArray));
        intesection.retainAll(Arrays.asList(secondArray));

        System.out.println(intesection);
    }

    void differenceSetProperties(Integer[] firstArray, Integer[] secondArray) {
        HashSet<Integer> difference = new HashSet<>();
        difference.addAll(Arrays.asList(firstArray));
        difference.addAll(Arrays.asList(secondArray));
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                difference.remove(firstArray[i]);
            }
        }
        System.out.println(difference);

    }
}
