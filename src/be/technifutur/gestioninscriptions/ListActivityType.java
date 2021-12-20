package be.technifutur.gestioninscriptions;

import java.util.*;

public class ListActivityType {
    Map<String, ActivityType> activitytypelist = new HashMap<>();
    ActivityType activitytype;

    //    public static void main(String[] args) {
//    }

    public ActivityType addActivityType(String name, boolean registrationRequired){
        if (activitytypelist.containsKey(name.toUpperCase())== true) {
            System.out.println(name + " existe déjà !");
            activitytype = null;
        }
        else
        {
            System.out.println(name + " enregistré !");
            activitytype = new ActivityType(name, registrationRequired);
            activitytypelist.put(name, activitytype);
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
        for (Map.Entry<String, List<ActivityType>> e : activitytypelist.entrySet()) {
            System.out.println(e.getKey());
            for (ActivityType p : e.getValue()) {
                System.out.println("     " + p);
            }
        }
    }
}
