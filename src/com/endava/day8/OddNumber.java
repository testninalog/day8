package com.endava.day8;

import java.util.HashMap;
import java.util.Map;

public class OddNumber {
    public int findOddNumber(int[] a) {

        Map<Integer, Integer> mapa;
        mapa = new HashMap<Integer, Integer>();
        for (int e : a) {
            if (!mapa.containsKey(e)) {
                mapa.put(e, 1);
            } else {
                Integer f = mapa.get(e);//uzimamo frekvenciju reci
                mapa.put(e, f + 1);

            }
            // go trough the array
            // create a map vith value and accurrance
            //for each eleement chek for a value if the map already have that element increase accurance +1
            //if is nor add element to mapp and accurance 1
            // for each eleemnt in the map accurancce %2 != 0 oddNumber(value)
            //return oddNumber
        }

        Integer oddNum = 0;
        for (Integer key : mapa.keySet()) {//for each key in keySet- vraca listu keys u obliku seta
            if (mapa.get(key) % 2 != 0) {
                oddNum = key;

            }
        }
        return oddNum;
    }
}
