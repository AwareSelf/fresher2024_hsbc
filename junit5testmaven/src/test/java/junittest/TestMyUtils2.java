package junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMyUtils2 {


	
	@DisplayName("test add method of MyUtils class")
	@Test
	void testMyUtils() {
		
		MyUtils ob = new MyUtils();
		int result = ob.add(10,20);
		//System.out.println(result);
		assertEquals(30,result,"add method of MyUtils failed");
	}

}
