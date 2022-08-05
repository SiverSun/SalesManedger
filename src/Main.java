public class Main {
    public static void main(String[] args) {
        int[] sales = {2, 7, 5, 6};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println(salesManager.max());

    }
}
