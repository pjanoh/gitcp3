public class Main {
    public static void main(String[] args) {
        int[] sales = { 10, 2, 333, 44 };
        SalesManager manager = new SalesManager(sales);
        System.out.println("Макс: " + manager.max());
    }
}
