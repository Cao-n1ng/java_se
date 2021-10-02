public class H1 {
    public static void main(String[] args) {
        Person[] p = {new Person("曹宁", 21, "软件工程师"), new Person("小乐", 23, "教授"), new Person("林", 24, "CTO")};
        Person temp;
        for (int i = 0; i < p.length - 1; i++) {
            for (int j = 0; j < p.length - 1 - i; j++) {
                if (p[j].age < p[j + 1].age) {
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i <p.length ; i++) {
            System.out.println(p[i]);
        }

    }
}

class Person {
    String name, job;
    int age;

    public Person(String name, int age, String job) {
        this.name = name;
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                '}';
    }
}