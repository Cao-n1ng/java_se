package houserent.service;

import houserent.domain.House;

import javax.swing.plaf.PanelUI;
import java.security.PublicKey;
import java.util.List;

public class HouseService {
    private int number;//已有房屋数量
    private int id = 1;//已经分配的房屋编号 从1开始编号
    House[] house;

    public HouseService(int size) {
        house = new House[size];
        house[0] = new House(id, "jack", "123", "江西师范", 1000, "已出租");
        number++;
        id++;
    }

    public House[] list() {
        return house;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void addhouse(String name, String phone, String address, double rentcost, String state) {
        house[number++] = new House(id, name, phone, address, rentcost, state);
        id++;
    }

    public boolean delhouse(int id) {
        if (this.id <= id) {
            return false;
        }
        for (int i = 0; i < number; i++) {
            if (house[i].getNum() == id) {//找到id所在的数组位置
                for (int j = i; j < number - 1; j++) {
                    house[j] = house[j + 1];
                }
                house[--number] = null;
                return true;
            }
        }
        return false;
    }

    //老师的删除处理 把各个单元的功能分开，每一部分代码块只去实现一小部分功能。
    //先找到下标——————》再去对下标删除，请分开来写
    /*//应当先找到要删除的房屋信息对应的下标
    //老韩强调，一定要搞清楚 下标和房屋的编号不是一回事
    int index = -1;
        for(int i = 0; i < houseNums; i++) {
        if(delId == houses[i].getId()) {//要删除的房屋(id),是数组下标为i的元素
            index = i;//就使用index记录i
        }
    }

        if(index == -1) {//说明delId在数组中不存在(有点绕..)
        return false;
    }
    //如果找到, 这里需要小伙伴动脑筋,有点难.
    //老师思路分析:
        for(int i = index; i < houseNums - 1; i++) {
        houses[i] = houses[i+1];
    }
    //把当有存在的房屋信息的最后一个 设置null
    houses[--houseNums] = null;
        return true;*/
    public int search(int id) {
        int i = -1;
        if (id >= this.id || id <= 0) ;
        else {
            for (int j = 0; j < house.length; j++) {
                if (house[j].getNum() == id) {
                    i = j;
                    break;
                }
            }
        }
        return i;
    }

    //这里的业务逻辑怎么写好？是一个return还是统一出口？//韩顺平的编程风格就是多个return
    public boolean write(int id, String name, String phone, String address, double rentcost, String state) {
        if (!name.equals("-1") ) house[id].setName(name);
        if (!phone .equals("-1") ) house[id].setPhone(phone);
        if (! address .equals("-1") ) house[id].setAddress(address);
        if (rentcost != -1) house[id].setRentcost(rentcost);
        if (!state .equals("-1") ) house[id].setState(state);
        return true;

    }
}
