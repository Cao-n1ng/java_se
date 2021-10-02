import java.lang.invoke.VarHandle;

public class H03 {
    public static void main(String[] args) {
        Teacher teacher = new Professor("曹宁",21,"高级",9000);
        teacher.introduce();
    }
}
class Teacher{
    String name;
    int age;
    String post;
    double salary;
    void  introduce(){}
}
class Professor extends Teacher{

    void  introduce(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", salary=" + salary*1.3 +
                '}';
    }

    public Professor(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
}