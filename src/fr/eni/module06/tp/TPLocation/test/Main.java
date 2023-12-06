package fr.eni.module06.tp.TPLocation.test;

import fr.eni.module06.tp.TPLocation.bo.Cycle;
import fr.eni.module06.tp.TPLocation.bo.Gyropode;
import fr.eni.module06.tp.TPLocation.bo.Gyroroue;
import fr.eni.module06.tp.TPLocation.bo.Velo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cycle[] aLouer = {
                new Velo("Lapierre", "Speed 400", LocalDate.of(2021, 6, 2), 1),
                new Velo("Btwin", "Riverside 900", LocalDate.of(2018, 6, 2), 10),
                new Gyropode("Weebot", "Echo", LocalDate.of(2018, 6, 3), 35, 160),
                new Gyropode("Segway", "Ninebot Elit", LocalDate.of(2017, 6, 5), 40, 150),
                new Gyroroue("Immotion", "V8", LocalDate.of(2018, 6, 5), 40),
                new Gyroroue("Segway", "Ninebot one E+", LocalDate.of(2017, 6, 5), 30)
        };

        for (Cycle cycle : aLouer) {
            String formate = String.format("%-66s  %5.2f€/heure %n", cycle, cycle.getTarifLocationHeure());
            System.out.printf("%-66s  %5.2f€/heure %n", cycle, cycle.getTarifLocationHeure());
        }

    }

}
