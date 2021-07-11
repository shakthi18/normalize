import java.util.Scanner;
import java.io.*;
class SavingsAccount
{
	
	int minimumBalance;
	SavingsAccount(int min)
	{
		minimumBalance=min;
	}
	void display()
	{
		System.out.println("MINIMUM BALANCE  "+minimumBalance);
	}
	}
class CurrentAccount
{
	int overdraftLimitAmount;
	CurrentAccount(int limit)
	{
		overdraftLimitAmount=limit;
	}
	void display()
	{
		System.out.println("OVER DRIFT VALUE  "+overdraftLimitAmount);
		
	}
}


class Day2Assignment1
{
	 public static void main(String args[])
	 {
		 Bankass b =new Bankass();
		 Scanner sc=new Scanner(System.in);
  		int accno=sc.nextInt();
  		int balance=sc.nextInt();
  		int password=sc.nextInt();
  		//Bankass b=new Bankass();
  		b.setAccountno(accno);
  		b.setAccBalance(balance);
  		b.setAccPassword(password);
  		b.display();
  		SavingsAccount s=new SavingsAccount(sc.nextInt());
  		CurrentAccount c=new CurrentAccount(sc.nextInt());
  		s.display();
  		c.display();
  		sc.close();
  		
  		
		 
		 
	 }
	}
