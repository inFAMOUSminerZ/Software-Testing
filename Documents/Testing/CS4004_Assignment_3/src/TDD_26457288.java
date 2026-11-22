import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TDD_26457288 {

    // Iteration 1
    @Test
    public void methodTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        Bank.createAccount(67);
    }

    // Iteration 2
    @Test
    public void accountTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        Bank.createAccount(67, 10.00);
        assertEquals(10.00, Bank.initBalance);
    }

    // Iteration 3
    @Test
    public void negativeTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        assertThrows(IllegalArgumentException.class, () -> Bank.createAccount(67, -100.0));
    }

    // Iteration 4
    @Test
    public void duplicateAccountTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        // creates initial account with initBalance of 10.
        Bank.createAccount(67, 10.0);
        // creates another account with the same id and a different initial balance.
        assertThrows(IllegalArgumentException.class, () -> Bank.createAccount(67, 20.0));
    }

    // Iteration 5
    @Test
    public void zeroInitialBalanceTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        assertThrows(IllegalArgumentException.class, () -> Bank.createAccount(67, 0.0));
    }

    // Iteration 6
    @Test
    public void depositTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        Bank.createAccount(67, 10.0);
        Bank.deposit(67, 5.0);
        assertEquals(15.0, Bank.initBalance);
    }

    // Iteration 7
    @Test
    public void depositNegativeTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        Bank.createAccount(67, 10.0);
        assertThrows(IllegalArgumentException.class, () -> Bank.deposit(67, -5.0));
    }

    @Test
    public void withdrawTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        Bank.createAccount(67, 10.0);
        Bank.withdraw(67, 5.0);
        assertEquals(5.0, Bank.initBalance);
    }

    @Test
    public void withdrawNegativeTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        Bank.createAccount(67, 10.0);
        assertThrows(IllegalArgumentException.class, () -> Bank.withdraw(67, -5.0));
    }

    @Test
    public void overdraftTest() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        Bank.createAccount(67, 10.0);
        assertThrows(IllegalArgumentException.class, () -> Bank.withdraw(67, 50.0));
    }

    @Test
    public void getCredit_afterOpen_returnsStartingCredit() {
        BankAccountManagementSystem_26457288 Bank = new BankAccountManagementSystem_26457288();
        Bank.createAccount(67, 10.0);
        assertEquals(10.0, Bank.getBalance(67));
    }
}