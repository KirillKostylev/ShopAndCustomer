package goods;

public class Tool extends Good {
    public Tool(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
