package be.technifutur.gestioninscriptions;

import java.util.Scanner;

public class ListActivityVue {
    static Scanner es = new Scanner(System.in);

    public static String getname(){
        System.out.print("Saisir le nom de l'activité = ");
        return es.nextLine();
    }

    public static Boolean getregistration(){
        Boolean rv ;
        String reponse = "";

        System.out.print("Saisir la nécessité d'une registration = ");
        reponse = es.nextLine().toUpperCase();
        if (reponse.toUpperCase().equals("Y")) {
            rv = true;
        }
        else
        {
            rv = false;
        }
        return rv;
    }
}
