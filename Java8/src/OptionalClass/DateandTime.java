package OptionalClass;

import java.time.LocalDate;
import java.time.*;

public class DateandTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date=LocalDate.of(2024,7,16);
		System.out.println(date);
		LocalTime time=LocalTime.of(14, 30, 45);
		System.out.println(time);
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
	}

}
