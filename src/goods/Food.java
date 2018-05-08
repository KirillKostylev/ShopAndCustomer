package goods;

public class Food extends Good {
    public Food(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
