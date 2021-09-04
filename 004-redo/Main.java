
public class Main {
    public static void main(String[] args) {
        double currentTuition = 20000;

        for (int i = 1; i <= 20; i++) {
            String formatted = String.format("%,.2f", currentTuition);

            System.out.println("Current tuition is $" + formatted + " for year " + i);

            currentTuition *= 1.03;
        }
    }
}
