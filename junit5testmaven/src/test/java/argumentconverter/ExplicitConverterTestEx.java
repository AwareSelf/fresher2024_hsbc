package argumentconverter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExplicitConverterTestEx {

	/*
	We sometimes need to provide a custom and explicit converter for arguments.

	Suppose we want to convert strings with the yyyy/mm/dd format to LocalDate instances.

	First, we need to implement the ArgumentConverter interface:

    */
	
	 
	
	//Then we should refer to the converter via the @ConvertWith annotation:

	@ParameterizedTest
	@CsvSource({"2018/12/25,2018", "2019/02/11,2019"})
	void getYear_ShouldWorkAsExpected(
	  @ConvertWith(SlashyDateConverter.class) LocalDate date, int expected) {
	    assertEquals(expected, date.getYear());
	}


}
