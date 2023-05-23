import java.io.File;
import java.util.Locale;
import java.util.logging.Logger;

import static java.lang.System.currentTimeMillis;

public class Test002Lecture {
    public static void main(String[] args) {
        var a = currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            sb.append("+");
            //System.out.print(sb+" ");

        }//1 милисекунд
        System.out.println(System.currentTimeMillis()-a);
        var b = currentTimeMillis();
        String st = "";
        for (int i = 0; i < 1000; i++) {
            st+="+";

            //System.out.print(st+" ");
        }// 12 секунды
        System.out.println(System.currentTimeMillis()-b);
        String str1="Hello";
        /*str1.concat();  // Объединение строк
        str1.valueOf();  // Преобразует Object в строковое предоставление(завязан на toString())
        str1.join();  // Объединяет набор строк в одну с учетом разделителя
        str1.charAt();  // Получение символа по индексу
        str1.indexOf();  // Первый индекс вхождения подстроки
        str1.lastIndexOf();  // Последний индекс вхождения подстроки
        str1.startsWith()/endsWith();  // определяет, начинается/закончивается ли строка с подстроками
        str1.replace();  // замена одной подстроки на другую
        str1.trim();  // Удаляет начальные и конечные проблемы
        str1.substring();  // возвращает подстроку, см.аргументы
        str1.toLowerCase()/toUpperCase();  // возвращает новую строку в нижнем/верхнем регистре
        str1.compareTo();  // сравнивает две строки
        str1.equals();  //  сравнивает строки с учетом регистра
        str1.equalsIgnoreCase();  //  сравнивает строки без учета регистра
        str1.regionMatches();  //  сравнивает подстроки в строках
        str1.split();  // позволяет разбить строку на подстроки по определенному разделителю*/

        String [] name = {"W","o","r","l","d"};
        String sk = "World Hello";
        System.out.println(sk.toLowerCase()); // world hello
        System.out.println(String.join("",name)); // World

        // Работа с файловой системой
        // File <имя> = new File(<полный путь к файлу>);
        File f1 = new File("file.txt");
        File f2 = new File("File f1 = new File(\"\");");
        // Что мы предпочитаем?

        // Ошибки с файлами -1. Файл пустой 2. Не правильный путь
         try {
             //Код, в котором может появится ошибка
             String pathProject = System.getProperty("user.dir");
             String pathFile = pathProject.concat("/file.txt");
             File f3 = new File(pathFile);
             System.out.println("try");
         } catch (Exception e){
             // Обработка, если ошибка случилось
             System.out.println("catch");
         }
         finally {
             //Код, который выполняется в любом случае
             System.out.println("finally");
         }

         /*length(); // возвращает размер файла в байтах
         lastModified(); // возвращает время последнего изменения файла или каталога
         list(); // возвращает массив файлов и подкаталогов, которые находятся в каталоге
         listFiles(); // возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
         mkdir(); // создает новый каталлог
         renameTo(File dest); // переименовывает файл или каталог*/

        // Бинарные файлы

        // Логирование. Использование (журналивание) пример роутер
        // Logger logger = Logger.getLogger();








    }
}
