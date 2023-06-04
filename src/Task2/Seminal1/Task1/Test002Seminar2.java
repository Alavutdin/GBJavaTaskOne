package Task2.Seminal1.Task1;

public class Test002Seminar2 {
    public static void main(String[] args) {
        // Основание -5, степень 3, результат равен
        // Основание 127, степень 2, результат равен

        System.out.println(parse_string("Основание -5, степень 3, результат равен"));
    }
    public static String parse_string(String in_string){
        String [] strings = in_string.split(" "); // split - позволяет разбить строку на подстроки по определенному разделителю
        int base = 0;
        int power =0;
        long product = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i]=strings[i].replace(",","");
            try {
                Integer.parseInt(strings[i]);
                // Integer — это класс-обертка примитивного типа int.
                // Внутри данного класса содержится единственное поле типа int.
                // ... static Integer valueOf(int i) — возвращает Integer значением которого является i
                // Метод parseInt () – в Java используется для получения примитивного типа данных определенной строки,
                // другими словами– преобразует строку в число.
                if (base==0) {
                    base = Integer.parseInt(strings[i]);
                }else {
                    power = Integer.parseInt(strings[i]);
                }

            }catch (NumberFormatException e){
                continue;
            }
        }
        product = (int)Math.pow(base, power);
        // return String.format("%s %d.", in_string, product);
        return in_string + " " + String.valueOf(product);

//        for (int i = 0; i < strings.length; i++) {
//            System.out.print(strings[i]);
//       System.out.println(base+power);

    }
}
