import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test002Seminar {
    public static void main(String[] args) {
    //    FileReader а = new FileReader("file.txt");
        long begin = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("World");
        begin = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            builder.append(Character.getName(i));
        }
        end=System.currentTimeMillis();
        System.out.println(end-begin);

        builder.delete(0,builder.length()/2);// Удалить половину
        builder.insert(2, .42f); //  Вставить символ
        builder.deleteCharAt(3); //  Удалить символ
        builder.reverse(); // Развернуть список
        builder.indexOf("Hel"); // Начинается строка
        builder.lastIndexOf("l"); // Вернет индекс третьей строки
        builder.replace(1,5, "235"); // Домашка (Заменить)
        builder.length(); // Сколько букв записано
        builder.charAt(0); // Возвращает символ
        System.out.println(builder.toString());

    }
}
