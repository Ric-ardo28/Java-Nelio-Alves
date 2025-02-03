package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class program {
    public static void main(String[] args) {


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-02-01");
        LocalDateTime d05 = LocalDateTime.parse("2025-02-01T01:02:03");
        Instant d06 = Instant.parse("2025-02-01T01:02:03Z");
        Instant d07 = Instant.parse("2025-02-01T01:02:03-03:00");
        LocalDate d08 = LocalDate.parse("01/02/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("01/02/2025 22:02:35", fmt2);
        LocalDate d10 = LocalDate.of(2025,  02, 01);
        LocalDateTime d11 = LocalDateTime.of(2025, 02, 01, 15, 46);



        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04.format(fmt1));
        System.out.println(fmt1.format(d04));
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(d05.format(fmt2));
        System.out.println(fmt3.format(d06));
        System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
        System.out.println(d11);
    }
}
