package goods;

abstract public class Good {
    protected String name;
    protected int price;

    public Good(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "goods.Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Good good = (Good) o;

        if (price != good.price) return false;
        return name != null ? name.equals(good.name) : good.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
