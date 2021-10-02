package houserent.domain;

public class House {
    private int num;
    private String name;
    private String phone;
    private String address;
    private double rentcost;
    private String state;

    public House(int num, String name, String phone, String address, double rentcost, String state) {
        this.num = num;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rentcost = rentcost;
        this.state = state;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRentcost() {
        return rentcost;
    }

    public void setRentcost(double rentcost) {
        this.rentcost = rentcost;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return
                 num +
                "\t" + name +
                "\t" + phone +
                "\t\t" + address +
                "\t" + rentcost +
                "\t" + state;
    }
}
