package fr.eni.module09.cours;

import java.util.Hashtable;
import java.util.Map;

public class Dictionnaire {

    public static void main(String[] args) {

        Map<Integer, String> ht = new Hashtable<>();

        // Ajouter un élement dans la map
        ht.put(1, "premier");

        // Vérification d'état de ma map
        System.out.println(ht);
        System.out.println(ht.get(1));
        System.out.println(ht.isEmpty());
        System.out.println(ht.size());

        // Ecraser la valeur deux de la clé 1
        ht.put(1, "deux");
        System.out.println(ht.get(1));

        // Ajouter un nouvel élément avec la valeur "deux"
        ht.put(2, "deux");
        System.out.println(ht);


        // N.B - Dans une map,
        // impossible de créer plusieurs clés identiques
        // Les valeurs peuvent l'être


        // A bannir
        Map<Integer, Map<Integer, Integer>> ht2 = new Hashtable<>();


    }
}
