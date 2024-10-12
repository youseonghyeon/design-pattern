package adapter;

// 기존 인터페이스 (Target)
interface Account {
    String getName();

    double getBalance();
}

// Adaptee (호환되지 않는 기존 클래스)
class CustomAccount {
    private String accountName;
    private double accountBalance;

    public CustomAccount(String accountName, double accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public String getCustomName() {
        return this.accountName;
    }

    public double getCustomBalance() {
        return this.accountBalance;
    }
}

// Adapter 클래스 (Account 인터페이스에 맞게 CustomAccount를 변환)
class CustomAccountAdapter implements Account {
    private CustomAccount customAccount;

    public CustomAccountAdapter(CustomAccount customAccount) {
        this.customAccount = customAccount;
    }

    @Override
    public String getName() {
        // CustomAccount의 getCustomName()을 Account의 getName()으로 변환
        return customAccount.getCustomName();
    }

    @Override
    public double getBalance() {
        // CustomAccount의 getCustomBalance()을 Account의 getBalance()로 변환
        return customAccount.getCustomBalance();
    }
}

// 기존 클라이언트 코드
public class AdapterPatternExample {
    public static void main(String[] args) {
        // CustomAccount 인스턴스 생성 (호환되지 않는 클래스)
        CustomAccount customAccount = new CustomAccount("John Doe", 1500.0);

        // Adapter를 사용하여 CustomAccount를 Account 인터페이스에 맞춤
        Account accountAdapter = new CustomAccountAdapter(customAccount);

        // Account 인터페이스를 사용하는 클라이언트 코드
        System.out.println("Account Name: " + accountAdapter.getName()); // "John Doe"
        System.out.println("Account Balance: " + accountAdapter.getBalance()); // 1500.0
    }
}
