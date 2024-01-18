package week2.day4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class UsaClassi {
    public static long generateRandomId(long min, long max) {
        return (long) Math.floor(Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("Luigi", 1);
        Customer c2 = new Customer("Mario", 1);
        Customer c3 = new Customer("Federica", 1);
        Customer c4 = new Customer("Eleonora", 1);
        Order o1 = new Order(c1);
        Order o2 = new Order(c1);
        Order o3 = new Order(c2);
        Order o4 = new Order(c3);
        Order o5 = new Order(c4);
        o1.addProduct(new Product("calendario", "Calendari", 10.0));
        o1.addProduct(new Product("Colla", "Colla", 2.0));
        Map<Customer, List<Order>> m = Stream.of(o1, o2, o3, o4, o5).collect(Collectors.groupingBy(o -> o.getCustomer()));
        System.out.println(m);
    }


}
