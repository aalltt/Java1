package lesson2_3;

/*
Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
1. Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
2. Посчитать, сколько раз встречается каждое слово.
*/

import java.util.HashMap;
import java.util.HashSet;

public class Collection {
    public static void main(String[] args) {
        String[] ss = {"Hulk", "Ironman", "Spiderman", "Hulk", "Spiderman"};

//1ое задание
        HashSet<String> hs = new HashSet<>();
        for (String tt : ss) {
            hs.add(tt);
        }
        System.out.println(hs);


//2ое задание
        HashMap<String, Integer> hm = new HashMap<>();
        for (String yy : ss) {
            hm.put(yy, hm.getOrDefault(yy, 0) + 1);
        }
        System.out.println(hm);
    }
}
