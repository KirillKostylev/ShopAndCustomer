package application;

import customer.Customer;
import goods.Food;
import goods.Tool;
import goods.Toy;
import shop.Shop;

public class Main {


    public static void main(String[] args) {
        Shop builderShop = new Shop();
        Shop productsShop = new Shop();
        Shop childShop = new Shop();
        Food food = new Food("Bread", 25);
        productsShop.add(food);
        Customer customer = new Customer("Vasya",100);
        System.out.println(customer);
        productsShop.buy(customer, food);
        productsShop.buy(customer, new Food("milk",17));
        builderShop.buy(customer, new Tool("pila",50));
        childShop.buy(customer, new Toy("game",7));
        System.out.println(customer);
    }
}
