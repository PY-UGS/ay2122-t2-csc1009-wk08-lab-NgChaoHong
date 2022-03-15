package Lab8;
import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(depositAmount, "123456");
        try {
            System.out.println("Please enter your withdrawal amount: ");
            double amount = input.nextDouble();
            checkingAccount.withdraw(amount);
            System.out.println("The balance after withdrawal is: $" + checkingAccount.getBalance()); 
        } catch (InsufficientFundsException e) {
            double lackof = checkingAccount.getBalance() - e.getAmount();
            System.out.println("Error: Your account is short by: $" + Math.abs(lackof));
        }
        input.close();
    }
    
}
