import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Mizael");
        list.add("Douglas");
        list.add("Carol");
        list.add("Bento");
        list.add("Clara");
        list.add(2,"marco");


        System.out.println(list.size());
        list.remove("marco");
        list.remove(1);
        for (String x :
                list) {
            System.out.println(x);
        }

        System.out.println(list.size());

        System.out.println("________________________________________________________");

        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'C');

        for (String x :
                list) {
            System.out.println(x);
        }

        System.out.println("________________________________________________________");
        System.out.println("Index Of Mizael: " + list.indexOf("Mizael"));


        System.out.println("________________________________________________________");
        System.out.println();
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
        for (String x :
                result) {
            System.out.println(x);
        }


        System.out.println("________________________________________________________");
        String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

        System.out.println(name);


    }
}