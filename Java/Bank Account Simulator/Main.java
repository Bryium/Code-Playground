import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//    Account Creation
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(name, initialBalance);
        System.out.print("\n=== Welcome, " + account.getAccountHolder() + " ===");

//        Main Programme Loop
        boolean running = true;
        while(running) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch(choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.Deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double WithdrawAmount = scanner.nextDouble();
                        account.Withdraw(WithdrawAmount);
                        break;
                    case 3:
                        System.out.println("Current Balance: " + account.getBalance());
                        break;
                    case 4:
                        running = false;
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
// programme exit
        scanner.close();
    }
}



