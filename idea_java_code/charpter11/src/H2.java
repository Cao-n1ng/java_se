/**
 * @author 曹宁
 * @version 1.0
 */
public class H2 {
    public static void main(String[] args) {
        System.out.println(    Frock.getNextNum());
        System.out.println(    Frock.getNextNum());
        Frock frock = new Frock();
        Frock frock1 = new Frock();
        Frock frock2= new Frock();
        System.out.println(        frock.getSerialNumber());
        System.out.println(        frock1.getSerialNumber());
        System.out.println(        frock2.getSerialNumber());

    }
}
class Frock{
    private  static int currentNum =100000;
    public static int getNextNum(){
        currentNum+=100;
        return currentNum;
    }
    int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }
    Frock(){
        serialNumber=getNextNum();
    }
}
