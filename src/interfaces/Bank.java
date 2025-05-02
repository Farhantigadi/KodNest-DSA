package interfaces;

interface BankService {
    public void deposit(double amount);
    public void withdraw(double amount);
    public double checkBalance();
    public void transfer(double amount, String toAccount);
}

class CitiBank implements BankService {
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("CitiBank: Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("CitiBank: Withdrawn $" + amount);
        }
        else {
            System.out.println("CitiBank: Insufficient funds");
        }
    }

    public double checkBalance() {
        System.out.println("CitiBank: Current balance is $" + balance);
        return balance;
    }

    public void transfer(double amount, String toAccount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("CitiBank: Transferred $" + amount + " to " + toAccount);
        } else {
            System.out.println("CitiBank: Insufficient funds for transfer");
        }
    }
}

class ChaseBank implements BankService {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("ChaseBank: Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("ChaseBank: Withdrawn $" + amount);
        } else {
            System.out.println("ChaseBank: Insufficient funds");
        }
    }

    public double checkBalance() {
        System.out.println("ChaseBank: Current balance is $" + balance);
        return balance;
    }

    public void transfer(double amount, String toAccount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("ChaseBank: Transferred $" + amount + " to " + toAccount);
        } else {
            System.out.println("ChaseBank: Insufficient funds for transfer");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        BankService citiBank = new CitiBank();
        BankService chaseBank = new ChaseBank();
        testBankOperations(citiBank, 500, 300, 100, "12345ABC");
        testBankOperations(chaseBank, 500, 300, 100, "12345DEF");
    }

    public static void testBankOperations(BankService bank, double deposit, double withdraw, double transfer, String transferTo) {
        bank.deposit(deposit);
        bank.withdraw(withdraw);
        bank.checkBalance();
        bank.transfer(transfer, transferTo);
    }
}
