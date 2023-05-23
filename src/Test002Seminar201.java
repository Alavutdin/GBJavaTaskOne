public class Test002Seminar201 {
    public static void main(String[] args) {
        String my_str = """
                Hello my World
                Kello my girl""";

        String guery = "my";
        System.out.println(my_str);
        System.out.println(my_str.replace("my","you"));

        StringBuilder sb = new StringBuilder(my_str);
        while (sb.indexOf(guery)>0){
            sb.replace(sb.indexOf(guery),sb.indexOf(guery)+guery.length(), "you");

        }
        System.out.println();
        System.out.println(sb);
    }
}
