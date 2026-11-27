package org.lessons.java.oop.animals1;

import org.lessons.java.interfaces.INuotante;
import org.lessons.java.interfaces.IVolante;

public class Main {

    public static void main(String[] args) {

        AbstractAnimale aquila = new Aquila();

        AbstractAnimale cane = new Cane();

        AbstractAnimale delfino = new Delfino();

        AbstractAnimale passerotto = new Passerotto();

        IVolante aquila1 = new Aquila();
        IVolante passerotto1 = new Passerotto();
        INuotante delfino1 = new Delfino();

        faiVolare(aquila1);
        faiVolare(passerotto1);

        faiNuotare(delfino1);

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

    public static void faiVolare(IVolante animale) {
        animale.vola();
    }

    public static void faiNuotare(INuotante animale) {
        animale.nuota();
    }
}
