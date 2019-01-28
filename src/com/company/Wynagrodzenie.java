package com.company;

public class Wynagrodzenie {

    Pracownik pracownik;
    private static final int placaMinimalna = 12;
    private static final int normaTygodniowa= 40;
    private static final double nadgodzinyRate= 1.5;
    private double nadgodziny;


    public Wynagrodzenie(Pracownik pracownik, double nadgodziny) {
        this.pracownik = pracownik;
        this.nadgodziny = nadgodziny;
    }

    public void obliczWynarodzenieDzienne(){
        double wynagrodzenie;
        if (normaTygodniowa == 40) {
            wynagrodzenie = placaMinimalna * normaTygodniowa;
            System.out.println("Bazowe wynagrodzenie: " + wynagrodzenie);
        }
        if (normaTygodniowa == 40 && nadgodziny <= 20){
            wynagrodzenie = placaMinimalna * normaTygodniowa + (nadgodziny * placaMinimalna * nadgodzinyRate);
            System.out.println("Wynagrodzenie z nadgodzinami: " + wynagrodzenie);
        }
        else System.out.println("Podano wicej niż 20 nadgodzin, idź do domu");
    }
}
