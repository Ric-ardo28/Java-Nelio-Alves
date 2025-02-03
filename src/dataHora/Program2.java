package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program2 {
	public static void main(String[] args) {


		LocalDate d04 = LocalDate.parse("2025-02-01");
		LocalDateTime d05 = LocalDateTime.parse("2025-02-01T01:02:03");
		Instant d06 = Instant.parse("2025-02-01T01:02:03Z");
		String a = "Argentina";
		for(String s : ZoneId.getAvailableZoneIds()){
			if(s.equals(a)){
				System.out.println(s);
			}


		}
	}
}
