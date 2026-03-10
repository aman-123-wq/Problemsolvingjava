package student;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class packagetimeformat {
	public static String timeconversion(String s) {
		DateTimeFormatter input=DateTimeFormatter.ofPattern("hh:mm:ssa");
		DateTimeFormatter out=DateTimeFormatter.ofPattern("HH:MM:SS");
		LocalTime t=LocalTime.parse(s,input);
		
		return t.format(out);
	}

}
