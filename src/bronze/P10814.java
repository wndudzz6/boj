package bronze;

import java.util.*;

//나이순 정렬 - Map, TreeMap 시도 했다가 덮어씌워짐+순서 이슈
//List를 사용하는게 더 좋다. + Person이라는 내부 클래스를 사용하는 것을 생각 못함.
public class P10814 {

    static class Person {
        int age;
        String name;
        int index;

        Person(int age, String name, int index){
            this.age = age;
            this.name = name;
            this.index = index;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Person(sc.nextInt(), sc.next(), i));
        }
        sc.close();
        list.sort(Comparator.comparingInt((Person p) -> p.age)
                .thenComparingInt((Person p) -> p.index));
        for (Person person : list) {
            System.out.println(person.age+" "+person.name);
        }
    }
}
