package Task2.Seminal1.Task1;

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class Test001 {
    public static void main(String[] args) {
        int i;
        String[] strings;
        Random random = new Random();
        i = random.nextInt(10000);
        System.out.println(i);
        strings = String.valueOf(i).split("");
        System.out.println(strings);
        System.out.print(Arrays.toString(strings));
        for (int j = strings.length - 1; j >= 0; j--) {
            print(strings[j]);
        }

        String fio = "Ivanov Egor Olegovich";
        String result;
        String [] fio_array = fio.split(" "); // pod stroki
        System.out.println(Arrays.toString(fio_array));
        result = fio_array[0]+' '+fio_array[1].charAt(0)+'.'+fio_array[2].charAt(0);
        System.out.println(result);


        System.out.println();
        String str1 = ":)";
        str1 += "_";
        print(str1.repeat(5));
        System.out.println();
        //System.out.print(str1.getBytes());
        String str2 = "Sadik";
        System.out.println(str2.toUpperCase().charAt(str2.length() - 1));
        print(str2.repeat(5)); // povtoryet
        System.out.println();
        print(str2.substring(1, 4));  // vyrez
        print(str2.replace('S', 'C')); // zamenity
        String[] lines = str2.split(" ");
        System.out.print(str2);


        System.out.println();
        if (str1.contains(":)")) {
            System.out.print("true");
        }
        if (str1.equals(":)")) System.out.print("true");
        else System.out.print("false");

        System.out.println(Integer.MAX_VALUE);
        Integer.parseInt("12345"); // v chislo




    }static public void print (String s){
        System.out.print(s);
    }
}
