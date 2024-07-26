package miscellaneous;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no1:");
		int no1 = sc.nextInt();
		System.out.println("enter no2:");
		int no2 = sc.nextInt();
		
		
		int r = add(no1,no2);
		System.out.println(r);
		sc.close();
		
		
		String greaterno = (no1>no2?"no1="+no1+"is gretaer":
			                        "no2="+no2+" is greater");
		System.out.println(greaterno);
		
		for(int i=1;i<=10;i++)
		{
			if(i==2)
			{
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=1;i<=10;i++)
		{
			if(i==2)
			{
				break;
			}
			System.out.println(i);
		}
		

	}
	
	 static int add(int n1,int n2)
	 {
		 return n1+n2;
	 }

}
