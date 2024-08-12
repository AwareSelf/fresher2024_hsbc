package junittest;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(OrderAnnotation.class)
class TestExecutionOrderEx5 {

	  
	  @Test
	  @Order(1)
	  void test_Add() {
	    System.out.println("test_Add()");
	    assertEquals(5, Math.addExact(3, 2));
	  }
	  
	  @Test
	  @Order(2)
	  void test_Multiply() {
	    System.out.println("test_Multiply()");
	    assertEquals(15, Math.multiplyExact(3, 5));
	  }
	  @Test
	  @Order(4)
	  void test_Devide() {
	    System.out.println("test_Devide()");
	    assertEquals(5, Math.floorDiv(25, 5));
	  }
	  
	  @Test
	  @Order(3)
	  void test_Absolute() {
	    System.out.println("test_IsPrime()");
	    assertEquals(13,Math.abs(-13));
	  }
 }


