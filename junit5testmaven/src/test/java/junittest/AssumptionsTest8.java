package junittest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.*;

/*Exception Testing:
 * If an assumption fails, a TestAbortedException is thrown and the test is 
 * simply skipped.

Assumptions also understand lambda expressions.

 */

class AssumptionsTest8 {

	
	//In this case, if the condition doesn't hold test will be aborted
	@Test
	@DisplayName("This test is only run on Monday")
	public void testAdd_OnlyOnFriday() {
	  LocalDateTime ldt = LocalDateTime.now();
	  assumeTrue(ldt.getDayOfWeek().getValue() == 1,"assumption failed test skipped day is not monday");
	  // Remainder of test (only executed if assumption holds)...
	    assertEquals("namrata".length(),7,"name is not 7 char long");
	}
	
	
	/*
	 * Note that everything after the lambda will execute, 
	 * regardless of whether the assumption in assumingThat() holds.
	 */
	@Test
	@DisplayName("This test is only run on Fridays (with lambda)")
	public void testAdd_OnlyOnFriday_WithLambda() {
	  LocalDateTime ldt = LocalDateTime.now();
	 
	  assumingThat(ldt.getDayOfWeek().getValue() == 5,
	      () -> {
	        // Execute this if assumption holds...
	    	  assertEquals("namrata".length(),7,"name is not 7 char long");
	      });
	  // Execute this regardless
	  int[] arr = {4,5,6};
	  assertEquals(arr.length,3,"array size is not 3");
	}
	
	@Test
	void falseAssumption() {
	   // assumeFalse(0 < 1);
		assumeFalse(5 < 1);
	    assertEquals(5 + 2, 7);
	}

	@Test
	void assumptionThat() {
	    String someString = "Just a string";
	    assumingThat(
	        someString.equals("Just a string"),
	        () -> assertEquals(2 + 2, 4)
	    );
	}
}
