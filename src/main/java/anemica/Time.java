package anemica;

import java.time.LocalDate;

public class Time {
    LocalDate time;

    public Time() {
        this.time = LocalDate.now();
    }

    public LocalDate getTime() {
        return this.time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }
}
