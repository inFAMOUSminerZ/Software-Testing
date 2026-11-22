import java.util.HashSet;
import java.util.Set;

public class BankAccountManagementSystem_26457288{

    Set<Integer> accountIds = new HashSet<>();

    int id;
    double initBalance;

    public void createAccount(int id){

    }

    public void createAccount(int id, double initBalance){
        if (initBalance <= 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        if (accountIds.contains(id)) {
            throw new IllegalArgumentException("Account already exists.");
        }

        accountIds.add(id);

        this.id = id;
        this.initBalance = initBalance;
    }

    public void deposit(int id, double amount){

        // here we check if the amount is negative or zero and if it is, throw an error with a message.
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }

        this.initBalance = this.initBalance + amount;
    }

    public void withdraw(int id, double amount){

        // here we check if the amount is negative or zero and if it is, throw an error with a message.
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > initBalance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }

        this.initBalance = this.initBalance - amount;
    }

    public double getBalance(int id){
        return initBalance;
    }
}