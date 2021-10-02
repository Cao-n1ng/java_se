/**
 * @author 曹宁
 * @version 1.0
 */
public class H4 {
    public static void main(String[] args) {
    new Cellphone().testWork();
    }
}
interface Computer{
    void work();
}
class Cellphone implements Computer{
    @Override
    public void work() {

    }
    void testWork()
    {
        work();
    }
}