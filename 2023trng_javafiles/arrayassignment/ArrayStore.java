package arrayassignment;

public class ArrayStore {
	
	int[] arr ;
	int lastIndex;
	
	ArrayStore(int size)
	{
		this.arr = new int[size];
		
	}
	
	void pushElement(int e)
	{
		if(this.lastIndex <  this.arr.length)
		{
		 arr[this.lastIndex] = e;
		 this.lastIndex++;
		}
		
	}
	
	void pushElement(int e,int index)
	{
		if(index < this.arr.length)
		{ 
			arr[index] = e;
		}
	    this.lastIndex = this.getArrSize() -1;
	}
	
	int getArrSize()
	{
		return  this.arr.length;
	}
	
	void insertEle(int index,int ele)
	{
		if(index <  this.getArrSize())
		{
				
		int[] arr1 = new int[this.getArrSize()+1];
		
		for(int i=0;i< arr1.length;i++)
		{
			if(i< index)
			{
				arr1[i]= arr[i];
			}
			else if(i==index)
			{
				arr1[i]=ele;
			}
			else
			{
				arr1[i]= arr[i-1];
			}
		}
		
		this.arr = arr1;
		}
		else
		{
			System.out.println("index to insert should be less than array size:"+this.getArrSize());
		}
	}
	
	void displayArr()
	{
		for(int e: this.arr)
		{
			System.out.println(e);
		}
	}
	

	public String toString()
	{
		String strarr="";
		StringBuilder sb = new StringBuilder(strarr);
		for(int e: this.arr)
		{
			
			sb.append(e);
			sb.append(",");
		}
		
		strarr = sb.toString();
		return "arr="+strarr+"\n lastIndex="+this.lastIndex;
	}

}
