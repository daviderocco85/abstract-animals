package org.lessons.java.oop.animals1;

import org.lessons.java.interfaces.INuotante;

public class Delfino extends AbstractAnimale implements INuotante {

    @Override
    public void verso() {
        System.out.println("Il delfino schiocca!");
    }

    @Override
    public void mangia() {
        System.out.println("Il delfino mangia gamberetti!");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }

}
