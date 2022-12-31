public class Basket {

    private static int count = 0;
    private String items = "";
    private static int totalPrice = 0;
    private static int totalCount = 0;
    // double for weight
    private double totalWeight = 0;
    private int limit;

    public Basket() {
        increaseCount(1);
        items = "List of products:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
    }

    public static int getCount() {
        return count;
    }

    public static int avgBasketPrice() {
        return totalPrice / count;
    }

    public static int avgItemPrice() {
        return totalPrice / totalCount;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }
    public void add(String name, int price, int count) {
        add(name, price, count, 0);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occurred :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + "x - " + price + " - " + weight + "g";
        totalPrice = totalPrice + count * price;
        totalCount = totalCount + count;
        totalWeight = totalWeight + count * weight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            // Info about total price and weight!
            System.out.println("Total price of your basket is: " + totalPrice + "$");
            System.out.println("Total weight of your basket is: " + totalWeight + "g");
        }
    }
}
