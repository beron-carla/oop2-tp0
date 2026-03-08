package anemica;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Time time = new Time();
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        String longFormat = time.getTime().format(formatoLargo);
        System.out.println("Formato largo: " + longFormat);

        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("dd/MM/yyy");
        String shortFormat = time.getTime().format(formatoCorto);
        System.out.println("Formato corto: " + shortFormat);
        

    }
}
