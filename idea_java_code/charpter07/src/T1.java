import java.sql.SQLOutput;

public class T1 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.age);
    }
}
class A{
     A() {
        System.out.println("A构造");
    }
}
class B extends A{
     B() {
        System.out.println("B构造");
    }
     int age=12;

}
class C extends B{
    private int x;
    C() {
        System.out.println("C构造");
     }
}

