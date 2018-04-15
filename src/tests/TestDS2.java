package tests;

import entrainementDS2.Salle;
import entrainementDS2.Salles;
import entrainementDS2.Seance;

import java.util.ArrayList;
import java.util.List;

public class TestDS2 {
    public static int HORAIRE_MAX = 10;

    public static void main(String[] args) {
        List<Seance> seances = new ArrayList<>();

        Salles salles = new Salles();

        Salle salle1 = new Salle("0A15", "Cour", 25);
        Salle salle2 = new Salle("4A28", "TP", 15);

        salles.ajouterSalle(salle1);
        salles.ajouterSalle(salle2);


        seances.add(new Seance("POO", "TP", 4, 15));
        seances.add(new Seance("Gestion", "Cour", 2, 20));
        seances.add(new Seance("Reseau", "TP", 2, 15));
        seances.add(new Seance("Math", "Cour", 4, 20));
        seances.add(new Seance("Droit", "Cour", 2, 15));
        seances.add(new Seance("Systeme", "TP", 4, 15));
        seances.add(new Seance("COO", "TP", 4, 15));
        seances.add(new Seance("Algo", "TP", 4, 15));
        seances.add(new Seance("Projet", "TP", 4, 15));
        seances.add(new Seance("Anglais", "Cour", 2, 15));

        System.out.println(salles.planifier(seances));

        System.out.println(salles);
    }
}
