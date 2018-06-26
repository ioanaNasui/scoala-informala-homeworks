package com.company;
/**
 * Sorts an array of objects of Sale Representatives via Bubble Sort Algorithm.
 * created 23rd of May 2018 as homework2 for Scoala Informala de IT
 *
 * @author Ioana
 *
 */
public class SortViaBubbleSortAlgorithm {

    public static void main(String[] args) {

        //Array (SalesRepr)of objects (reps) initialization
        SalesRepr[] reps = new SalesRepr[3];
        reps[0] = new SalesRepr("Ion", 3, 500.7);
        reps[1] = new SalesRepr("Maria", 10, 720);
        reps[2] = new SalesRepr("Vasile", 1, 1000);

        //Printing array before sorting
        System.out.println("Array before Bubble Sort");
        for (int i = 0; i < reps.length; i++) {
            System.out.println("Name: "+reps[i].sellerName+" Sales: "+reps[i].noOfSales+"; Quota/sale: "+reps[i].quotaPerSale+"$; Revenue: "+reps[i].getRevenue()+"$");
            System.out.println();
        }

        //calling the bubbleSort method (not static)
        BubbleSortMethod sort =new BubbleSortMethod();
        sort.bubbleSort(reps);

        //Printing array after sorting
        System.out.println("Array after Bubble Sort");
        for (int i = 0; i < reps.length; i++) {
            System.out.println("Name: "+reps[i].sellerName+" Sales: "+reps[i].noOfSales+"; Quota/sale: "+reps[i].quotaPerSale+"$; Revenue: "+reps[i].getRevenue()+"$");
            System.out.println();
        }

    }

}
