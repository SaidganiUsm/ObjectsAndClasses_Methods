public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 80,2);
        basket.add("Sult", 100);

        Basket basket1 = new Basket();
        basket1.add("Bread", 250, 5);

        Basket basket2 = new Basket();
        basket2.add("Cola", 150);

        System.out.println(Basket.getTotalPrice());
        System.out.println(Basket.getCount());
        System.out.println(Basket.getTotalCount());
        System.out.println(Basket.avgItemPrice());
        System.out.println(Basket.avgBasketPrice());
    }
}
