public class Arithmetic {
    private int a;
    private int b;

    public Arithmetic (int first, int second) {
        this.a = first;
        this.b = second;
        System.out.println("Summation of two numbers is: " + sum());
        System.out.println("Multiplication of two numbers is: " + multyplication());
        System.out.println("Max of two numbers is: " + max());
        System.out.println("Min of two numbers is: " + min());
    }

    public int sum() {
        int sum = a + b;
        return sum;
    }

    public int multyplication() {
        int multy = a * b;
        return multy;
    }

    public int max() {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }

    public int min() {
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}
