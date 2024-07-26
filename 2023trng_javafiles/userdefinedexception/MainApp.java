package userdefinedexception;

import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String yesno = "no";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter account details");
		System.out.println("account id=");
		
		int acctid = sc.nextInt();
		
		System.out.println("account balance=");
		
		double bal = sc.nextDouble();
		
		Account ob = new Account(acctid,bal);
		
		System.out.println("your account is created.check account details as below:-");
		System.out.println(ob);
		
		do
		{
		   System.out.println("enter the amount to be withdrawn for accountid = 1:");
		   double amt = sc.nextDouble();
		   
		   try
		   {
		     ob.withdraw(amt);
		   }
		   catch(InsufficientBalance ex)
		   {
			  System.out.println(ex.getMessage());
			  System.out.println(ex);
			   break;
		   }
		   System.out.println("balance after withdrawing the amount:"+ ob.getBal());
		   
		  System.out.println("do you wish to withdraw more:(yes/no):");
		  
		  yesno = sc.next();
		  
		}while(yesno.equals("yes"));
		
		

	}

}
