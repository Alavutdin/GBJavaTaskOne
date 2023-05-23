import java.awt.font.FontRenderContext;
import java.util.*;

public class Test003Seminar3001 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();

//        list.add(1); // Хранят ссылки списки
//        list.add(.1); // Ошибка по причине того, что int
        list.add("Hello");

        // Медленный if
//        if (list.get(0) instanceof Integer) { // Если индекс 0 яв-ся целым числом
//            int a = ((Integer)list.get(0));
//            System.out.println(a);
//        }

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i<10; i++) list1.add(new Random().nextInt(25));

//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }
//
//        for (int a: list1) {
//            a=0;
//            System.out.println(a);
//        }
        list1.forEach(n-> System.out.print(n+", ")); // просто в строчку
        System.out.println();

        //Iterator<Integer> iterator = list1.iterator();
        ListIterator<Integer> iterator = list1.listIterator(list.size()-1);
        while (iterator.hasNext()){  // Удалить перевод в списках
            int n = iterator.next();
            System.out.print(n+", ");
            iterator.remove();
        }
        System.out.println(list1);
        list1.addAll(list1); // добавить все элементы
        list1.removeAll(list1); // удалят из списка в котором есть одинаковые элементы
        list1.retainAll(list1); // сохр пересечение одинаковые элементы

        list1.contains(45);  // вернет истину если есть этот элемент
        List<Integer>list3 =list1.subList(0,2); // вернет с 0 элемента по 2
        list1.clone();  // возвращает ссылку на новый объект точной копией
        list3=(List<Integer>) list1.clone();

        list3.sort(Comparator.naturalOrder());  // Сортировка по уменьшению итд
        list3.sort(Comparator.reverseOrder());  // Сортир в обратном порядке

        list1.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if (o1%o2!=0) return 0;
                return o2-o1;

            }
        });


        }
    }

