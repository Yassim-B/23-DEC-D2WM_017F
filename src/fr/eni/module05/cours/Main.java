package fr.eni.module05.cours;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Override toString()
        Client c = new Client("DUPONT","Jean", "02465465");
       // System.out.println(c.toString());

        // Transtypage impl

        int n;
        float f;
        n = 3;
        f = n;

        // Trantypage expl

        int e;
        float g;
        g = 3.69f;
        e = (int) g;

        Animal animal = new Animal();
        animal.crier(); // affiche "un cri d'animal"
        Chat chat = new Chat();
        chat.crier();   // affiche "Miaou !"

        Chien chien = new Chien();
        chien.crier();  // affiche "Whouaf whouaf !"

        animal = chat;
        animal.crier(); // affiche "Miaou !"

        animal = chien;
        animal.crier(); // affiche "Whouaf whouaf !"


    }
    }
