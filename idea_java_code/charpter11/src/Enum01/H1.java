package Enum01;

import javax.sound.midi.Soundbank;

/**
 * @author 曹宁
 * @version 1.0
 */
public class H1 {
    public static void main(String[] args) {
    Week[] week=Week.values();
    for(Week i:week){
        System.out.println(i.getName());
    }
    }
}
enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}