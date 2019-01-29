package com.company;

import java.util.Scanner;

public class Wynagrodzenie {

    Pracownik pracownik;
    private double wynagrodzenie;
    private static final int PLACA_MINIMALNA = 12;
    private static final int NORMA_TYGODNIOWA= 40;
    private static final double NADGODZINY_RATE= 1.5;



    public Wynagrodzenie(Pracownik pracownik) {
        this.pracownik = pracownik;
    }

    public void obliczWynarodzenieDzienne(){

            wynagrodzenie = PLACA_MINIMALNA * NORMA_TYGODNIOWA;
            System.out.println("Bazowe wynagrodzenie: " + wynagrodzenie);


            System.out.println("Podaj nadgodziny");
            Scanner sc = new Scanner(System.in);
            int nadgodziny = sc.nextInt();
            if (nadgodziny <= 20) {
                wynagrodzenie = PLACA_MINIMALNA * NORMA_TYGODNIOWA + (nadgodziny * PLACA_MINIMALNA * NADGODZINY_RATE);
                System.out.println("Wynagrodzenie z nadgodzinami: " + wynagrodzenie);
            }
            else System.out.println("Podano wicej niż 20 nadgodzin, idź do domu");
        }


}
