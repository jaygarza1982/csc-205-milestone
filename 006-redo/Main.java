import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
            Lists of past jobs and proposed jobs can be
            represented by the same object, since both objects
            have the same property types
            and can be used differently to represent the same thing.
            Both have an int, two strings, date, and a double
        */

        ArrayList<Customer> pastJobs = new ArrayList<>();
        ArrayList<Customer> proposedJobs = new ArrayList<>();

        // Create customers
        Customer c0 = new Customer(543);
        Customer c1 = new Customer(673);
        Customer c2 = new Customer(75);
        Customer c3 = new Customer(1245);
        Customer c4 = new Customer(67764);
        Customer c5 = new Customer(43);
        Customer c6 = new Customer(3);
        Customer c7 = new Customer(54);

        // Add past jobs
        pastJobs.add(c2);
        pastJobs.add(c4);
        pastJobs.add(c5);
        pastJobs.add(c7);

        // Add proposed jobs
        proposedJobs.add(c1);
        proposedJobs.add(c0);
        proposedJobs.add(c3);
        proposedJobs.add(c6);

        // Add all jobs to one list
        ArrayList<Customer> allJobs = new ArrayList<>();
        allJobs.addAll(pastJobs);
        allJobs.addAll(proposedJobs);

        // Sort the list
        Collections.sort(allJobs);

        // Print all customer numbers
        for (var c : allJobs) {
            System.out.println(c.no);
        }
    }
}
