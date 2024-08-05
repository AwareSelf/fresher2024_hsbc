package usingdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());


		LocalDate joiningdt = LocalDate.of(2023, 8, 27);
		System.out.println(joiningdt);
		
		LocalDateTime dt = LocalDateTime.of(2024,7,24,9,30,30);
		System.out.println(dt);


		//Step1: create a pattern using DateTimeFormatter
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

		//step 2:date -> string
		//pass that pattern to LocalDate format method - it will return you date-time-string in specified format
		String formatedDate = dt.format(pattern);
		System.out.println("in formatted manner "+formatedDate);


		pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(joiningdt.format(pattern));


		//String (date) --> LocalDate
		String sdt = "2024-08-05";
		LocalDate dx = LocalDate.parse(sdt);
		System.out.println(dx);
		System.out.println(dx.getYear());
		System.out.println(dx.getDayOfWeek());

		//String (date) --> LocalDate
		String sdt1 = "2024/08/05";
		pattern = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(joiningdt.format(pattern));

		LocalDate dx1 = LocalDate.parse(sdt1,pattern);
		System.out.println("LocalDate:"+dx1);
		System.out.println(dx1.getYear());
		System.out.println(dx1.getDayOfWeek());


		// create an LocalDateTime object
		LocalDateTime mydatetime = LocalDateTime.now();
		System.out.println(mydatetime);

		String mydattm = mydatetime.toString(); //2024-08-05T15:39:15.840060
		LocalDateTime lt = LocalDateTime.parse(mydattm);
		System.out.println("LocalDateTime : "+ lt);


		// create a formatter
		DateTimeFormatter formatter	= DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		// create an LocalDateTime object and
		LocalDateTime lt1 = LocalDateTime.parse("2018-12-30T19:34:50.63",formatter);
		System.out.println("LocalDateTime : "+ lt1);
		System.out.println("date:"+lt1.getDayOfMonth());

		String datetime = "2024/08/05 03:01:40";
		DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime dtime = LocalDateTime.parse(datetime,pattern1);
		System.out.println(dtime);

		datetime = "2024/08/05 03:01 PM";
		pattern1 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm a");
		dtime = LocalDateTime.parse(datetime,pattern1);
		System.out.println(dtime);





				

	}

}
