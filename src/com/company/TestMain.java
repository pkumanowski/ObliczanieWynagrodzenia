package com.company;

public class TestMain {

    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Tomasz");
        Wynagrodzenie wynagrodzenie = new Wynagrodzenie(pracownik, 18);
        wynagrodzenie.obliczWynarodzenieDzienne();
    }
}
