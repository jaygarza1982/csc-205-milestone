import java.util.Date;

public class Customer implements Comparable<Customer> {
    int no;
    String name, address;
    Date jobDate;
    double jobPrice;

    public Customer(int no) {
        this.no = no;
    }
    
    @Override
    public int compareTo(Customer c) {
        return this.no - c.no;
    }
}
