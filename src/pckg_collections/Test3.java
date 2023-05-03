package pckg_collections;

import java.util.HashMap;

public class Test3 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<>();
        mapa.put(10, "Franka");
        mapa.put(30, "Goran");
        mapa.put(21, "Edi");
        mapa.put(90, "Divna");
        mapa.put(43, "Franka");
        System.out.println(mapa);
    }
}
