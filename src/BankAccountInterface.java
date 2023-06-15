public interface BankAccountInterface {
     String fetchBalance(String password);
     double addMoney(double amount);
     String withDrawMoney(String password , double amount);
     String changePasword(String newPassword , String oldPassword);
     double calculateIntrest(int years);
}
