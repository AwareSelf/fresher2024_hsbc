package singleton;

public class Restaurant {
	
	private String name;
	// other private properties can go here
	
	static private Restaurant obj = null;
	
	
	static Restaurant getSingleton()
	{
		if(obj==null)
		{
			obj = new Restaurant("Maharashtra Lunch Home");
		}
		
		return obj;
	}
		
	private Restaurant(String name)
	{
		this.name = name;
	}
	
	//all member methods can be coded here
	public String toString()
	{
		return "Restaurant name="+this.name;
	}
}
