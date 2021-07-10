import java.io.*;
import java.util.*;
class Bankass
{
	
	private int accountno;
	private int accBalance;
	private int accPassword;
	static String BankName;
	
	public static String getBankName() {
		return BankName;
	}
	public static void setBankName(String bankName) {
		BankName = bankName;
	}
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public int getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(int accBalace) {
		this.accBalance = accBalace;
	}
	public int getAccPassword() {
		return accPassword;
	}
	public void setAccPassword(int accPassword) {
		this.accPassword = accPassword;
	}
	public void display()
	{
		System.out.println("BankName   ->"+BankName);
 		System.out.println("ACCOUNT NO ->"+accountno);
 		System.out.println("ACCOUNT BALANCE  ->"+accBalance);
 		System.out.println("ACCOUNT PASSWORD  ->"+accPassword);
 		
	}
	
	
	}
public class Assignment5
{
     	public static void main(String args[])
     	{
     		Bankass.setBankName("SBI");
     		Scanner sc=new Scanner(System.in);
     		int accno=sc.nextInt();
     		int balance=sc.nextInt();
     		int password=sc.nextInt();
     		Bankass b=new Bankass();
     		b.setAccountno(accno);
     		b.setAccBalance(balance);
     		b.setAccPassword(password);
     		b.display();
     		sc.close();
     		
     	}
}
