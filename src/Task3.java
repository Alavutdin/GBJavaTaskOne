/*Урок 3. Коллекции JAVA: Введение
1Реализовать алгоритм обратной сортировки списков компаратором.
2Пусть дан произвольный список целых чисел, удалить из него чётные числа
3Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
4Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
5Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
6Повторить пятый пункт но с LinkedList.
7Сравнить время работы пятого и шестого пунктов.*/
import java.util.*;
public class Task3 {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        String a = list.get(0);
        System.out.println(list);

        ArrayList<Integer> listI1 = new ArrayList<>();
        ArrayList<Integer> listI2 = new ArrayList<>();
        for (int i=0;i<10;i++) {
            listI1.add(new Random().nextInt(25));
            listI2.add(new Random().nextInt(25));
        }


        System.out.println(listI1);
        System.out.println(listI2);
        System.out.println("-".repeat(30));
        listI1.removeAll(listI2);
        listI1.retainAll(listI2);
        System.out.println(listI1);

        final int f = 6;

        if (listI2.contains(45)) System.out.println(true);
        List<Integer> listI3 = listI2.subList(0, 2);
        listI3= (List<Integer>) listI2.clone();


        System.out.println(listI2);
        listI2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%2 != 0) return 1;
                if (o2%2 != 0) return 0;
                return -1;
            }
        });
        System.out.println(listI2);

        LinkedList<Integer> integers = new LinkedList<>();
        integers.add(3);
        listI1.addAll(integers);

        System.out.println(Arrays.toString(new int[]{3, 4,5}));
        Fio fio = new Fio("РРІР°РЅРѕРІ", "РРІР°РЅ", "РЎС‚РµРїР°РЅРѕРІРёС‡");
        System.out.println(fio);

    }
}

class Fio{
    private String f, i, o;

    public Fio(String f, String i, String o) {
        this.f = f;
        this.i = i;
        this.o = o;
    }

    @Override
    public String toString() {
        return f+" "+i.toUpperCase().charAt(0)+"."+o.toUpperCase().charAt(0)+".";
    }
}
