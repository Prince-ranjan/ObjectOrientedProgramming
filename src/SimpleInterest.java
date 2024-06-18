public class SimpleInterest {
    int rate;
    int principal;
    int year;

    public SimpleInterest(int rate, int principal, int year) {
        this.rate = rate;
        this.principal = principal;
        this.year = year;
    }

    public int calculateInterest() {
        int interest = (rate * principal * year ) / 100;
        return  interest;
    }

    public static void main(String[] args) {
        SimpleInterest simleInterest  = new SimpleInterest(4, 1000,2);

        int interest = simleInterest.calculateInterest();

        System.out.println("simple interest = " + interest);

    }
}
