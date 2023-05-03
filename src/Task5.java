import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

/*Создать множество, ключей и значение строки. Добавить шесть элементов.
Вывести в консоль значения. Добавить ко всем значениям символ "!".
Создать второе множество с таким же обобщением. Ключи второго множества
частично совпадают с ключеми первого. Объеденить значания во втором множестве
и первом если ключи совподают. Вывести результат в консоль.*/
public class Task5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Один", "One");
        map.put("Два", "Two");
        map.put("Три", "Three");
        map.put("Четыре", "Four");
        map.put("Пять", "Five");

        for (String key:map.keySet()){
            System.out.println(map.get(key));
        }

//        Set keys = map.keySet();
//        for (int i = 0; i < keys.size(); i++){
//            System.out.println(map.get(keys.toString()[i]));
//        }
//        map.remove("!");
        System.out.println();
//        map.put("Один", "!");
//        for (String key:map.keySet()){
//            System.out.println(map.get(key));
//        }
//        map.getOrDefault("Один", "One");
        map.containsValue("!");
        map.forEach((k,v) -> System.out.println(k+""+v)); // Лямда
        map.compute("Один", (k,v)->v+"!");
        map.compute("Два", (k,v)->v+"!");
        map.compute("Три", (k,v)->v+"!");
        map.compute("Четыре", (k,v)->v+"!");
        map.compute("Пять", (k,v)->v+"!");

        map.computeIfPresent("Один", (k,v)->v+"!?");
        map.computeIfAbsent("Один", v->v+"!");

        System.out.println(map);

        for (String key:map.keySet()){
            map.compute(key, (k,v)->v+"!");
        }

        System.out.println(map);

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

            treeMap.put(5,"Five");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        System.out.println(treeMap);


    }
}
