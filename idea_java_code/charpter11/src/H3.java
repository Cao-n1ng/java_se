/**
 * @author 曹宁
 * @version 1.0
 */
public class H3 {
}
abstract class Animal{
    abstract void shout();
}
class Cat extends Animal{
    @Override
    void shout() {
        System.out.println("小猫喵喵叫");
    }
}
