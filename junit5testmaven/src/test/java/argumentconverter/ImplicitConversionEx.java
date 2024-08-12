package argumentconverter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImplicitConversionEx {

	@ParameterizedTest
	@CsvSource({"APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"}) // Pssing strings
	void someMonths_Are30DaysLongCsv(Month month) {
	    final boolean isALeapYear = false;
	    assertEquals(30, month.length(isALeapYear));
	}
	
	@ParameterizedTest
	@CsvSource({"2018-12-25,2018", "2019-11-02,2019"})
	void getYear_ShouldWorkAsExpected(LocalDate date, int expected)
	{
	    assertEquals(expected, date.getYear());
	}
	
	/*
	This seems like it shouldn't work, but it somehow does.

	JUnit 5 converts the String arguments to the specified enum type. To support use cases like this, 
	JUnit Jupiter provides a number of built-in implicit type converters.

	The conversion process depends on the declared type of each method parameter. 
	The implicit conversion can convert the String instances to types such as the following:

	UUID 
	Locale
	LocalDate, LocalTime, LocalDateTime, Year, Month, etc.
	File and Path
	URL and URI
	Enum subclasses
    */
}
