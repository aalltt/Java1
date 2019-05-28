package lesson1_5;

public class Sotrudnik {
    String FIO, doljnost;
    int telefon, zarplata, vozrast;

    public Sotrudnik(String FIO, String doljnost, int telefon, int zarplata, int vozrast) {
        this.FIO = FIO;
        this.doljnost = doljnost;
        this.telefon = telefon;
        this.zarplata = zarplata;
        this.vozrast = vozrast;
    }

    public void info() {
        System.out.println(FIO + " " + doljnost + " " + telefon + " " + zarplata + " " + vozrast);
    }

    public void infovozrast() {
        if (vozrast > 40) {
            System.out.println(FIO + " старше 40");
        }
        System.out.println();
    }

}


