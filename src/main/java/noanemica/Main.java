package noanemica;

public class Main {
    public static void main(String[] args) {
        Time tiempo = new Time();
        System.out.println("Formato largo: " + tiempo.formatoLargo());
        System.out.println("Formato corto: " + tiempo.formatoCorto());
    }
}