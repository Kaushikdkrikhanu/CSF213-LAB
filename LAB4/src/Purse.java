public class Purse {
    private int dirham;
    private int fiftyFills;
    private int twentyFiveFills;
    private int total;

    public Purse(int dirhams, int fiftyFills, int twentyFiveFills) {
        this.dirham = dirhams;
        this.fiftyFills = fiftyFills;
        this.twentyFiveFills = twentyFiveFills;
    }

    public void add_dirham(int a) {
        dirham = dirham + a;
    }

    public void remove_dirham(int a) {
        dirham = dirham - a;
    }

    public void add_fiftyFills(int a) {
        fiftyFills = fiftyFills + a;
    }

    public void remove_fiftyFills(int a) {
        fiftyFills = fiftyFills - a;
    }

    public void add_twentyFiveFills(int a) {
        twentyFiveFills = twentyFiveFills + a;
    }

    public void remove_twentyFiveFills(int a) {
        twentyFiveFills = twentyFiveFills - a;
    }

    public void total_cost() {
        float cost = (float) (dirham + 0.5 * fiftyFills + 0.25 * twentyFiveFills);
        System.out.println("Total Cash = " + dirham + " dirhams " + fiftyFills + " 50fills " + twentyFiveFills + " 25fills\n" +
                "Total cash is therfore " + cost + " dirhams");
    }

    public static void main(String[] args) {
        Purse purse = new Purse(10, 1, 1);
        purse.add_dirham(10);
        purse.add_fiftyFills(10);
        purse.add_twentyFiveFills(10);
        purse.total_cost();
    }

}
