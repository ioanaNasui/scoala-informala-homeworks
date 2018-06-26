package com.company;
/**
 * Bubble Sort Algorithm.
 * created 23rd of May 2018 as homework2 for Scoala Informala de IT
 * @param reps is an array of objects
 * @author Ioana
 *
 */
public class BubbleSortMethod {

    public void bubbleSort(SalesRepr[] reps) {
        int n = reps.length;
        SalesRepr temp;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(reps[j-1].getRevenue() < reps[j].getRevenue()){
                    //swap elements
                    temp = reps[j-1];
                    reps[j-1] = reps[j];
                    reps[j] = temp;
                }

            }
        }

    }
}
