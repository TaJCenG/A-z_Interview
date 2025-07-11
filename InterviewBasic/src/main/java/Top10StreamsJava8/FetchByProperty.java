package Top10StreamsJava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchByProperty {
    public static void main(String[] args) {
        List<Student>  list = Arrays.asList(
                new Student("Taj", 21),
                new Student("Julia", 23),
                new Student("Juli", 31),
                new Student("inda", 25));
        System.out.println(list.stream().filter(s -> s.getAge() > 30).collect(Collectors.toList()));
        System.out.println(list.stream().collect(Collectors.groupingBy(Student::getName)));
        System.out.println(list.stream().collect(Collectors.groupingBy(Student::getAge)));
    }

    static class Student {
        private String name;
        private int age;
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "Student [name=" + name + ", age=" + age + "]";
        }
    }
}
