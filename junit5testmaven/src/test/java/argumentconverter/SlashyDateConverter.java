package argumentconverter;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SlashyDateConverter implements ArgumentConverter {
	
	   @Override
	    public Object convert(Object source, ParameterContext context)
	      throws ArgumentConversionException {
	        if (!(source instanceof String)) {
	            throw new IllegalArgumentException(
	              "The argument should be a string: " + source);
	        }
	        try {

	        	String s = (String)source;
	        //	System.out.println("Date String:"+source);
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	            LocalDate date = LocalDate.parse(s,formatter);
	            return date;
	        } catch (Exception e) {
	            throw new IllegalArgumentException("Failed to convert", e);
	        }
	    }

}
