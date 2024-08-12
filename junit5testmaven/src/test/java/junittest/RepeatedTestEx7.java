package junittest;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedTestEx7 {

	
	@RepeatedTest(3)
	void repeatedTest(TestInfo testInfo) {
	    System.out.println("Executing repeated test");
	 
	    assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
	}
	
	
	@RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
	void repeatedTestWithLongName() {
	    System.out.println("Executing repeated test with long name");
	 
	    assertEquals(2, Math.addExact(1, 1), "1 + 1 should equal 2");
	}
	
	@RepeatedTest(3)
	void repeatedTestWithRepetitionInfo(RepetitionInfo repetitionInfo) {
	    System.out.println("Repetition #" + repetitionInfo.getCurrentRepetition());
	 
	    System.out.println(repetitionInfo.getTotalRepetitions());
	    assertEquals(3, repetitionInfo.getTotalRepetitions());
	    
	}
}
