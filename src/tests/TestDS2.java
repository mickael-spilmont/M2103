package tests;

import entrainementDS2.Salle;
import entrainementDS2.Seance;

public class TestDS2 {
    public static int HORAIRE_MAX = 10;

    public static void main(String[] args) {
        Salle salle1 = new Salle("0A15", "Cour", 25);
        Salle salle2 = new Salle("4A28", "TP", 15);

        Seance seance1 = new Seance("POO", "TP", 4, 15);
        Seance seance2 = new Seance("Gestion", "Cour", 2, 20);
        Seance seance3 = new Seance("Reseau", "TP", 2, 15);
        Seance seance4 = new Seance("Math", "Cour", 4, 20);
        Seance seance5 = new Seance("Droit", "Cour", 2, 15);
        Seance seance6 = new Seance("Systeme", "TP", 4, 15);

        salle2.accueillir(seance1);
        salle1.accueillir(seance2);
        salle2.accueillir(seance3);
        salle1.accueillir(seance4);
        salle1.accueillir(seance5);
        salle2.accueillir(seance6);

        System.out.println(salle1);
        System.out.println(salle2);
    }
}
