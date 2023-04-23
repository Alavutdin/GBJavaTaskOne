/*Урок 2. Почему вы не можете не использовать API
Написать метод принимающий строку, ищущий в ней основание и степень После этого расчитывающий результат и выводящий в консоль в консоль строку параметра + ответ. Пример строки: "Основание -12б степень 7, результат". Попробовать с разными входящими строками.
Сравнить скорость работы реплейса классов String и StringBuilder.*/
public class Task2 {
    public static void main(String[] args) {
        //long begin = System.currentTimeMillis();
        System.out.println(parse_string("Основание -12, степень7, результат"));
        System.out.println(parse_stringBuilder("Основание -10, степень9, результат"));
        //System.currentTimeMillis();
    }

    public static String parse_string(String in_string) {
        String[] strings = in_string.split(" ");
        int base = 0;
        int power = 0;
        long product = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i]=strings[i].replace(",","");
            try{
                Integer.parseInt(strings[i]);
                if (base ==0){
                    base=Integer.parseInt(strings[i]);
                }else {
                    power = Integer.parseInt(strings[i]);
                }
            }catch (NumberFormatException e){
                continue;
            }
        }
        long begin = System.currentTimeMillis();
        product = Math.round(Math.pow(base,power));
        return String.format("%s %d.", in_string, product, begin);
    }
    public static String parse_stringBuilder(String in_string) {
        StringBuilder sb = new StringBuilder();
        in_string = sb.toString();
        String[] strings= in_string.split(" ");
        int base = 0;
        int power = 0;
        long product = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i]=strings[i].replace(",","");
            try{
                Integer.parseInt(strings[i]);
                if (base ==0){
                    base=Integer.parseInt(strings[i]);
                }else {
                    power = Integer.parseInt(strings[i]);
                }
            }catch (NumberFormatException e){
                continue;
            }
        }
        long begin = System.currentTimeMillis();
        product = Math.round(Math.pow(base,power));
        return String.format("%s %d.", in_string, product, begin);
    }
}
