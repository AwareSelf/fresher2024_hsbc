package functionalinterfaceex.usinglambda2;

interface Cal{
	int sum(int a, int b);
}

public class Main {  
	public static void main(String[] args){
		
		 Cal cal1 = (a, b)-> a+b;		
		 int result1 = cal1.sum(10, 20);
		 System.out.println(result1);
		 
		 Cal cal2 = (int a, int b)-> a+b;		
		 int result2 = cal2.sum(10, 20);
		 System.out.println(result2);
		
		  var x = 10;
		  
		  
		//java 11 - you can use var keyword in lambda function args
		 Cal cal3 = (var a, var b)-> a+b;		
		 int result3 = cal3.sum(10, 20);
		 System.out.println(result3);
		 
		 
		
	}        
}