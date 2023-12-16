package Aula09.Ex02;
import java.util.ArrayList;
import java.util.Collection;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;

public class CollectionTester { 
 
    public static void main(String[] args) { 
        int DIM1 = 1000; 
        int DIM2 = 5000; 
        int DIM3 = 10000;
        int DIM4 = 20000;
        int DIM5 = 40000;
        int DIM6 = 100000;

        Collection<Integer> col = new ArrayList<>();
        System.out.printf("%-20s %15d %15d %15d %15d %15d %15d\n","Collection", DIM1, DIM2, DIM3, DIM4, DIM5, DIM6);
        System.out.printf("%-27s %s\n", "ArrayList", "----------------------------------------------------------------------------------------");
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n","add", checkAdd(col, DIM1), checkAdd(col, DIM2), checkAdd(col, DIM3), checkAdd(col, DIM4), checkAdd(col, DIM5), checkAdd(col, DIM6));
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n","search", checkSearch(col, DIM1), checkSearch(col, DIM2), checkSearch(col, DIM3), checkSearch(col, DIM4), checkSearch(col, DIM5), checkSearch(col, DIM6));
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "remove", checkRemove(col, DIM1), checkRemove(col, DIM2), checkRemove(col, DIM3), checkRemove(col, DIM4), checkRemove(col, DIM5), checkRemove(col, DIM6));
        

        Collection<Integer> linkedList = new LinkedList<>();
        System.out.printf("%-27s %s\n", "LinkedList", "----------------------------------------------------------------------------------------");
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "add", checkAdd(linkedList, DIM1), checkAdd(linkedList, DIM2), checkAdd(linkedList, DIM3), checkAdd(linkedList, DIM4), checkAdd(linkedList, DIM5), checkAdd(linkedList, DIM6));
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "search", checkSearch(linkedList, DIM1), checkSearch(linkedList, DIM2), checkSearch(linkedList, DIM3), checkSearch(linkedList, DIM4), checkSearch(linkedList, DIM5), checkSearch(linkedList, DIM6));
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "remove", checkRemove(linkedList, DIM1), checkRemove(linkedList, DIM2), checkRemove(linkedList, DIM3), checkRemove(linkedList, DIM4), checkRemove(linkedList, DIM5), checkRemove(linkedList, DIM6));

        Collection<Integer> hashSet = new HashSet<>();
        System.out.printf("%-27s %s\n", "HashSet", "----------------------------------------------------------------------------------------");
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "add", checkAdd(hashSet, DIM1), checkAdd(hashSet, DIM2), checkAdd(hashSet, DIM3), checkAdd(hashSet, DIM4), checkAdd(hashSet, DIM5), checkAdd(hashSet, DIM6));
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "search", checkSearch(hashSet, DIM1), checkSearch(hashSet, DIM2), checkSearch(hashSet, DIM3), checkSearch(hashSet, DIM4), checkSearch(hashSet, DIM5), checkSearch(hashSet, DIM6));
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "remove", checkRemove(hashSet, DIM1), checkRemove(hashSet, DIM2), checkRemove(hashSet, DIM3), checkRemove(hashSet, DIM4), checkRemove(hashSet, DIM5), checkRemove(hashSet, DIM6));

        Collection<Integer> treeSet = new TreeSet<>();
        System.out.printf("%-27s %s\n", "TreeSet", "----------------------------------------------------------------------------------------");
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "add", checkAdd(treeSet, DIM1), checkAdd(treeSet, DIM2), checkAdd(treeSet, DIM3), checkAdd(treeSet, DIM4), checkAdd(treeSet, DIM5), checkAdd(treeSet, DIM6));
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "search", checkSearch(treeSet, DIM1), checkSearch(treeSet, DIM2), checkSearch(treeSet, DIM3), checkSearch(treeSet, DIM4), checkSearch(treeSet, DIM5), checkSearch(treeSet, DIM6));
        System.out.printf("%-20s %15f %15f %15f %15f %15f %15f\n", "remove", checkRemove(treeSet, DIM1), checkRemove(treeSet, DIM2), checkRemove(treeSet, DIM3), checkRemove(treeSet, DIM4), checkRemove(treeSet, DIM5), checkRemove(treeSet, DIM6));

    } 

    private static double checkAdd(Collection<Integer> col, int DIM){
        double start, stop, delta;     // Add 
        start = System.nanoTime(); // clock snapshot before 
        for(int i=0; i<DIM; i++ ) 
            col.add( i ); 
        stop = System.nanoTime();  // clock snapshot after 
        delta = (stop-start)/1e6;
        return delta;

    }

    public static double checkSearch(Collection<Integer> col, int DIM){
        double start, stop, delta;  
        start = System.nanoTime(); // clock snapshot before 
        for(int i=0; i<DIM; i++ ) { 
            int n = (int) (Math.random()*DIM); 
            boolean found = false;
            for (int item : col) {
                if (item == n) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not found??? "+n); 
            }
        }
        stop = System.nanoTime();  // clock snapshot after 
        delta = (stop-start)/1e6;
        return delta;
    }

    public static double checkRemove(Collection<Integer> col, int DIM) {
        double start, stop, delta;
        // First add the elements to the collection
        for (int i = 0; i < DIM; i++) {
            col.add(i);
        }
        start = System.nanoTime(); // clock snapshot before
        col.clear(); // remove all elements
        stop = System.nanoTime(); // clock snapshot after
        delta = (stop - start) / 1e6; // convert nanoseconds to milliseconds
        return delta;
    }



    //private static void checkPerformance(Collection<Integer> col, int DIM) { 
    //    double start, stop, delta;     // Add 
    //    start = System.nanoTime(); // clock snapshot before 
    //   for(int i=0; i<DIM; i++ ) 
    //        col.add( i ); 
    //    stop = System.nanoTime();  // clock snapshot after 
    //    delta = (stop-start)/1e6; // convert to milliseconds 
    //    System.out.println(col.size()+ ": Add to " + 
    //        col.getClass().getSimpleName() +" took " + delta + "ms");     // Search 
    //    start = System.nanoTime(); // clock snapshot before 
    //    for(int i=0; i<DIM; i++ ) { 
    //        int n = (int) (Math.random()*DIM); 
    //        if (!col.contains(n))  
    //            System.out.println("Not found???"+n); 
    //    } 
    //    stop = System.nanoTime();  // clock snapshot after 
    //    delta = (stop-start)/1e6; // convert nanoseconds to milliseconds 
     //   System.out.println(col.size()+ ": Search to " +  
    //        col.getClass().getSimpleName() +" took " + delta + "ms");     // Remove 
   //     start = System.nanoTime(); // clock snapshot before 
    //    Iterator<Integer> iterator = col.iterator(); 
     //   while (iterator.hasNext()) { 
     //       iterator.next(); 
     //       iterator.remove(); 
    //    } 
    //    stop = System.nanoTime();  // clock snapshot after 
    //    delta = (stop-start)/1e6; // convert nanoseconds to milliseconds 
    //    System.out.println(col.size() + ": Remove from "+  
   //         col.getClass().getSimpleName() +" took " + delta + "ms"); 
   // } 
}
