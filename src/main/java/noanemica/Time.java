package noanemica;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Time {
    LocalDate date;

    public Time() {
        this.date = LocalDate.now();
    }

    public String formatoLargo() {
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        String largeFormat = this.date.format(formatoLargo);
        return largeFormat;
    }

    public String formatoCorto() {
        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String shortFormat = this.date.format(formatoCorto);
        return shortFormat;
    }
}
