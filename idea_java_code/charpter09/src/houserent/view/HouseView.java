package houserent.view;

import houserent.domain.House;
import houserent.service.HouseService;
import houserent.utility.Utility;

import javax.sound.midi.Soundbank;
import java.text.BreakIterator;
import java.util.Scanner;

//老师的if else会写完整,而不是省略
public class HouseView {
    House[] house;
    Scanner sc;
    HouseService houseService;
    int size = 10;//数组容量
    int id;
    char confirm;
    boolean del;
    boolean loop = true;

    void listhouse() {
        System.out.println("\"--------------------房屋列表---------------------------");
        System.out.println("编号\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        for (int i = 0; i < house.length; i++) {
            if (house[i] == null) break;
            System.out.println(house[i]);
        }
        System.out.println("\"-----------------房屋列表完成---------------------------");

    }

    void addhouse() {
        if (houseService.getNumber() == size) {
            System.out.println("数组已满，添加失败");
            return;
        }
        System.out.println("\"--------------------添加房屋---------------------------");
        System.out.print("姓名：");
        String name = Utility.readString(5);
        System.out.print("\n电话:");
        String phone = Utility.readString(3);
        System.out.print("\n地址:");
        String address = Utility.readString(6);
        System.out.print("\n月租:");
        double rentcost = sc.nextDouble();
        System.out.print("\n状态（未出租/已出租）:");
        String state = Utility.readString(3);
        houseService.addhouse(name, phone, address, rentcost, state);
        System.out.println("\"--------------------添加完成---------------------------");

    }

    void delhouse() {
        System.out.println("\"--------------------删除房屋---------------------------");
        System.out.print("请选择待删除房屋编号(-1退出):");
        id = Utility.readInt();
        if (id == -1)
            return;
        confirm = Utility.readConfirmSelection();
        if (confirm == 'N') return;
        //这里写不写else呢？
        del = houseService.delhouse(id);
        if (del == false) System.out.println("删除失败");
        else System.out.println("删除成功");
    }

    void search() {
        int id;
        int j = -1;
        System.out.println("请输入你要查找id:  ");
        id = Utility.readInt();
        j = houseService.search(id);
        if (j == -1)
            System.out.println("查找失败,无此id房屋");
        else {
            System.out.println(house[j]);
        }
    }

    void write() {
        System.out.println("\"--------------------修改房屋---------------------------");
        System.out.print("请选择待修改房屋编号（-1退出）:");
        int j = Utility.readInt();
        int k = houseService.search(j);
        if (k == -1) {
            System.out.println("--------------------修改失败---------------------------");
            return;
        } else {
            System.out.print("姓名(" + house[k].getName() + "):");
            String name = Utility.readString(10, "-1");
            System.out.print("电话(" + house[k].getPhone() + "):");
            String phone = Utility.readString(10, "-1");
            System.out.print("地址(" + house[k].getAddress() + "):");
            String address = Utility.readString(10, "-1");
            System.out.print("租金(" + house[k].getRentcost() + "):");
            String rentcoststr = Utility.readString(10, "-1");
            double rentcost = Double.parseDouble(rentcoststr);
            System.out.print("状态(" + house[k].getState() + "):");
            String state = Utility.readString(10, "-1");
            houseService.write(k, name, phone, address, rentcost, state);
            System.out.println("--------------------修改成功---------------------------");
        }

    }

    void exit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            System.out.println("成功退出程序");
            loop = false;
        } else System.out.println("取消退出");
    }

    public void viewmain() {
        Scanner scanner = new Scanner(System.in);
        char s;//switch选择变量
        sc = new Scanner(System.in);
        houseService = new HouseService(size);
        house = houseService.list();
        do {
            System.out.println("--------------------房屋出租系统---------------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表 ");
            System.out.println("\t\t\t6 退       出  ");
            System.out.print("\t\t\t请选择（1-6）：");
            s = Utility.readChar();
            switch (s) {
                case '1':
                    addhouse();
                    break;
                case '2':
                    search();
                    break;
                case '3':
                    delhouse();
                    break;
                case '4':
                    write();
                    break;
                case '5':
                    listhouse();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }
        } while (loop);
    }
}
