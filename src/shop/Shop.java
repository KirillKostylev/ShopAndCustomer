package shop;

import customer.Customer;
import goods.Good;

import java.util.ArrayList;
import java.util.List;

public class Shop<G extends Good> {
    private List<G> goods = new ArrayList<>();

    public void add(G good) {
        goods.add(good);
    }

    public void buy(Customer customer, Good good) {
        try {
            if (customer.getMoney() >= good.getPrice()) {
                customer.bag.add(good);
                customer.setMoney(customer.getMoney() - good.getPrice());
                goods.remove(good);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Недостаточно средств!");
        }
    }

    @Override
    public String toString() {
        return "shop.shop{" +
                "goods=" + goods +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop<?> shop = (Shop<?>) o;

        return goods != null ? goods.equals(shop.goods) : shop.goods == null;
    }

    @Override
    public int hashCode() {
        return goods != null ? goods.hashCode() : 0;
    }
}
