package org.lessons.java.oop.animals1;

public class Main {

    public static void main(String[] args) {

        AbstractAnimale aquila = new Aquila();

        AbstractAnimale cane = new Cane();

        AbstractAnimale delfino = new Delfino();

        AbstractAnimale passerotto = new Passerotto();

        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        cane.dormi();
        cane.verso();
        cane.mangia();

        delfino.dormi();
        delfino.verso();
        delfino.mangia();

        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();
    }
}
