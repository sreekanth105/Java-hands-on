package ps_6;

class NegativeAmount extends Exception {
    public NegativeAmount() {
        super("NegativeAmount");
    }
}

class LowBalanceException extends Exception {
    public LowBalanceException() {
        super("LowBalance");
    }
}

public class BankAccount {
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    public BankAccount(int accNo, String custName, String accType, float initialBalance) throws NegativeAmount, LowBalanceException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        
        if (initialBalance < 0) {
            throw new NegativeAmount();
        }

        if (accType.equals("Saving") && initialBalance < 1000) {
            throw new LowBalanceException();
        }

        if (accType.equals("Current") && initialBalance < 5000) {
            throw new LowBalanceException();
        }

        this.balance = initialBalance;
    }

    public void deposit(float amt) throws NegativeAmount {
        if (amt < 0) {
            throw new NegativeAmount();
        }
        balance += amt;
    }

    public float getBalance() throws LowBalanceException {
        if (balance < 0) {
            throw new LowBalanceException();
        }
        return balance;
    }

    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount(123, "John", "Saving", 900);
            account1.deposit(-900);
        } catch (NegativeAmount | LowBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            BankAccount account2 = new BankAccount(123, "John", "Saving", -900);
        } catch (NegativeAmount | LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

