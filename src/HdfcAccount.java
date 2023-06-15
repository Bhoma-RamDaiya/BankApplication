import java.util.UUID;

public class HdfcAccount implements BankAccountInterface{
   private String Name ;
    private String accountNo ; //random and unique no. with the help of uuid
    private double balance ;
    private String password;
    final double rateOfIntrest = 6.1;
//    default constructor
    public HdfcAccount() {

    }
    //    all parameter constructor
    public HdfcAccount(String name,  double balance, String password) {
        Name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your current balance is :-   "+ this.balance;
        }
        return "Incorrect password Please reEnter Password";
    }

    @Override
    public double addMoney(double amount) {
        this.balance += amount ;
        return balance ;
    }

    @Override
    public String withDrawMoney(String password, double amount) {
        if(this.password.equals(password)){
            if(this.balance>=amount){
                this.balance -= amount ;
                return "your Amount has been withdrawn and remaining balance is :- " + balance;
            } else{
                return "insufficient balance" ;
            }
        }
        return "Incorrect password";
    }

    @Override
    public String changePasword(String newPassword, String oldPassword) {
        if(oldPassword.equals(password)){
            this.password = newPassword ;
            return "Congratulations! your password has been updated" ;
        }
        return "you entered incorrect password plz re-enter your correct password";
    }

    @Override
    public double calculateIntrest(int years) {
        return(this.balance*years*rateOfIntrest)/100 ;
    }
}
