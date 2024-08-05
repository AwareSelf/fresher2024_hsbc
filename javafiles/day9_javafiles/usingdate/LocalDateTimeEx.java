package usingdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());


		LocalDate joiningdt = LocalDate.of(2023, 8, 27);
		System.out.println(joiningdt);
		
		LocalDateTime dt = LocalDateTime.of(2024,7,24,9,30,30);
		System.out.println(dt);

		Emp e = new Emp(1,"Ram",5000,joiningdt);
		System.out.println(e);
		
		
		LocalDate d1 = LocalDate.now();
		System.out.println(d1);
		
		e.setJoiningDate(d1);
		System.out.println(e);
		
		
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		LocalDateTime tt = LocalDateTime.now();
		System.out.println(tt);
		
		dt = LocalDateTime.of(2023,8,27,15,30,10);
		System.out.println(dt);
		
		// to print Date to String conversion in a particular format
		
		//Step1: create a pattern using DateTimeFormatter
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		
		//step 2: create LocalDate based on LocalDate.of() or LocalDate.now();
		LocalDate bday = LocalDate.of(2023,8,26);
		
					
		//step 3:date -> string
		//pass that pattern to LocalDate format method - it will return you date-time-string in specified format
		String formatedDate = bday.format(pattern);
		System.out.println("in formatted manner "+
											formatedDate);


		//String to LocalDate conversion - use parse method of LocalDate
		String mydate = "2023-07-27"; //take this using Scanner
	;
		LocalDate dd = LocalDate.parse(mydate);
		System.out.println(dd);
		System.out.println(dd.getYear());
		 
		String mydate1 = "27/07/2023";
		//use pattern whn string not in a standard date format
		DateTimeFormatter pat1 =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dd1 =  LocalDate.parse(mydate1, pat1); 
		System.out.println(dd1);
		System.out.println(dd1.getYear());

				

	}

}
