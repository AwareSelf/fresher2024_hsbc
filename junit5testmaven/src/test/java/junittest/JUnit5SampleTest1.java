package junittest;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;


//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;


//@RunWith(JUnitPlatform.class)
@DisplayName("Testing using JUnit 5")
public class JUnit5SampleTest1 {
	
	// private static final Logger log = LoggerFactory.getLogger(junitbasictest.JUnit5Sample1Test.class);

	  @BeforeAll
	  static void beforeAll() {
	    System.out.println("**--- Executed once before all test methods in this class ---**");
	  }

	  @BeforeEach
	  void beforeEach() {
	    System.out.println("**--- Executed before each test method in this class ---**");
	  }

	  @Test
	  void testMethod1() {
	    System.out.println("**--- Test method1 executed ---**");
	    
	    
//	    log.info("As written, this test will always pass!");
	    Assertions.assertEquals(4, (2 + 2));
	  }

	  @DisplayName("Test method2 with condition")
	  @Test
	  void testMethod2() {
	    System.out.println("**--- Test method2 executed ---**");
	  }

	  @Test
	  @Disabled("implementation pending")
	  void testMethod3() {
		  System.out.println("**--- Test method3 executed ---**");
	  }
	  
	  @Test
	  @DisplayName("Dummy test")
	  void dummyTest() {
	    int expected = 4;
	    int actual = 2 + 2;
	    Assertions.assertEquals(expected, actual, "INCONCEIVABLE!");
	    //
	    Object nullValue = null;
	    assertFalse(nullValue != null);
	    assertNull(nullValue);
	    assertNotNull("A String", "INCONCEIVABLE!");
	    assertTrue(nullValue == null);
	    
	 }
	  
	  @Test
	  @DisplayName("Dummy test1")
	  void dummyTest1() {
	    int expected = 4;
	    int actual = 2 + 2;
	    Object nullValue = null;
	   
	   
	    assertAll(
	        "Assert All of these",
	        () -> Assertions.assertEquals(expected, actual, "INCONCEIVABLE!"),
	        () -> assertFalse(nullValue != null),
	        () -> assertNull(nullValue),
	        () -> assertNotNull("A String", "INCONCEIVABLE!"),
	        () -> assertTrue(nullValue == null));
	    
	    
	    /*
	     * The cool thing about assertAll() is that all of the assertions contained 
	     * within it are performed, even if one or more of them fail. 
	     * Contrast this to the code in previous test, where if any assertion fails, 
	     * the test fails at that point, meaning no other assertions will be performed.
	     */
	  }

	  @AfterEach
	  void afterEach() {
	    System.out.println("**--- Executed after each test method in this class ---**");
	  }

	  @AfterAll
	  static void afterAll() {
	    System.out.println("**--- Executed once after all test methods in this class ---**");
	  }


	}