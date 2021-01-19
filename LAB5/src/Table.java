public class Table {
    private static void printTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j < 10) {
                    System.out.print(" "); //to make the table even
                }
                System.out.print(i * j + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Table.printTable(7);
    }
}
