package arrayassignment;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int size = sc.nextInt();
		ArrayStore ob = new ArrayStore(size);
		
		for(int i=0;i<ob.getArrSize();i++)
		{
		  System.out.println("enter element arr["+i+"]");
		  int ele = sc.nextInt();
		  ob.pushElement(ele,i);
		  
		}
		
		ob.displayArr();
		System.out.println(ob);
		
		ob.insertEle(3,13);
		ob.displayArr();

	}

}
