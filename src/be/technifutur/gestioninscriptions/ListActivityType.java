package be.technifutur.gestioninscriptions;

import java.util.*;

public class ListActivityType {
    Map<String, ActivityType> activitytypelist; // = new HashMap<>();
    ActivityType activitytype;

    ListActivityType(){
        if(activitytypelist == null){
            activitytypelist = new HashMap<>();
            System.out.println("ListActivityType.constructor Création");
        }
        else
        {
            System.out.println("ListActivityType.constructor Pas de création");
        }
    }

    public ActivityType addActivityType(String name, boolean registrationRequired){
        if (activitytypelist.containsKey(name.toUpperCase())== true) {
            System.out.println(name + " existe déjà !");
//            activitytype = null;
        }
        else
        {
            activitytype = new ActivityType(name, registrationRequired);
            activitytypelist.put(name, activitytype);
            System.out.println(name + " enregistré !");
            lister();
        }

        return activitytype;
    }

    public ActivityType get(String name){
        if (activitytypelist.containsKey(name.toUpperCase())== true) {
            activitytype = activitytypelist.get(name);
        }
        else
        {
            System.out.println(name + " n'existe pas !");
            activitytype = null;
        }
        return activitytype;
    }

    public ActivityType remove(String name){
        if (activitytypelist.containsKey(name.toUpperCase())== true) {
            activitytype = activitytypelist.remove(name);
        }
        else
        {
            System.out.println(name + " n'existe pas !");
            activitytype = null;
        }
        return activitytype;
    }

    public void lister() {
        ActivityType p;
        for (Map.Entry<String, ActivityType> e:activitytypelist.entrySet()) {
            System.out.println(e.getKey());
            p = e.getValue();
            System.out.println("     " + p.name + " " + p.registration);
        }
    }
}
