package miscellaneous;

import classesobjects.Emp;

public class ArrayEx {

	public static void main(String[] args) {
				
		int[] arr;
		arr = new int[5];
		
		//iterate array using index notation
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		int[] arr1 = {4,3,2,5};
		
		//enhanced for loop
		for(int ob : arr1)
		{
			System.out.println(ob);
		}
		
		String[] strarr =  { "avc","vvv","ghjj"};
		for(String ob : strarr)
		{
			System.out.println(ob);
		}
		
		String[] strarr1 = new String[4];
		strarr1[0] = "xxx";
		strarr1[1] = "zzz";
		for(String ob : strarr1)
		{
			System.out.println(ob);
		}
		
		Emp[] emparr = new Emp[3];
		emparr[0] = new Emp();
		emparr[1] = new Emp(11,"Mita",5000);
		for(Emp  x : emparr)
		{
			if(x!=null)
			{
			 x.setEmpSal(x.getEmpSal()+1000);
			}
			 System.out.println(x);
		}
		
		System.out.println("***Emp 2d array***");
		Emp[][] empar = new Emp[3][];
		empar[0] =  new Emp[3]; // 1-d array of 3 emp references
		empar[0][0] = new Emp(1,"Ram",5000);
		empar[0][1] = new Emp(2,"Shyam",10000);
	   //empar[0][2] ref of Emp is null
		
		empar[1] = new Emp[2]; //// 1-d array of 2 emp references
		empar[1][0] = new Emp(11,"Mita",15000);
		empar[1][1] =  new Emp(12,"Geeta",17000);
		
		//empar[2] , the third 1-d array reference is null 
		
		 
		for(Emp[] a :empar)
		{
		  if(a!=null)
		  {
			for(Emp x : a)
			{
				if(x!=null)
				{
				  System.out.println(x.getEmpSal());
				  System.out.println(x);
				}
			}
		  }
		}
		
	
		int[][] arrint = new int[3][3];
		
		for(int i=0;i< arrint.length;i++)
		{
			for(int j=0;j< arrint[i].length;j++)
			{
				arrint[i][j] = 4;
			}
		}
		
		
	}

}
