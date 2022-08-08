public class Main {
    public static void main(String[] args) {
        long[] sales = {2, 7, 5, 6};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());
        System.out.println(salesManager.average());

    }
}
