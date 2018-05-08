package goods;

public class Toy extends Good {
    public Toy(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
