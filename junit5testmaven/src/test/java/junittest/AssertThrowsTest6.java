package junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class MyMath
{
	public static void add(long[] arr)
	{
		if(arr.length<1)
		{
			throw new IllegalArgumentException();
		}
	}
}

class AssertThrowsTest {

	@Test()
	@DisplayName("Empty argument")
	public void testAdd_ZeroOperands_EmptyArgument() {
	  long[] numbersToSum = {};
	  assertThrows(IllegalArgumentException.class,
			  ()-> MyMath.add(numbersToSum));
	}
	
	//below test will fail as it expects the exception to be thrown
	@Test()
	@DisplayName("NonEmpty argument")
	public void testAdd_ZeroOperands_NonEmptyArgument() {
	  long[] numbersToSum = {10,20};
	  assertThrows(IllegalArgumentException.class,
			  ()-> MyMath.add(numbersToSum));
	}
	
	@Test
	void shouldThrowException() {
	    Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
	      throw new UnsupportedOperationException("Not supported");
	    });
	    assertEquals("Not supported", exception.getMessage());
	}

	@Test
	void assertThrowsException() {
	    String str = null;
	    assertThrows(IllegalArgumentException.class, () -> {
	      Integer.valueOf(str);
	    });
	}

}
