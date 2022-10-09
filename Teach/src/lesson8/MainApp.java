package lesson8;

import javax.swing.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Employee{
    private String name;
    public int salary;
    private int age;

    public Employee(String name, int salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}

public class MainApp {
    public static void main(String[] args) {
        int avg = 0;
        List<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Egor", 1, 21),
                new Employee("Igor", 1, 25),
                new Employee("Igor1", 1, 25),
                new Employee("Igor2",1 , 25),
                new Employee("Igor3", 1, 12),
                new Employee("Igor4",1 , 56),
                new Employee("Igor5",1 , 64),
                new Employee("Igor6", 1, 23),
                new Employee("Igor7", 1, 25355),
                new Employee("Igor8", 1, 1242),
                new Employee("Igor9", 1, 535)
                ));

        List<Integer> listE = employees.stream()
                .map((Function<Employee, Integer>) employee -> employee.salary)
                .collect(Collectors.toList());

        System.out.println(listE);
        System.out.println("Average salary");
        for(int o : listE){
            avg =+ listE.get(o);
        }
        System.out.println(avg);

        final int N = 3;
        List<String> employeeList = employees.stream()
                .sorted((o1, o2) -> o1.getAge() - o2.getAge())
                .map((Function<Employee, String>) employee -> employee.getName()).limit(N).collect(Collectors.toList());
        Collections.reverse(employeeList);
        System.out.println(employeeList);
//        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
//        System.out.println(list);
//
//        List<Integer> out = list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 == 0;
//            }
//        }).collect(Collectors.toList());
//
//        System.out.println(out);
//
//        list.stream()
//                .filter((n) -> n % 2 == 0)
//                .forEach((n) -> System.out.println(n));
//
//        Stream.of("AA", "BB").map((s) -> s.length()).forEach(System.out::println);
//        Arrays.stream(new String[] {"QWE"});
//
//        Stream.of("AA12", "BB1234").map(String::length).collect(Collectors.toList()).forEach(System.out::println);
//        class User{
//            String name;
//
//            public User(String name) {
//                this.name = name;
//            }
//
//            public String getName() {
//                return name;
//            }
//        }
//
//        Stream.of("Egor", "Igor").map(s -> new User(s)).collect(Collectors.toList()).forEach(s -> System.out.println());
//
//        List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,7,8);
//        List<Integer> listInterger2 = listInteger.stream().filter(integer -> integer % 2 == 0).map(integer -> integer*integer).limit(2).collect(Collectors.toList());
//        System.out.println(listInteger);
//        System.out.println(listInterger2);




    }
}
