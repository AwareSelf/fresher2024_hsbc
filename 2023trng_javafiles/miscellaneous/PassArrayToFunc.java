package miscellaneous;

public class PassArrayToFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr;
		arr = new int[5];
		
		
		for(int n:arr)
		{
			System.out.println(n);
		}
		
		func(arr);
		
		for(int n:arr)
		{
			System.out.println(n);
		}
		
	}
	
	static void func(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i] += 5;
		}
	}

}
