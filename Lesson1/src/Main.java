import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        public void doubleCheck() {
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
            if (action == 1) {
                double amount = scanner.nextDouble();
                System.out.println(amount);
            }
            int amount = scanner.nextInt();
            System.out.println(amount);
        }
    }