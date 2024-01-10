import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime string = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String fullTime = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(fullTime);
        String mediumTime = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(mediumTime);
        String shortTime = string.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(shortTime);
    }
}