class Bank_Account {
    int accountNo;
    String userName;
    String email;
    String accountType;
    int accountBlance;
    public void getAccountDetails(int accountNo,String userName, String email,String accountType,int accountBlance){
       this.accountNo = accountNo;
       this.userName = userName;
       this.email = email;
       this.accountType = accountType;
       this.accountBlance = accountBlance;
    }
    public void displayAccountDetails(){
        System.out.println("accountNo="+accountNo+"userName="+userName+"email="+email+"accountType="+accountType+"accountBlance="+accountBlance);
    }
}
public class Pra3 {
    public static void main(String[] args) {
        Bank_Account input = new Bank_Account();
        input.accountNo = 12;
    }
}