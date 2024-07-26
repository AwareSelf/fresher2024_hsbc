package miscellaneous;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("enter jsut firstname:");
		String s = sc.next();
		System.out.println(s);
		*/
		String yesno = "yes";
		do
		{
		System.out.println("enter line");
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("do u wish to continue:(y/n):");
		 yesno = sc.nextLine();
		
		}while(yesno.charAt(0)=='y');
		
		sc.close();
		

	}

}
