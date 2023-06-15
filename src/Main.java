import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HdfcAccount hdfcAccount = new HdfcAccount("Ram Daiya" , 5000 ,"Bhoma@123");
        hdfcAccount.addMoney(5500);
        System.out.println(hdfcAccount.fetchBalance("Bhoma@23"));
        System.out.println(hdfcAccount.fetchBalance("Bhoma@123"));
        System.out.println(hdfcAccount.getAccountNo());
        System.out.println(hdfcAccount.changePasword("Bhomsa2123" , "Bhoma@123"));
        System.out.println(hdfcAccount.withDrawMoney("Bhomsa2123", 3000));
        System.out.println(hdfcAccount.withDrawMoney("Bhomsa2123", 7510));
        System.out.println("enter the Years");
        int n = sc.nextInt();
        System.out.println("intrest of "+ n +" years is :-  " + hdfcAccount.calculateIntrest(n)
);
    }
}