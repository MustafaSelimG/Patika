import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.MyList();
        System.out.println("List Size => "+list.getSize());
        System.out.println("List Capacity => "+list.getSize());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("List Size => "+list.getSize());
        System.out.println("List Capacity => "+list.getSize());
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);
        System.out.println("List Size => "+list.getSize());
        System.out.println("List Capacity => "+list.getSize());

        System.out.println("---------------------------------");

        System.out.println("2. index value => " + list.get(2));
        list.remove(2);
        list.add(40);
        list.set(0, 100);
        System.out.println("2. index value => " + list.get(2));
        System.out.println(list.toString());

        System.out.println("---------------------------------");


        list.clear();
        System.out.println("List => " + (list.isEmpty() ? "Empty" : "Full"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("List => " + (list.isEmpty() ? "Empty" : "Full"));

        System.out.println("Index => " + list.indexOf(20));

        System.out.println("Index =>" + list.indexOf(100));

        System.out.println("Index => " + list.lastIndexOf(20));

        int[] array = list.toArray();
        System.out.println("First element on the array => " + array[0]);

        int[] sublist = list.sublist(0, 3);
        System.out.println(Arrays.toString(sublist));

        System.out.println("My List contains 20 => " + list.contains(20));
        System.out.println("My List contains 120 => " + list.contains(120));

        list.clear();
        System.out.println(list.toString());

    }
}
