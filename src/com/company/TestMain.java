package com.company;

public class TestMain {

    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Tomasz");
        Wynagrodzenie wynagrodzenie = new Wynagrodzenie(pracownik);
        wynagrodzenie.obliczWynarodzenieDzienne();
    }
}
