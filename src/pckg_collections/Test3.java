package pckg_collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(10, "Franka");
        mapa.put(30, "Goran");
        mapa.put(21, "Edi");
        mapa.put(90, "Divna");
        mapa.put(43, "Franka");
        System.out.println(mapa);
        printMapElements(mapa);
        Set<Integer> keys = getKeysForValue(mapa, "Franka");
        System.out.println(keys);
    }

    private static void printMapElements(HashMap<Integer, String> mapa){
        for (Integer key: mapa.keySet()){
            System.out.println("Key: "+ key);
            System.out.println("value: "+ mapa.get(key));
        }
    }

    private static Set<Integer> getKeysForValue(HashMap<Integer, String> mapa, String value) {
        Set<Integer> keys = new HashSet<>();
        for (Integer key : mapa.keySet()) {
            if (mapa.get(key).equals(value)) {
                keys.add(key);
            } else {
                continue;
            }
        }
        return keys;
    }
}
