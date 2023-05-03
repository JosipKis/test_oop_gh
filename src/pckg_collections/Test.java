package pckg_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>(7);
        populateList(lst, 7);
        System.out.println(lst);
        lst.add("NOVI");
        lst.add("NOVI");
        System.out.println(lst);
        HashSet<String> set1 = new HashSet<>(lst);
        System.out.println(set1);
        for (String element: set1){
            System.out.println(element);
        }
    }

//    private static void populateList(ArrayList<String> lst, int numElements){
//        String base = "base";
//        for (int k = 0; k < numElements; k++){
//            base += k;
//            lst.add(base);
//        }
//    }

    private static <E> void populateList(ArrayList<E> lista, int elements){

        for (int k = 0; k < elements; k++){
            E element = (E) new Object();
            System.out.println("Added new element: "+ element);
            lista.add(element);
        }
    }
}
