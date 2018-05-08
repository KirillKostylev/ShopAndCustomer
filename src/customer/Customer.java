package customer;

import goods.Good;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    public List<Good> bag = new ArrayList<>();
    private int money;

    public Customer(String name, int money) {
    this.name = name;
    this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "customer.customer{" +
                "name='" + name + '\'' +
                ", bag=" + bag +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (money != customer.money) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        return bag != null ? bag.equals(customer.bag) : customer.bag == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (bag != null ? bag.hashCode() : 0);
        result = 31 * result + money;
        return result;
    }
}
