package be.technifutur.gestioninscriptions;

import javax.swing.*;
import java.util.*;

public class ListActivityType {
    public ArrayList<ActivityType> activitytypelist; // = new HashMap<>();
    public ActivityType activitytype;
    private IOData io;
    private Boolean found = false;
    MyData dt;

    ListActivityType(){
        io = new IOData();
        dt = io.LoadData();
    }

    public ActivityType addActivityType(String name, boolean registrationRequired){
        found = false;

//        System.out.println("Taille du fichier = " + dt.listactivity.size());
        for (ActivityType activitytype : dt.listactivity) {
            if (activitytype.name.equals(name)) {
                System.out.println(name + " existe déjà !");
                found = true;
                break;
            }
        }
        if (!found) {
            activitytype = new ActivityType(name, registrationRequired);
            dt.listactivity.add(activitytype);
//            System.out.println("Taille du fichier mémoire = " + dt.listactivity.size());
//            lister();
            System.out.println(name + " enregistré !");
            io.SaveData();
//            System.out.println("Données sauvegardées");
        }
        else
        {
            activitytype = null;
        }
        return activitytype;
    }

    public ActivityType getActivityType(String name){
        Integer i;

        found = false;

        for (i = 0;i < dt.listactivity.size();i++) {
            if (dt.listactivity.get(i).name.equals(name)){
                this.activitytype = dt.listactivity.get(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Nom de l'activité = " + this.activitytype.name);
            System.out.println("Registration nécessaire = " + this.activitytype.registration);
        }
        else
        {
            System.out.println("Pas trouvé !");
        }
        return activitytype;
    }

    public ActivityType removeActivityType(String name){
        String confirm = "N";
        Scanner sc=new Scanner(System.in);
        Integer i;

        found = false;

        for (i = 0;i < dt.listactivity.size();i++) {
            if (dt.listactivity.get(i).name.equals(name)){
                this.activitytype = dt.listactivity.get(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Nom de l'activité = " + this.activitytype.name);
            System.out.println("Registration nécessaire = " + this.activitytype.registration);
            System.out.println("");
            System.out.print("Confirmez la suppression (Y/N) ");
            confirm = sc.nextLine();
            if (confirm.toUpperCase().equals("Y")){
                dt.listactivity.remove(i);
                System.out.println(this.activitytype.name + " est effacée !");
                io.SaveData();
            }
        }
        else
        {
            System.out.println("Pas trouvé !");
        }
        return activitytype;
    }

}
